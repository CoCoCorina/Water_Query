package com.dev.water_query.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.dev.water_query.R;
import com.dev.water_query.activity.BillDetailsActivity;
import com.dev.water_query.activity.PayActivity;
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
    //View
    private View mRootView;
    private GridView mGridViewService, mGridViewHandle, mGridViewTips;

    //Context
    private Context mContext;

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

        initView(inflater, container);
        initData();
        setListener();

        return mRootView;
    }

    //初始化视图
    private void initView(LayoutInflater inflater, ViewGroup container) {
        mGridViewService = mRootView.findViewById(R.id.service_gridview_service);
        mGridViewHandle = mRootView.findViewById(R.id.service_gridview_handle);
        mGridViewTips = mRootView.findViewById(R.id.service_gridview_tips);
    }

    //初始化数据
    private void initData() {
        mContext = getActivity();

        //初始化服务列表数据
        ArrayList<GridViewEntity> mGridViewServiceList = new ArrayList<>();
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_query, "水费查询"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_water_fee, "我要交费"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_price, "用水价格"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_invoice, "电子发票"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_notification, "停水降压通知"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_announcement, "水质水压公告"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_business_outlets, "营业网点"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_water_dispenser, "直饮水服务"));
        mGridViewServiceList.add(new GridViewEntity(R.drawable.ic_customer_service, "供水服务热线"));

        //初始化处理列表数据
        ArrayList<GridViewEntity> mGridViewHandleList = new ArrayList<>();
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_report, "水表报装"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_reform, "户表改造"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_modify_price, "户表调价"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_renewal, "多人口签续约"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_check, "竣工验收"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_transfer, "更名过户"));
        mGridViewHandleList.add(new GridViewEntity(R.drawable.ic_inspection, "互联网督查"));

        //初始化贴士列表数据
        ArrayList<GridViewEntity> mGridViewTipsList = new ArrayList<>();
        mGridViewTipsList.add(new GridViewEntity(R.drawable.ic_problem, "常见问题"));
        mGridViewTipsList.add(new GridViewEntity(R.drawable.ic_laws, "法律法规"));
        mGridViewTipsList.add(new GridViewEntity(R.drawable.ic_guide, "业务指南"));

        //初始化服务适配器
        BaseAdapter mAdapterService = new GridViewAdapter<GridViewEntity>(mGridViewServiceList, R.layout.gridview_icon) {
            @Override
            public void bindView(ViewHolder holder, GridViewEntity obj) {
                holder.setImageResource(R.id.img_icon, obj.getId());
                holder.setText(R.id.txt_icon, obj.getName());
            }
        };
        BaseAdapter mAdapterHandle = new GridViewAdapter<GridViewEntity>(mGridViewHandleList, R.layout.gridview_icon) {
            @Override
            public void bindView(ViewHolder holder, GridViewEntity obj) {
                holder.setImageResource(R.id.img_icon, obj.getId());
                holder.setText(R.id.txt_icon, obj.getName());
            }
        };
        BaseAdapter mAdapterTips = new GridViewAdapter<GridViewEntity>(mGridViewTipsList, R.layout.gridview_icon) {
            @Override
            public void bindView(ViewHolder holder, GridViewEntity obj) {
                holder.setImageResource(R.id.img_icon, obj.getId());
                holder.setText(R.id.txt_icon, obj.getName());
            }
        };

        //为GridView设置适配器
        mGridViewService.setAdapter(mAdapterService);
        mGridViewHandle.setAdapter(mAdapterHandle);
        mGridViewTips.setAdapter(mAdapterTips);
    }

    //设置监听
    private void setListener() {
        mGridViewService.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(getActivity(), BillDetailsActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(getActivity(), PayActivity.class));
                        break;
                    default:
                }
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