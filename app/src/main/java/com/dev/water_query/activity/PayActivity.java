package com.dev.water_query.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.dev.water_query.R;
import com.dev.water_query.utils.DateConvertUtil;
import com.dev.water_query.utils.SharedPreferencesUtil;

/**
 * @version: v1.0
 * @ClassName: PayActivity
 * @Package: com.dev.water_query.activity
 * @Description: 我要缴费Activity
 * @author: Corina
 * @date: 2020/10/29 14:52
 */
public class PayActivity extends AppCompatActivity {
    private TextView mPaySupplyNumber, mPayDate, mPayCurrentBalance, mPayLiquidatedDamages, mPayName, mPayPopulationBase, mPayAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        initView();
        initData();
    }

    @SuppressLint("SetTextI18n")
    private void initData() {
        mPaySupplyNumber.setText("给水号: " + SharedPreferencesUtil.getSupplyNumber(this));
        mPayDate.setText(DateConvertUtil.getYearMonth());

        mPayCurrentBalance.setText("当前余额：" + "0" + " 元");
        mPayLiquidatedDamages.append("0"+" 元");
        mPayName.setText("户主姓名：" + "小明");
        mPayPopulationBase.setText("人口基数：" + "4");
        mPayAddress.setText("用水地址：" + "解放路4****楼3单元302室");

    }

    private void initView() {

        mPaySupplyNumber = findViewById(R.id.pay_supply_number);
        mPayDate = findViewById(R.id.pay_date);
        mPayCurrentBalance = findViewById(R.id.pay_current_balance);
        mPayLiquidatedDamages = findViewById(R.id.pay_liquidated_damages);
        mPayName = findViewById(R.id.pay_name);
        mPayPopulationBase = findViewById(R.id.pay_population_base);
        mPayAddress = findViewById(R.id.pay_address);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}