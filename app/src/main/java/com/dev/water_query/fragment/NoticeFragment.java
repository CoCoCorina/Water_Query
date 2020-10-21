package com.dev.water_query.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.dev.water_query.R;
import com.dev.water_query.entity.NoticeEntity;

import java.util.ArrayList;

@SuppressLint("ValidFragment")
public class NoticeFragment extends Fragment {

    //TODO ListView的显示
    private Context mContext;
    private ArrayList<NoticeEntity> mListNoticeEntities;
    private View mRootView;

    private ListView mListViewNotice;
    private Button mBtnLookMore;

    @SuppressLint("ValidFragment")
    public NoticeFragment(ArrayList<NoticeEntity> list, Context context) {
        mContext = context;
        mListNoticeEntities = list;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_notice, container, false);

        return mRootView;
    }

    private void initView() {
        mListViewNotice = mRootView.findViewById(R.id.listview_notice);
        mBtnLookMore = mRootView.findViewById(R.id.btn_notice_look_more);
    }
}