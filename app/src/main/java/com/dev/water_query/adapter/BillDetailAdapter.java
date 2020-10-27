package com.dev.water_query.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.dev.water_query.R;
import com.dev.water_query.entity.HalfYearStatisticsEntity;

import java.util.ArrayList;

/**
 * @version 版本
 * @ClassName: BillDetailAdapter
 * @Package com.dev.water_query.adapter
 * @Description: listview 账单详情的适配器
 * @author: Juston
 * @date: 2020/10/27 18:49
 */
public class BillDetailAdapter extends BaseAdapter {
    private Context mConext;
    private ArrayList<HalfYearStatisticsEntity.MonthRecord> mListBillDetail;

    public BillDetailAdapter(Context context, ArrayList<HalfYearStatisticsEntity.MonthRecord> list) {
        mConext = context;
        mListBillDetail = list;
    }

    @Override
    public int getCount() {
        return mListBillDetail.size();
    }

    @Override
    public Object getItem(int position) {
        return mListBillDetail.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh;
        if (convertView == null) {
            vh = new ViewHolder();
            convertView = LayoutInflater.from(mConext).inflate(R.layout.item_bill_detail, null);

            vh.txtBillDetailMonth = convertView.findViewById(R.id.txt_item_bill_detail_month);
            vh.txtBillDetailYear = convertView.findViewById(R.id.txt_item_bill_detail_year);
            vh.txtBillDetailPrice = convertView.findViewById(R.id.txt_item_bill_detail_price);
            vh.txtBillDetailTotalPrice = convertView.findViewById(R.id.txt_item_bill_detail_total_price);
            vh.txtBillDetailUseWater = convertView.findViewById(R.id.txt_item_bill_detail_use_water);
            vh.txtBillDetailLeftWater = convertView.findViewById(R.id.txt_item_bill_detail_water_left);
            vh.txtBillDetailRecordDate = convertView.findViewById(R.id.txt_item_bill_detail_record_date);

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }

        HalfYearStatisticsEntity.MonthRecord monthRecord = mListBillDetail.get(position);
        String[] datearr = monthRecord.getDate().split("-");
        vh.txtBillDetailYear.setText("/" + datearr[0]);
        vh.txtBillDetailMonth.setText(datearr[1]);
        vh.txtBillDetailPrice.setText(String.valueOf(monthRecord.getPrice()));
        vh.txtBillDetailTotalPrice.setText("￥" + String.valueOf(monthRecord.getTotalPrice()));
        vh.txtBillDetailUseWater.setText(String.valueOf(monthRecord.getMonthAccumulativeWater()));
        vh.txtBillDetailLeftWater.setText(String.valueOf(monthRecord.getLeftWater()));
        vh.txtBillDetailRecordDate.setText(monthRecord.getRecordDate());

        return convertView;
    }

    class ViewHolder {
        public TextView txtBillDetailPrice, txtBillDetailTotalPrice, txtBillDetailUseWater;
        public TextView txtBillDetailLeftWater, txtBillDetailMonth, txtBillDetailYear, txtBillDetailRecordDate;
    }
}
