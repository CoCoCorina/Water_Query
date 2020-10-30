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

    private void initView() {
        mAccountSupplyNumber = findViewById(R.id.account_supply_number);
        mAccountName = findViewById(R.id.account_name);
        mAccountInfo = findViewById(R.id.account_info);
        mAccountCode = findViewById(R.id.account_code);
        mAccountDelegate = findViewById(R.id.account_delegate);
        mAccountFee = findViewById(R.id.account_fee);
        mBtnAccountPay = findViewById(R.id.btn_account_pay);
        mBtnAccountQuery = findViewById(R.id.btn_account_query);
        mBtnAccountMonitor = findViewById(R.id.btn_account_monitor);
        mBtnAccountUnbundling = findViewById(R.id.btn_account_unbundling);
    }


    private void initData() {
        mAccountSupplyNumber.append("1032900");
        mAccountName.append("王*明");
        mAccountInfo.append("江西三川");
        mAccountCode.append("04-126-125");
        mAccountDelegate.append("王小明(19809877890)");
        mAccountFee.append("0" + "元");
    }

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

            }
        });
        mBtnAccountUnbundling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}