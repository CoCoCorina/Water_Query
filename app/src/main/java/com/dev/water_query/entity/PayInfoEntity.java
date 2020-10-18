package com.dev.water_query.entity;

import java.util.List;

/**
 * @description: 缴费明细信息
 * @date 2020/10/18 18:27
 */

public class PayInfoEntity {

    /**
     * left : 2248.22
     * sss : [{"id":32,"money":1,"moneyAfterPay":2248.22,"moneyBeforePay":2247.22,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":17,"day":2,"hours":8,"minutes":40,"month":2,"seconds":57,"time":1584405657000,"timezoneOffset":-480,"year":120},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":574.909476,"waterBeforePay":574.671381},{"id":31,"money":1,"moneyAfterPay":2247.22,"moneyBeforePay":2246.22,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":19,"day":3,"hours":16,"minutes":10,"month":1,"seconds":10,"time":1582099810000,"timezoneOffset":-480,"year":120},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":574.671381,"waterBeforePay":574.433286},{"id":30,"money":0.01,"moneyAfterPay":2246.22,"moneyBeforePay":2246.21,"openId":"o1ecN5OP3hj10psTtfa1a617xQyk","payTime":{"date":14,"day":2,"hours":23,"minutes":47,"month":0,"seconds":17,"time":1579016837000,"timezoneOffset":-480,"year":120},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":574.433286,"waterBeforePay":574.430905},{"id":29,"money":1,"moneyAfterPay":2246.21,"moneyBeforePay":2245.21,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":29,"day":5,"hours":15,"minutes":46,"month":10,"seconds":28,"time":1575013588000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":574.430905,"waterBeforePay":574.19281},{"id":28,"money":1,"moneyAfterPay":2245.21,"moneyBeforePay":2244.21,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":29,"day":5,"hours":13,"minutes":9,"month":10,"seconds":27,"time":1575004167000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":574.19281,"waterBeforePay":573.954714},{"id":27,"money":1,"moneyAfterPay":2244.21,"moneyBeforePay":2243.21,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":29,"day":5,"hours":13,"minutes":6,"month":10,"seconds":45,"time":1575004005000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.954714,"waterBeforePay":573.716619},{"id":26,"money":1,"moneyAfterPay":2243.21,"moneyBeforePay":2242.21,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":21,"day":4,"hours":11,"minutes":53,"month":10,"seconds":5,"time":1574308385000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.716619,"waterBeforePay":573.478524},{"id":25,"money":0.01,"moneyAfterPay":2242.21,"moneyBeforePay":2242.2,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":17,"day":4,"hours":21,"minutes":4,"month":9,"seconds":39,"time":1571317479000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.478524,"waterBeforePay":573.476143},{"id":22,"money":0.01,"moneyAfterPay":2242.2,"moneyBeforePay":2242.19,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":25,"day":0,"hours":1,"minutes":34,"month":7,"seconds":23,"time":1566668063000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.476143,"waterBeforePay":573.473762},{"id":20,"money":0.01,"moneyAfterPay":2242.19,"moneyBeforePay":2242.18,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":13,"day":2,"hours":11,"minutes":4,"month":7,"seconds":13,"time":1565665453000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.473762,"waterBeforePay":573.471381},{"id":19,"money":0.01,"moneyAfterPay":2242.18,"moneyBeforePay":2242.17,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":13,"day":2,"hours":0,"minutes":2,"month":7,"seconds":50,"time":1565625770000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.471381,"waterBeforePay":573.469},{"id":18,"money":0.01,"moneyAfterPay":2242.17,"moneyBeforePay":2242.16,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":12,"day":1,"hours":11,"minutes":47,"month":7,"seconds":30,"time":1565581650000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.469,"waterBeforePay":573.466619},{"id":17,"money":0.03,"moneyAfterPay":2242.16,"moneyBeforePay":2242.13,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":27,"day":6,"hours":21,"minutes":35,"month":6,"seconds":12,"time":1564234512000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.466619,"waterBeforePay":573.459476},{"id":16,"money":0.03,"moneyAfterPay":2242.13,"moneyBeforePay":2242.1,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":21,"minutes":18,"month":6,"seconds":57,"time":1563974337000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.459476,"waterBeforePay":573.452333},{"id":15,"money":0.02,"moneyAfterPay":2242.1,"moneyBeforePay":2242.08,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":21,"minutes":17,"month":6,"seconds":4,"time":1563974224000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.452333,"waterBeforePay":573.447571},{"id":14,"money":1,"moneyAfterPay":2242.08,"moneyBeforePay":2241.08,"openId":"o1ecN5BUZ5UTP5J_DYHCt2_KGR18","payTime":{"date":24,"day":3,"hours":18,"minutes":18,"month":6,"seconds":40,"time":1563963520000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.447571,"waterBeforePay":573.209476},{"id":13,"money":0.01,"moneyAfterPay":2241.08,"moneyBeforePay":2241.07,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":18,"minutes":5,"month":6,"seconds":26,"time":1563962726000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.209476,"waterBeforePay":573.207095},{"id":11,"money":0.01,"moneyAfterPay":2241.07,"moneyBeforePay":2241.06,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":18,"minutes":4,"month":6,"seconds":16,"time":1563962656000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.207095,"waterBeforePay":573.204714},{"id":8,"money":0.01,"moneyAfterPay":2241.06,"moneyBeforePay":2241.05,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":14,"minutes":32,"month":6,"seconds":14,"time":1563949934000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.204714,"waterBeforePay":573.202333},{"id":7,"money":0.01,"moneyAfterPay":2241.05,"moneyBeforePay":2241.04,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":0,"minutes":0,"month":6,"seconds":0,"time":1563897600000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.202333,"waterBeforePay":573.199952},{"id":4,"money":0.01,"moneyAfterPay":2241.04,"moneyBeforePay":2241.03,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":0,"minutes":0,"month":6,"seconds":0,"time":1563897600000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.199952,"waterBeforePay":573.197571},{"id":3,"money":0.01,"moneyAfterPay":2241.03,"moneyBeforePay":2241.02,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":4,"minutes":0,"month":6,"seconds":0,"time":1563912000000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.197571,"waterBeforePay":573.19519},{"id":2,"money":0.01,"moneyAfterPay":2241.02,"moneyBeforePay":2241.01,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":0,"minutes":0,"month":6,"seconds":0,"time":1563897600000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.19519,"waterBeforePay":573.19281},{"id":1,"money":0.01,"moneyAfterPay":2241.01,"moneyBeforePay":2241,"openId":"o1ecN5DOrF7r5yiEmBi-cA4n4vO0","payTime":{"date":24,"day":3,"hours":0,"minutes":0,"month":6,"seconds":0,"time":1563897600000,"timezoneOffset":-480,"year":119},"phoneNumber":"","supplyNumber":"FYCJ001","waterAfterPay":573.19281,"waterBeforePay":573.190429}]
     */

    private double left;
    private List<SssBean> sss;

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public List<SssBean> getSss() {
        return sss;
    }

    public void setSss(List<SssBean> sss) {
        this.sss = sss;
    }

    public static class SssBean {
        /**
         * id : 32
         * money : 1
         * moneyAfterPay : 2248.22
         * moneyBeforePay : 2247.22
         * openId : o1ecN5BUZ5UTP5J_DYHCt2_KGR18
         * payTime : {"date":17,"day":2,"hours":8,"minutes":40,"month":2,"seconds":57,"time":1584405657000,"timezoneOffset":-480,"year":120}
         * phoneNumber :
         * supplyNumber : FYCJ001
         * waterAfterPay : 574.909476
         * waterBeforePay : 574.671381
         */

        private int id;
        private int money;
        private double moneyAfterPay;
        private double moneyBeforePay;
        private String openId;
        private PayTimeBean payTime;
        private String phoneNumber;
        private String supplyNumber;
        private double waterAfterPay;
        private double waterBeforePay;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        public double getMoneyAfterPay() {
            return moneyAfterPay;
        }

        public void setMoneyAfterPay(double moneyAfterPay) {
            this.moneyAfterPay = moneyAfterPay;
        }

        public double getMoneyBeforePay() {
            return moneyBeforePay;
        }

        public void setMoneyBeforePay(double moneyBeforePay) {
            this.moneyBeforePay = moneyBeforePay;
        }

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public PayTimeBean getPayTime() {
            return payTime;
        }

        public void setPayTime(PayTimeBean payTime) {
            this.payTime = payTime;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getSupplyNumber() {
            return supplyNumber;
        }

        public void setSupplyNumber(String supplyNumber) {
            this.supplyNumber = supplyNumber;
        }

        public double getWaterAfterPay() {
            return waterAfterPay;
        }

        public void setWaterAfterPay(double waterAfterPay) {
            this.waterAfterPay = waterAfterPay;
        }

        public double getWaterBeforePay() {
            return waterBeforePay;
        }

        public void setWaterBeforePay(double waterBeforePay) {
            this.waterBeforePay = waterBeforePay;
        }

        public static class PayTimeBean {
            /**
             * date : 17
             * day : 2
             * hours : 8
             * minutes : 40
             * month : 2
             * seconds : 57
             * time : 1584405657000
             * timezoneOffset : -480
             * year : 120
             */

            private int date;
            private int day;
            private int hours;
            private int minutes;
            private int month;
            private int seconds;
            private long time;
            private int timezoneOffset;
            private int year;

            public int getDate() {
                return date;
            }

            public void setDate(int date) {
                this.date = date;
            }

            public int getDay() {
                return day;
            }

            public void setDay(int day) {
                this.day = day;
            }

            public int getHours() {
                return hours;
            }

            public void setHours(int hours) {
                this.hours = hours;
            }

            public int getMinutes() {
                return minutes;
            }

            public void setMinutes(int minutes) {
                this.minutes = minutes;
            }

            public int getMonth() {
                return month;
            }

            public void setMonth(int month) {
                this.month = month;
            }

            public int getSeconds() {
                return seconds;
            }

            public void setSeconds(int seconds) {
                this.seconds = seconds;
            }

            public long getTime() {
                return time;
            }

            public void setTime(long time) {
                this.time = time;
            }

            public int getTimezoneOffset() {
                return timezoneOffset;
            }

            public void setTimezoneOffset(int timezoneOffset) {
                this.timezoneOffset = timezoneOffset;
            }

            public int getYear() {
                return year;
            }

            public void setYear(int year) {
                this.year = year;
            }
        }
    }
}
