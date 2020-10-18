package com.dev.water_query.activity;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.dev.water_query.R;
import com.dev.water_query.fragment.ServiceFragment;
import com.dev.water_query.fragment.OnlineCustomerServiceFragment;
import com.dev.water_query.fragment.HomeFragment;
import com.dev.water_query.fragment.PersonalFragment;
import com.dev.water_query.fragment.VideosFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(HomeFragment.newInstance());
        fragments.add(ServiceFragment.newInstance());
        fragments.add(OnlineCustomerServiceFragment.newInstance());
        fragments.add(VideosFragment.newInstance());
        fragments.add(PersonalFragment.newInstance());
        BottomNavigationView navigation = findViewById(R.id.navigation);
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.content, fragments.get(0), "HomeFragment")
                .add(R.id.content, fragments.get(1), "ServiceFragment")
                .add(R.id.content, fragments.get(2), "OnlineCustomerServiceFragment")
                .add(R.id.content, fragments.get(3), "VideosFragment")
                .add(R.id.content, fragments.get(4), "MeFragment")
                .commit();

        fm.beginTransaction()
                .hide(fragments.get(1))
                .hide(fragments.get(2))
                .hide(fragments.get(3))
                .hide(fragments.get(4))
                .commit();

        navigation.setOnNavigationItemSelectedListener((item) -> {
            switch (item.getItemId()) {
                case R.id.Home_Fragment:
                    fm.beginTransaction()
                            .hide(fragments.get(1))
                            .hide(fragments.get(2))
                            .hide(fragments.get(3))
                            .hide(fragments.get(4))
                            .show(fragments.get(0))
                            .commit();
                    return true;
                case R.id.Business_Fragment:
                    fm.beginTransaction()
                            .hide(fragments.get(0))
                            .hide(fragments.get(2))
                            .hide(fragments.get(3))
                            .hide(fragments.get(4))
                            .show(fragments.get(1))
                            .commit();
                    return true;
                case R.id.Feedback_Fragment:
                    fm.beginTransaction()
                            .hide(fragments.get(0))
                            .hide(fragments.get(1))
                            .hide(fragments.get(3))
                            .hide(fragments.get(4))
                            .show(fragments.get(2))
                            .commit();
                    return true;
                case R.id.Videos_Fragment:
                    fm.beginTransaction()
                            .hide(fragments.get(0))
                            .hide(fragments.get(1))
                            .hide(fragments.get(2))
                            .hide(fragments.get(4))
                            .show(fragments.get(3))
                            .commit();
                    return true;
                case R.id.Personal_Fragment:
                    fm.beginTransaction()
                            .hide(fragments.get(0))
                            .hide(fragments.get(1))
                            .hide(fragments.get(2))
                            .hide(fragments.get(3))
                            .show(fragments.get(4))
                            .commit();
                    return true;
            }
            return false;
        });
    }
}