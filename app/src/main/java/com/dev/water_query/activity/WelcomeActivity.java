package com.dev.water_query.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.dev.water_query.R;

/**
* @description: 欢迎界面
* @date 2020/10/18 23:21
*/

public class WelcomeActivity extends AppCompatActivity {

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

        handler.sendEmptyMessageDelayed(0, 1000);
    }

    private void getHome() {
        //跳转到主界面
        startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
        finish();
    }
}