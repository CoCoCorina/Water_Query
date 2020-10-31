package com.dev.water_query.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.dev.water_query.R;
import com.dev.water_query.adapter.ViewPagerAdapter;
import com.dev.water_query.entity.NoticeEntity;

import java.util.ArrayList;

/**
 * @version: v1.0
 * @ClassName: VideosFragment
 * @Package: com.dev.water_query.fragment
 * @Description: 视频页
 * @author: Corina
 * @date: 2020/10/22 20:35
 */
public class VideosFragment extends Fragment implements View.OnClickListener {

    //View
    private View mRootView;
    private TextView mBtnLive, mBtnTips, mBtnCulture;
    private ViewPager mVpVideoContent;

    //adapter
    private ViewPagerAdapter mAdapterVideoPager;

    //data
    private ArrayList<Fragment> mListVideoFragments;
    private ArrayList<NoticeEntity> mListVideoEntities1, mListVideoEntities2, mListVideoEntities3;

    public static Fragment newInstance() {
        return new VideosFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.videos_fragment, container, false);

        initData();
        initView(inflater, container);
        setListener();

        return mRootView;
    }

    //初始化数据
    private void initData() {
        mListVideoFragments = new ArrayList<Fragment>();
        mListVideoFragments.add(new VideoListFragment(mListVideoEntities1,getActivity()));
        mListVideoFragments.add(new VideoListFragment(mListVideoEntities2, getActivity()));
        mListVideoFragments.add(new VideoListFragment(mListVideoEntities3, getActivity()));
    }

    //初始化视图
    private void initView(LayoutInflater inflater, ViewGroup container) {
        mBtnLive = mRootView.findViewById(R.id.btn_live);
        mBtnTips = mRootView.findViewById(R.id.btn_tips);
        mBtnCulture = mRootView.findViewById(R.id.btn_culture);
        mVpVideoContent = mRootView.findViewById(R.id.vp_video_content);

        //初始化并设置适配器
        mAdapterVideoPager = new ViewPagerAdapter(mListVideoFragments, getActivity().getSupportFragmentManager());
        mVpVideoContent.setAdapter(mAdapterVideoPager);
    }

    //设置监听事件
    private void setListener() {
        mBtnLive.setOnClickListener(this);
        mBtnTips.setOnClickListener(this);
        mBtnCulture.setOnClickListener(this);

        mVpVideoContent.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                View id;
                if (i == 0) {
                    id = mBtnLive;
                } else if (i == 1) {
                    id = mBtnTips;
                } else {
                    id = mBtnCulture;
                }
                onClick(id);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }


    @Override
    public void onClick(View v) {
        //被选中的项的文字颜色修改为0xFFFFFFFF，背景为0xFF00BCD4。其他文字颜色为0xFFFFFFFF，背景为0xFF000000
        switch (v.getId()) {
            case R.id.btn_live:
                mBtnLive.setTextColor(0xFFFFFFFF);
                mBtnLive.setBackgroundColor(0xFF00BCD4);

                mBtnTips.setBackgroundColor(0xFFFFFFFF);
                mBtnTips.setTextColor(0xFF000000);
                mBtnCulture.setBackgroundColor(0xFFFFFFFF);
                mBtnCulture.setTextColor(0xFF000000);

                //跳转到对应的fragment
                mVpVideoContent.setCurrentItem(0);
                break;
            case R.id.btn_tips:
                mBtnTips.setTextColor(0xFFFFFFFF);
                mBtnTips.setBackgroundColor(0xFF00BCD4);

                mBtnLive.setBackgroundColor(0xFFFFFFFF);
                mBtnLive.setTextColor(0xFF000000);
                mBtnCulture.setBackgroundColor(0xFFFFFFFF);
                mBtnCulture.setTextColor(0xFF000000);

                //跳转到对应的fragment
                mVpVideoContent.setCurrentItem(1);
                break;
            case R.id.btn_culture:
                mBtnCulture.setTextColor(0xFFFFFFFF);
                mBtnCulture.setBackgroundColor(0xFF00BCD4);

                mBtnLive.setBackgroundColor(0xFFFFFFFF);
                mBtnLive.setTextColor(0xFF000000);
                mBtnTips.setBackgroundColor(0xFFFFFFFF);
                mBtnTips.setTextColor(0xFF000000);

                //跳转到对应的fragment
                mVpVideoContent.setCurrentItem(2);
                break;
        }
    }
}