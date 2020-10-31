package com.dev.water_query.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dev.water_query.R;

/**
 * @version: v1.0
 * @ClassName: WaterAccountActivity
 * @Package: com.dev.water_query.activity
 * @Description: 我要缴费Activity
 * @author: Corina
 * @date: 2020/10/30 15:09
 */
public class WaterAccountActivity extends AppCompatActivity {
    private TextView mAccountSupplyNumber, mAccountName, mAccountInfo,
            mAccountCode, mAccountDelegate, mAccountFee,
            mBtnAccountPay, mBtnAccountQuery, mBtnAccountMonitor, mBtnAccountUnbundling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_account);

        initView();
        initData();
        setListener();
    }

    //初始化视图
    private void initView() {
        mAccountSupplyNumber = findViewById(R.id.txt_account_supply_number);
        mAccountName = findViewById(R.id.txt_account_name);
        mAccountInfo = findViewById(R.id.txt_account_info);
        mAccountCode = findViewById(R.id.txt_account_code);
        mAccountDelegate = findViewById(R.id.txt_account_delegate);
        mAccountFee = findViewById(R.id.txt_account_fee);
        mBtnAccountPay = findViewById(R.id.btn_account_pay);
        mBtnAccountQuery = findViewById(R.id.btn_account_query);
        mBtnAccountMonitor = findViewById(R.id.btn_account_monitor);
        mBtnAccountUnbundling = findViewById(R.id.btn_account_unbind);
    }


    //初始化数据
    private void initData() {
        mAccountSupplyNumber.setText("1032900");
        mAccountName.setText("王*明");
        mAccountInfo.setText("江西三川");
        mAccountCode.setText("04-126-125");
        mAccountDelegate.setText("王小明(19809877890)");
        mAccountFee.setText("0" + "元");
    }

    //设置监听事件
    private void setListener() {
        mBtnAccountPay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), PayActivity.class));
            }
        });
        mBtnAccountQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), BillDetailsActivity.class));
            }
        });
        mBtnAccountMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 2020/10/30  远程监测
            }
        });
        mBtnAccountUnbundling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: 2020/10/30 解绑水号 
            }
        });
    }
}