package com.dev.water_query.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.dev.water_query.R;
import com.dev.water_query.adapter.ViewPagerAdapter;
import com.dev.water_query.fragment.ServiceFragment;
import com.dev.water_query.fragment.OnlineCustomerServiceFragment;
import com.dev.water_query.fragment.HomeFragment;
import com.dev.water_query.fragment.PersonalFragment;
import com.dev.water_query.fragment.VideosFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @version v1.1
 * @ClassName: MainActivity
 * @Package com.dev.water_query.activity
 * Description: 主界面
 * @author: Juston
 * @date: 2020/10/20 11:10
 */

public class MainActivity extends AppCompatActivity {
    private ArrayList<Fragment> mListFragments;
    private BottomNavigationView mBottomNavigation;
    private ViewPager mVpContent;
    private ViewPagerAdapter mVpContentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        initData();
        initView();
        setListener();
    }

    /**
    * @method initView
    * @description 初始化视图
    * @date: 2020/10/20 11:00
    * @author: Juston
    * @param
    * @return 
    */
    private void initView() {
        //initView
        mBottomNavigation = findViewById(R.id.navigation_main);
        mVpContent = findViewById(R.id.vp_main_content);

        //初始化并绑定适配器
        mVpContentAdapter = new ViewPagerAdapter(mListFragments, getSupportFragmentManager());
        //最多同时预加载4个页面
        mVpContent.setOffscreenPageLimit(4);
        mVpContent.setAdapter(mVpContentAdapter);
    }

    /**
    * @method initView
    * @description 初始化数据
    * @date: 2020/10/20 11:00
    * @author: Juston
    * @param
    * @return
    */
    private void initData() {
        mListFragments = new ArrayList<Fragment>();

        mListFragments.add(HomeFragment.newInstance());
        mListFragments.add(ServiceFragment.newInstance());
        mListFragments.add(OnlineCustomerServiceFragment.newInstance());
        mListFragments.add(VideosFragment.newInstance());
        mListFragments.add(PersonalFragment.newInstance());
    }

    /**
    * @method setListener
    * @description 设置监听事件
    * @date: 2020/10/20 11:01
    * @author: Juston
    * @param 
    * @return 
    */
    private void setListener() {
        //设置底部导航栏的项被选中的监听
        //在项被选中时 设置ViewPager要显示的Fragment
        mBottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.Home_Fragment:
                        mVpContent.setCurrentItem(0);
                        return true;
                    case R.id.Business_Fragment:
                        mVpContent.setCurrentItem(1);
                        return true;
                    case R.id.Feedback_Fragment:
                        mVpContent.setCurrentItem(2);
                        return true;
                    case R.id.Videos_Fragment:
                        mVpContent.setCurrentItem(3);
                        return true;
                    case R.id.Personal_Fragment:
                        mVpContent.setCurrentItem(4);
                        return true;
                }
                return false;
            }
        });

        //添加页面更改监听
        //在ViewPager更改时顺便更改底部导航栏的选中状态
        mVpContent.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            //页面更改回调函数
            @Override
            public void onPageSelected(int i) {
                //注意！ setSelectedItemId函数所传递的参数是要选中的item的id，而不是position！
                //所以要先获取id
                mBottomNavigation.setSelectedItemId(mBottomNavigation.getMenu().getItem(i).getItemId());
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
    }
}