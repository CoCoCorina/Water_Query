package com.dev.water_query.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * @version v1.0
 * @ClassName: ViewPagerAdapter
 * @Package com.dev.water_query.adapter
 * @escription: ViewPager适配器
 * @author: Juston
 * @date: 2020/10/20 11:10
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragmentList = new ArrayList<Fragment>();

    public ViewPagerAdapter(ArrayList<Fragment> list, FragmentManager fm) {
        super(fm);
        this.mFragmentList = list;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragmentList.get(i);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
