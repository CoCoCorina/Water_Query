package com.dev.water_query.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.dev.water_query.R;
import com.dev.water_query.adapter.BillDetailAdapter;
import com.dev.water_query.entity.HalfYearStatisticsEntity;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BillDetailsActivity extends AppCompatActivity {
    private ListView mListViewBillDetails;
    private BarChart mBarChartUseWater;
    private BillDetailAdapter mAdapterBillDetail;

    private HalfYearStatisticsEntity mHalfUseWaterRecord;
    private ArrayList<IBarDataSet> mDataSets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_details);

        initData();
        initView();
        setListener();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

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

    private void initData() {
        //初始化实体
        mHalfUseWaterRecord = new HalfYearStatisticsEntity();
        mHalfUseWaterRecord.setMonthlySt0("2019-02,4.2,163.6,81.5,34.44,2019-06-24");
        mHalfUseWaterRecord.setMonthlySt1("2019-03,4.2,122.96,12.9,32.11,2019-06-24");
        mHalfUseWaterRecord.setMonthlySt2("2019-04,4.2,53.96,83.2,89.24,2019-06-24");
        mHalfUseWaterRecord.setMonthlySt3("2019-05,4.2,23.156,65.1,68.09,2019-06-24");
        mHalfUseWaterRecord.setMonthlySt4("2019-08,4.2,201.56,48.3,54.34,2019-06-24");
        mHalfUseWaterRecord.setMonthlySt5("2019-10,4.2,131.1,98.7,14.54,2019-06-24");

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

    private void setListener() {
    }

}