package com.dev.water_query.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import com.dev.water_query.R;
import com.dev.water_query.adapter.GridViewAdapter;
import com.dev.water_query.entity.GridViewEntity;

import java.util.ArrayList;

/**
 * @version: v1.0
 * @ClassName: ServiceFragment
 * @Package: com.dev.water_query.fragment
 * @Description: 服务界面
 * @author: Corina
 * @date: 2020/10/20 16:29
 */
public class ServiceFragment extends Fragment {
    private View mRootView;
    private Context mContext;
    private GridView mGridViewService, mGridViewHandle, mGridViewTips;

    public ServiceFragment() {
    }

    public static Fragment newInstance() {
        return new ServiceFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.service_fragment, container, false);

        initView(inflater,container);
        initData();
        setListener();

        return mRootView;
    }

    private void initView(LayoutInflater inflater, ViewGroup container) {
        mGridViewService = mRootView.findViewById(R.id.service_gridview_service);
        mGridViewHandle = mRootView.findViewById(R.id.service_gridview_handle);
        mGridViewTips = mRootView.findViewById(R.id.service_gridview_tips);
    }

    private void initData() {
        mContext = getActivity();

        ArrayList<GridViewEntity> mGridViewServiceList = new ArrayList<>();
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "水费查询"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_apps_24, "我要交费"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "用水价格"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "电子发票"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "停水降压通知"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "水质水压公告"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "营业网点"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "直饮水服务"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "供水服务热线"));

        ArrayList<GridViewEntity> mGridViewHandleList = new ArrayList<>();
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "水表报装"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_baseline_apps_24, "户表改造"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "户表调价"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "多人口签续约"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "竣工验收"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "更名过户"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "互联网督查"));

        ArrayList<GridViewEntity> mGridViewTipsList = new ArrayList<>();
        mGridViewTipsList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "常见问题"));
        mGridViewTipsList.add(new GridViewEntity(R.drawable.ic_baseline_apps_24, "法律法规"));
        mGridViewTipsList.add(new GridViewEntity(R.drawable.ic_baseline_chat_24, "业务指南"));

        BaseAdapter mAdapterService = new GridViewAdapter<GridViewEntity>(mGridViewServiceList, R.layout.gridview_icon) {
            @Override
            public void bindView(ViewHolder holder, GridViewEntity obj) {
                holder.setImageResource(R.id.img_icon, obj.getiId());
                holder.setText(R.id.txt_icon, obj.getiName());
            }
        };
        BaseAdapter mAdapterHandle = new GridViewAdapter<GridViewEntity>(mGridViewHandleList, R.layout.gridview_icon) {
            @Override
            public void bindView(ViewHolder holder, GridViewEntity obj) {
                holder.setImageResource(R.id.img_icon, obj.getiId());
                holder.setText(R.id.txt_icon, obj.getiName());
            }
        };
        BaseAdapter mAdapterTips = new GridViewAdapter<GridViewEntity>(mGridViewTipsList, R.layout.gridview_icon) {
            @Override
            public void bindView(ViewHolder holder, GridViewEntity obj) {
                holder.setImageResource(R.id.img_icon, obj.getiId());
                holder.setText(R.id.txt_icon, obj.getiName());
            }
        };

        mGridViewService.setAdapter(mAdapterService);
        mGridViewHandle.setAdapter(mAdapterHandle);
        mGridViewTips.setAdapter(mAdapterTips);
    }

    private void setListener() {
        mGridViewService.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(mContext, "你点击了~" + position + "~项", Toast.LENGTH_SHORT).show();
            }
        });

        mGridViewHandle.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(mContext, "你点击了~" + position + "~项", Toast.LENGTH_SHORT).show();
            }
        });

        mGridViewTips.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(mContext, "你点击了~" + position + "~项", Toast.LENGTH_SHORT).show();
            }
        });
    }
}