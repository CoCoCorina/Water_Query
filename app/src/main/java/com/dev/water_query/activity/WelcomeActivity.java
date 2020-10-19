package com.dev.water_query.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.dev.water_query.R;
import com.dev.water_query.utils.SharedPreferencesUtil;

/**
 * @description: 欢迎界面
 * @date 2020/10/18 23:21
 */

public class WelcomeActivity extends AppCompatActivity {

    private EditText mEdit_supplyNumber;
    private Button mSubmit_supplyNumber;
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @SuppressLint("HandlerLeak")
        @Override
        public void handleMessage(Message msg) {
            getHome();
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        mEdit_supplyNumber = findViewById(R.id.edit_supply_number);
        mSubmit_supplyNumber = findViewById(R.id.submit_supply_number);

        handler.sendEmptyMessageDelayed(0, 2000);
    }

    private void getHome() {
        if (SharedPreferencesUtil.getSupplyNumber(this) == null) {

            mEdit_supplyNumber.setVisibility(View.VISIBLE);
            mSubmit_supplyNumber.setVisibility(View.VISIBLE);

            //点击事件（获取数据，存入SharedPreferences）
            mSubmit_supplyNumber.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //获取输入框的内容
                    String mSupplyNumber = mEdit_supplyNumber.getText().toString();

                    Boolean bool = SharedPreferencesUtil.setSupplyNumber(mSupplyNumber, WelcomeActivity.this);
                    if (bool)
                        Toast.makeText(WelcomeActivity.this, "保存成功！", Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(WelcomeActivity.this, "保存失败！", Toast.LENGTH_SHORT).show();

                    //跳转到主界面
                    startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                    finish();
                }
            });
        } else {
            //跳转到主界面
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            finish();
        }
    }
}