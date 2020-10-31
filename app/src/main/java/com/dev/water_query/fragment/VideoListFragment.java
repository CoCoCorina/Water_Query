package com.dev.water_query.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.dev.water_query.R;
import com.dev.water_query.adapter.VideoListAdapter;
import com.dev.water_query.entity.NoticeEntity;
import com.shuyu.gsyvideoplayer.GSYVideoManager;

import java.util.ArrayList;

/**
 * @version: v1.0
 * @ClassName: VideoListFragment
 * @Package: com.dev.water_query.fragment
 * @Description: 视频展示 碎片
 * @author: Corina
 * @date: 2020/10/22 20:36
 */
public class VideoListFragment extends Fragment {

    //View
    private View mRootView;
    ListView videoList;

    //Adapter
    VideoListAdapter listNormalAdapter;

    public VideoListFragment(ArrayList<NoticeEntity> mListVideoEntities1, FragmentActivity activity) {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_video_list, container, false);

        initView(inflater, container);
        initData();
        setListener();

        return mRootView;
    }

    //初始化数据
    private void initData() {
        listNormalAdapter = new VideoListAdapter(getContext());
        videoList.setAdapter(listNormalAdapter);
    }

    //初始化视图
    private void initView(LayoutInflater inflater, ViewGroup container) {
        videoList = mRootView.findViewById(R.id.video_list);
    }

    //设置监听
    private void setListener() {
        videoList.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                int lastVisibleItem = firstVisibleItem + visibleItemCount;
                //大于0说明有播放
                if (GSYVideoManager.instance().getPlayPosition() >= 0) {
                    //当前播放的位置
                    int position = GSYVideoManager.instance().getPlayPosition();
                    //对应的播放列表TAG
                    if (GSYVideoManager.instance().getPlayTag().equals(VideoListAdapter.TAG)
                            && (position < firstVisibleItem || position > lastVisibleItem)) {
                        if (GSYVideoManager.isFullState(getActivity())) {
                            return;
                        }
                        //如果滑出去了上面和下面就是否，和今日头条一样
                        GSYVideoManager.releaseAllVideos();
                        listNormalAdapter.notifyDataSetChanged();
                    }
                }
            }
        });
    }

}