package com.dev.water_query.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dev.water_query.R;
import com.dev.water_query.entity.NoticeEntity;

import java.util.ArrayList;

/**
 * @version 版本
 * @ClassName: NoticeAdapter
 * @Package com.dev.water_query.adapter
 * @Description: ListView 通知的适配器
 * @author: Juston
 * @date: 2020/10/21 21:24
 */
public class NoticeAdapter extends BaseAdapter {
    //通知实体集合
    private ArrayList<NoticeEntity> mListNoticeEntities;
    //上下文你
    private Context mContext;

    public NoticeAdapter(Context context, ArrayList<NoticeEntity> list) {
        this.mListNoticeEntities = list;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        //至多显示3个项
        if (mListNoticeEntities != null) {
            return mListNoticeEntities.size() >= 3 ? 3 : mListNoticeEntities.size();
        } else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return mListNoticeEntities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //view持有者 用于暂存已经初始化的对象， 能够更快速的加载item
        ViewHolder vh;

        //item的view对象
        //如果没有初始化那么初始化并设置tag，否则直接从tag中取出view持有者
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item_notice, null);

            vh = new ViewHolder();
            vh.mTxtTitle = convertView.findViewById(R.id.txt_notice_item_title);
            vh.mTxtDate = convertView.findViewById(R.id.txt_notice_item_date);

            //设置tag为view持有者
            convertView.setTag(vh);
        } else {
            //取出view持有者
            vh = (ViewHolder) convertView.getTag();
        }

        //设置要显示的内容
        NoticeEntity notice = mListNoticeEntities.get(position);
        vh.mTxtTitle.setText(notice.getTitle());
        vh.mTxtDate.setText(notice.getDate());

        return convertView;
    }

    //View持有者
    private class ViewHolder {
        public TextView mTxtTitle, mTxtDate;
    }
}
