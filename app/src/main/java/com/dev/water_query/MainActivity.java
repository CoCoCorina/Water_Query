package com.dev.water_query;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.dev.water_query.fragment.Business_Fragment;
import com.dev.water_query.fragment.Feedback_Fragment;
import com.dev.water_query.fragment.Home_Fragment;
import com.dev.water_query.fragment.Personal_Fragment;
import com.dev.water_query.fragment.Videos_Fragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(Home_Fragment.newInstance());
        fragments.add(Business_Fragment.newInstance());
        fragments.add(Feedback_Fragment.newInstance());
        fragments.add(Videos_Fragment.newInstance());
        fragments.add(Personal_Fragment.newInstance());
        BottomNavigationView navigation = findViewById(R.id.navigation);
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.content, fragments.get(0), "Home_Fragment")
                .add(R.id.content, fragments.get(1), "Business_Fragment")
                .add(R.id.content, fragments.get(2), "Feedback_Fragment")
                .add(R.id.content, fragments.get(3), "Videos_Fragment")
                .add(R.id.content, fragments.get(4), "Personal_Fragment")
                .commit();

        fm.beginTransaction()
                .hide(fragments.get(1))
                .hide(fragments.get(2))
                .hide(fragments.get(3))
                .hide(fragments.get(0))
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