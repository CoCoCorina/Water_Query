package com.dev.water_query.entity;

/**
 * @version 版本
 * @ClassName: PayTimeBean
 * @Package com.dev.water_query.entity
 * @Description:
 * @author: Juston
 * @date: 2020/10/20 16:16
 */
public class TimeBean {
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
