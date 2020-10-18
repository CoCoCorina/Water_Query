package com.dev.water_query.entity;

/**
* @description: 半年信息统计
* @date 2020/10/18 18:41
*/

public class SixMonthsStatisticsEntity {

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

    private int status;
    private String end;
    private String realName;
    private String supplyNumber;
    private String phoneNumber;
    private String address;
    private double moneyLeft;
    private double waterLLeft;
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
    }

    public String getMonthlySt1() {
        return monthlySt1;
    }

    public void setMonthlySt1(String monthlySt1) {
        this.monthlySt1 = monthlySt1;
    }

    public String getMonthlySt2() {
        return monthlySt2;
    }

    public void setMonthlySt2(String monthlySt2) {
        this.monthlySt2 = monthlySt2;
    }

    public String getMonthlySt3() {
        return monthlySt3;
    }

    public void setMonthlySt3(String monthlySt3) {
        this.monthlySt3 = monthlySt3;
    }

    public String getMonthlySt4() {
        return monthlySt4;
    }

    public void setMonthlySt4(String monthlySt4) {
        this.monthlySt4 = monthlySt4;
    }

    public String getMonthlySt5() {
        return monthlySt5;
    }

    public void setMonthlySt5(String monthlySt5) {
        this.monthlySt5 = monthlySt5;
    }
}
