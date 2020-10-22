package com.dev.water_query.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListView;

import com.dev.water_query.R;
import com.dev.water_query.adapter.SimpleListVideoModeAdapter;
import com.dev.water_query.entity.NoticeEntity;
import com.shuyu.gsyvideoplayer.GSYVideoManager;

import java.util.ArrayList;


public class VideoListFragment extends Fragment {

    private View mRootView;
    ListView videoList;
    SimpleListVideoModeAdapter listNormalAdapter;

    public VideoListFragment() {

    }

    public VideoListFragment(ArrayList<NoticeEntity> mListVideoEntities3, FragmentActivity activity) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_video_list, container, false);

        initView(inflater,container);
        initData();
        setListener();

        return mRootView;
    }


    private void initData() {
        listNormalAdapter = new SimpleListVideoModeAdapter(getContext());
        videoList.setAdapter(listNormalAdapter);
    }

    private void initView(LayoutInflater inflater, ViewGroup container) {
        videoList = mRootView.findViewById(R.id.video_list);
    }

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
                    if (GSYVideoManager.instance().getPlayTag().equals(SimpleListVideoModeAdapter.TAG)
                            && (position < firstVisibleItem || position > lastVisibleItem)) {
                        if(GSYVideoManager.isFullState(getActivity())) {
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