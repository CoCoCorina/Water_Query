package com.dev.water_query.entity;

import androidx.annotation.LongDef;
import android.util.Log;

import com.dev.water_query.utils.DateConvertUtil;

import java.text.ParseException;
import java.util.Date;

/**
 * @version v1.0
 * @ClassName: PayTimeBean
 * @Package com.dev.water_query.entity
 * @Description:
 * @author: Juston
 * @date: 2020/10/20 16:16
 */
public class DateTimeEntitiy {
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
        try {
            Date date = DateConvertUtil.timeStampToDate(time);
            String dayStr = DateConvertUtil.getDateTimeString(date).substring(8, 10);
            return Integer.parseInt(dayStr);
        } catch (ParseException e) {
            Log.d("WaterQuery", "setTime Error Msg :" + e.getMessage());
        }
        return -1;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHours() {
        try {
            Date date = DateConvertUtil.timeStampToDate(time);
            String yearStr = DateConvertUtil.getDateTimeString(date).substring(11, 13);
            return Integer.parseInt(yearStr);
        } catch (ParseException e) {
            Log.d("WaterQuery", "setTime Error Msg :" + e.getMessage());
        }
        return -1;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        try {
            Date date = DateConvertUtil.timeStampToDate(time);
            String minutesStr = DateConvertUtil.getDateTimeString(date).substring(14, 16);
            return Integer.parseInt(minutesStr);
        } catch (ParseException e) {
            Log.d("WaterQuery", "setTime Error Msg :" + e.getMessage());
        }
        return -1;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getMonth() {
        try {
            Date date = DateConvertUtil.timeStampToDate(time);
            String monthStr = DateConvertUtil.getDateTimeString(date).substring(5, 7);
            return Integer.parseInt(monthStr);
        } catch (ParseException e) {
            Log.d("WaterQuery", "setTime Error Msg :" + e.getMessage());
        }
        return -1;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getSeconds() {
        try {
            Date date = DateConvertUtil.timeStampToDate(time);
            String secondsStr = DateConvertUtil.getDateTimeString(date).substring(17, 19);
            return Integer.parseInt(secondsStr);
        } catch (ParseException e) {
            Log.d("WaterQuery", "setTime Error Msg :" + e.getMessage());
        }
        return -1;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        //毫秒级时间戳 从1970-1-1 8:00开始
        this.time = time + (8 * 60 * 60 * 1000);
    }

    public int getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(int timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public int getYear() {
        try {
            Date date = DateConvertUtil.timeStampToDate(time);
            String yearStr = DateConvertUtil.getDateTimeString(date).substring(0, 4);
            Log.d("Juston", "getYear: " + DateConvertUtil.getDateTimeString(date));
            return Integer.parseInt(yearStr);
        } catch (ParseException e) {
            Log.d("WaterQuery", "setTime Error Msg :" + e.getMessage());
        }
        return -1;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
