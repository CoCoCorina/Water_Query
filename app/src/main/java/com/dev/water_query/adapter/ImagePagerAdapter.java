package com.dev.water_query.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import java.util.ArrayList;

/**
 * @version 版本
 * @ClassName: ImagePagerAdapter
 * @Package com.dev.water_query.adapter
 * @Description: 图片pager适配器
 * @author: Juston
 * @date: 2020/10/20 21:25
 */
public class ImagePagerAdapter extends ViewPagerAdapter {
    public ImagePagerAdapter(ArrayList<Fragment> list, FragmentManager fm) {
        super(list, fm);
    }
}
