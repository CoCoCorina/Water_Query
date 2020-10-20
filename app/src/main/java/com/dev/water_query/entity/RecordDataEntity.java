package com.dev.water_query.entity;

import java.util.List;

/**
 * @description: 运行数据
 * @date 2020/10/18 18:30
 */

public class RecordDataEntity {


    private List<SssBean> sss;

    public List<SssBean> getSss() {
        return sss;
    }

    public void setSss(List<SssBean> sss) {
        this.sss = sss;
    }

    public static class SssBean {
        /**
         * accumuFlowDaily : 1266.01080
         * baseInfoId : 1
         * batterylevel : 100
         * checksum : 1
         * deviceId : 99461670-83df-46c0-8b1e-41167623addd
         * eventTime : 20190730T140019Z
         * id : 2495
         * manuID : 1
         * receiveTime : {"date":22,"day":0,"hours":11,"minutes":54,"month":11,"seconds":40,"time":1576986880000,"timezoneOffset":-480,"year":119}
         * serialNum : 2
         * temp :
         * timeD : 47154
         * timeU : 23863
         */

        //累计流量
        private String accumuFlowDaily;
        //基本信息id
        private int baseInfoId;
        //电池等级
        private String batterylevel;
        //检验和
        private String checksum;
        //设备id
        private String deviceId;
        //事件时间
        private String eventTime;
        //id
        private int id;
        private String manuID;
        //接受时间
        private TimeBean receiveTime;
        //串号
        private String serialNum;
        private String temp;
        private String timeD;
        private String timeU;

        public String getAccumuFlowDaily() {
            return accumuFlowDaily;
        }

        public void setAccumuFlowDaily(String accumuFlowDaily) {
            this.accumuFlowDaily = accumuFlowDaily;
        }

        public int getBaseInfoId() {
            return baseInfoId;
        }

        public void setBaseInfoId(int baseInfoId) {
            this.baseInfoId = baseInfoId;
        }

        public String getBatterylevel() {
            return batterylevel;
        }

        public void setBatterylevel(String batterylevel) {
            this.batterylevel = batterylevel;
        }

        public String getChecksum() {
            return checksum;
        }

        public void setChecksum(String checksum) {
            this.checksum = checksum;
        }

        public String getDeviceId() {
            return deviceId;
        }

        public void setDeviceId(String deviceId) {
            this.deviceId = deviceId;
        }

        public String getEventTime() {
            return eventTime;
        }

        public void setEventTime(String eventTime) {
            this.eventTime = eventTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getManuID() {
            return manuID;
        }

        public void setManuID(String manuID) {
            this.manuID = manuID;
        }

        public TimeBean getReceiveTime() {
            return receiveTime;
        }

        public void setReceiveTime(TimeBean receiveTime) {
            this.receiveTime = receiveTime;
        }

        public String getSerialNum() {
            return serialNum;
        }

        public void setSerialNum(String serialNum) {
            this.serialNum = serialNum;
        }

        public String getTemp() {
            return temp;
        }

        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getTimeD() {
            return timeD;
        }

        public void setTimeD(String timeD) {
            this.timeD = timeD;
        }

        public String getTimeU() {
            return timeU;
        }

        public void setTimeU(String timeU) {
            this.timeU = timeU;
        }
    }
}
