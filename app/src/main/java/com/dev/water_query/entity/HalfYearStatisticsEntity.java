package com.dev.water_query.entity;

import java.util.ArrayList;

/**
 * @description: 半年信息统计
 * @date 2020/10/18 18:41
 */

public class HalfYearStatisticsEntity {

    /**
     * status : 200
     * end : 查询成功！
     * realName :
     * supplyNumber : FYCJ001
     * phoneNumber :
     * address : **
     * moneyLeft : 2248.22
     * waterLLeft : 574.9094761904752
     * monthlySt0 : 2019-07,4.2,133.1596,8.199,34.44,2019-06-24
     * monthlySt1 : 2019-06,4.2,124.6546,9.31,39.1,2019-06-24
     * monthlySt2 : 2019-05,4.2,115.0171,9.301,39.06,2019-06-24
     * monthlySt3 : 2019-04,4.2,105.3506,9.645,40.51,2019-06-24
     * monthlySt4 : 2019-03,4.2,95.3187,9.336,39.21,2019-06-24
     * monthlySt5 : 2019-02,4.2,85.5576,10.322,43.35,2019-06-24
     */

    private static final int REQUEST_SUCCESS = 200;
    //状态码
    private int status;
    //查询状态字符串
    private String end;
    //姓名
    private String realName;
    //水号
    private String supplyNumber;
    //手机号
    private String phoneNumber;
    //地址
    private String address;
    //目前水量
    private double moneyLeft;
    //目前金额
    private double waterLLeft;
    //按月份统计
    private ArrayList<MonthRecord> mListMonthRecord = new ArrayList<MonthRecord>();
    private String monthlySt0;
    private String monthlySt1;
    private String monthlySt2;
    private String monthlySt3;
    private String monthlySt4;
    private String monthlySt5;


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSupplyNumber() {
        return supplyNumber;
    }

    public void setSupplyNumber(String supplyNumber) {
        this.supplyNumber = supplyNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoneyLeft() {
        return moneyLeft;
    }

    public void setMoneyLeft(double moneyLeft) {
        this.moneyLeft = moneyLeft;
    }

    public double getWaterLLeft() {
        return waterLLeft;
    }

    public void setWaterLLeft(double waterLLeft) {
        this.waterLLeft = waterLLeft;
    }

    public String getMonthlySt0() {
        return monthlySt0;
    }

    public void setMonthlySt0(String monthlySt0) {
        this.monthlySt0 = monthlySt0;
        mListMonthRecord.add(new MonthRecord(monthlySt0));
    }

    public String getMonthlySt1() {
        return monthlySt1;
    }

    public void setMonthlySt1(String monthlySt1) {
        this.monthlySt1 = monthlySt1;
        mListMonthRecord.add(new MonthRecord(monthlySt1));
    }

    public String getMonthlySt2() {
        return monthlySt2;
    }

    public void setMonthlySt2(String monthlySt2) {
        this.monthlySt2 = monthlySt2;
        mListMonthRecord.add(new MonthRecord(monthlySt2));
    }

    public String getMonthlySt3() {
        return monthlySt3;
    }

    public void setMonthlySt3(String monthlySt3) {
        this.monthlySt3 = monthlySt3;
        mListMonthRecord.add(new MonthRecord(monthlySt3));
    }

    public String getMonthlySt4() {
        return monthlySt4;
    }

    public void setMonthlySt4(String monthlySt4) {
        this.monthlySt4 = monthlySt4;
        mListMonthRecord.add(new MonthRecord(monthlySt4));
    }

    public String getMonthlySt5() {
        return monthlySt5;
    }

    public void setMonthlySt5(String monthlySt5) {
        this.monthlySt5 = monthlySt5;
        mListMonthRecord.add(new MonthRecord(monthlySt5));
    }

    public ArrayList<MonthRecord> getListMonthRecord() {
        return mListMonthRecord;
    }

    public static class MonthRecord {
        public MonthRecord(String str) {
            String[] arr = str.split(",");
            mDate = arr[0];
            mPrice = Float.parseFloat(arr[1]);
            mLeftWater = Float.parseFloat(arr[2]);
            mMonthAccumulativeWater = Float.parseFloat(arr[3]);
            mTotalPrice = Float.parseFloat(arr[4]);
            mRecordDate = arr[5];
        }

        private String mDate, mRecordDate;
        private float mPrice, mMonthAccumulativeWater, mTotalPrice, mLeftWater;

        public String getRecordDate() {
            return mRecordDate;
        }

        public float getLeftWater() {
            return mLeftWater;
        }

        public float getMonthAccumulativeWater() {
            return mMonthAccumulativeWater;
        }

        public float getPrice() {
            return mPrice;
        }

        public float getTotalPrice() {
            return mTotalPrice;
        }

        public String getDate() {
            return mDate;
        }
    }
}
