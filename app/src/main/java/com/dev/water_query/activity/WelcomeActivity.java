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
 * @version v1.1
 * @ClassName: WelcomeActivity
 * @Package com.dev.water_query.activity
 * @escription: 欢迎界面
 * @author: Juston
 * @date: 2020/10/20 11:09
 */

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditSupplyNumber;
    private Button mBtnSubmitSupplyNumber;

    @SuppressLint("HandlerLeak")
    private Handler mGoHomeHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            goHome();
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    @Override
    protected void onStart() {
        super.onStart();

        initView();
        //在2秒后发送一个空信息通知handler
        mGoHomeHandler.sendEmptyMessageDelayed(0, 2000);
    }

    /**
     * @param
     * @return
     * @method initView
     * @description 初始化视图
     * @date: 2020/10/20 11:05
     * @author: Juston
     */
    private void initView() {
        mEditSupplyNumber = findViewById(R.id.edit_welcome_supply_number);
        mBtnSubmitSupplyNumber = findViewById(R.id.submit_welcome_supply_number);
    }

    /**
     * @param
     * @return
     * @method goHome
     * @description 跳转到主界面
     * @date: 2020/10/20 11:05
     * @author: Juston
     */
    private void goHome() {
        if (SharedPreferencesUtil.getSupplyNumber(this) == null) {
            mEditSupplyNumber.setVisibility(View.VISIBLE);
            mBtnSubmitSupplyNumber.setVisibility(View.VISIBLE);

            //点击事件（获取数据，存入SharedPreferences）
            mBtnSubmitSupplyNumber.setOnClickListener(this);
        } else {
            //跳转到主界面
            startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
            finish();
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.submit_welcome_supply_number) {
            //获取输入框的内容
            String mSupplyNumber = mEditSupplyNumber.getText().toString();

            Boolean bool = SharedPreferencesUtil.setSupplyNumber(mSupplyNumber, WelcomeActivity.this);
            if (bool) {
                Toast.makeText(WelcomeActivity.this, "保存成功！", Toast.LENGTH_SHORT).show();
                //跳转到主界面
                startActivity(new Intent(WelcomeActivity.this, MainActivity.class));
                finish();
            } else {
                Toast.makeText(WelcomeActivity.this, "保存失败！", Toast.LENGTH_SHORT).show();
            }
        }
    }
}