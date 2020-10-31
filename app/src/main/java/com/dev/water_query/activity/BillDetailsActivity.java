package com.dev.water_query.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ListView;
import android.widget.Toast;

import com.dev.water_query.R;
import com.dev.water_query.adapter.BillDetailAdapter;
import com.dev.water_query.entity.HalfYearStatisticsEntity;
import com.dev.water_query.network.CallBack;
import com.dev.water_query.network.OkHttp3Util;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class BillDetailsActivity extends AppCompatActivity {

    private static final int HANDLER_SUCCESS = 0, HANDLER_FAILURE = 1;

    //账单详情
    private ListView mListViewBillDetails;
    private BarChart mBarChartUseWater;

    //适配器
    private BillDetailAdapter mAdapterBillDetail;

    //数据
    private volatile HalfYearStatisticsEntity mHalfUseWaterRecord;
    private ArrayList<IBarDataSet> mDataSets;

    //接受从子线程发来的信息，用来操控主线程的控件
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            if (msg.what == HANDLER_FAILURE) {
                Toast.makeText(BillDetailsActivity.this, "error :" + msg.obj.toString(), Toast.LENGTH_SHORT).show();
                return;
            }
            showData();
            initView();
            setListener();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_details);

        getDataInInternet();
    }

    //初始化视图
    private void initView() {
        mListViewBillDetails = findViewById(R.id.listview_bill_details);
        mBarChartUseWater = findViewById(R.id.chart_bill_use_water);

        //设置标题
        Description desc = new Description();
        desc.setText("用水情况");
        mBarChartUseWater.setDescription(desc);
        //将Y数据显示在点的上方
        mBarChartUseWater.setDrawValueAboveBar(true);
        //将dataset交给data
        mBarChartUseWater.setData(new BarData(mDataSets));

        //初始化账单详情
        mAdapterBillDetail = new BillDetailAdapter(this, mHalfUseWaterRecord.getListMonthRecord());
        mListViewBillDetails.setAdapter(mAdapterBillDetail);
    }

    //展示数据
    private void showData() {
        //初始化数据集
        ArrayList<BarEntry> values = new ArrayList<>();

        int i = 0;
        for (HalfYearStatisticsEntity.MonthRecord record : mHalfUseWaterRecord.getListMonthRecord()) {
            float useWater = record.getMonthAccumulativeWater();
            values.add(new BarEntry(i++, useWater));
        }

        mDataSets = new ArrayList<>();

        //将数据集添加到dataset中
        mDataSets.add(new BarDataSet(values, "用水量"));
    }

    //设置监听事件
    private void setListener() {
    }

    //从网络上获取数据
    private void getDataInInternet() {
        //从网络上请求数据
        String url = "http://zn.qlnuqianyun.cn/qlnuznsb/jsonTest/getInfoBySupplyNum.shtml?supplyNum=FYCJ001&flag=0";
        OkHttp3Util.deserializeObjectFromHttpGet(url, HalfYearStatisticsEntity.class, new CallBack<HalfYearStatisticsEntity>() {
            @Override
            public void onFailure(String errorMsg) {
                //请求失败 通过handler向主线程发送信息
                Message msg = new Message();
                msg.what = HANDLER_FAILURE;
                msg.obj = errorMsg;
                handler.sendMessage(msg);
            }

            @Override
            public void onSuccess(HalfYearStatisticsEntity obj) {
                //请求成功 将请求到的实体赋值 并通过handler通知主线程
                mHalfUseWaterRecord = obj;
                handler.sendEmptyMessage(HANDLER_SUCCESS);
            }
        });
    }
}