package com.dev.water_query.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.dev.water_query.R;
import com.dev.water_query.adapter.NoticeAdapter;
import com.dev.water_query.entity.NoticeEntity;

import java.util.ArrayList;

@SuppressLint("ValidFragment")
public class NoticeFragment extends Fragment {
    //上下文
    private Context mContext;

    //通知实体集合
    private ArrayList<NoticeEntity> mListNoticeEntities;

    //Adapter
    private NoticeAdapter mAdapterNoticeList;

    //View
    private View mRootView, mBtnLookMore;
    private ListView mListViewNotice;

    @SuppressLint("ValidFragment")
    public NoticeFragment(ArrayList<NoticeEntity> list, Context context) {
        mContext = context;
        mListNoticeEntities = list;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    //创建视图回调函数
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //初始化根view
        mRootView = inflater.inflate(R.layout.fragment_notice, container, false);

        initView();
        setListener();
        System.out.println("onCreateView");
        return mRootView;
    }

    //初始化视图
    private void initView() {
        //初始化view
        mListViewNotice = mRootView.findViewById(R.id.listview_notice);
        mBtnLookMore = mRootView.findViewById(R.id.btn_notice_look_more);

        //初始化并设置适配器
        mAdapterNoticeList = new NoticeAdapter(getActivity(), mListNoticeEntities);
        mListViewNotice.setAdapter(mAdapterNoticeList);
    }

    //设置监听事件
    private void setListener() {
        mBtnLookMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, NoticeFragment.this.toString() + "LOOK MORE", Toast.LENGTH_SHORT).show();
            }
        });

        mListViewNotice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                NoticeEntity entity = mListNoticeEntities.get(position);
                Toast.makeText(mContext, entity.getUrl() + "position" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}