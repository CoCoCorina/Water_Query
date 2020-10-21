package com.dev.water_query.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dev.water_query.R;

import java.util.List;

/**
 * @version 版本
 * @ClassName: ImagePagerAdapter
 * @Package com.dev.water_query.adapter
 * @Description: 图片pager适配器
 * @author: Juston
 * @date: 2020/10/20 21:25
 */
public class ImagePagerAdapter extends PagerAdapter {
    private Context mContext;
    private List<Integer> mListId;
    private LayoutInflater mLayoutInflater;

    public ImagePagerAdapter(Context context, List<Integer> list) {
        this.mContext = context;
        this.mListId = list;
    }

    @Override
    public int getCount() {
        return mListId.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        if (mLayoutInflater != null) {
            mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        ImageView itemView = new ImageView(mContext);
        itemView.setImageResource(mListId.get(position));

        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
