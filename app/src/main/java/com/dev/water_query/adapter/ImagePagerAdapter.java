package com.dev.water_query.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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
    //上下文
    private Context mContext;
    //要加载的图片的id
    private List<Integer> mListImageId;
    //布局加载器
    private LayoutInflater mLayoutInflater;

    public ImagePagerAdapter(Context context, List<Integer> list) {
        this.mContext = context;
        this.mListImageId = list;
    }

    @Override
    public int getCount() {
        return mListImageId.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        //初始化布局加载器
        if (mLayoutInflater != null) {
            mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        //初始化并添加ImageView到父View中
        ImageView itemView = new ImageView(mContext);
        itemView.setImageResource(mListImageId.get(position));
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        //一定要重写此函数！
        //销毁item时，将添加的imageView从父view中移除
        container.removeView((View) object);
    }
}
