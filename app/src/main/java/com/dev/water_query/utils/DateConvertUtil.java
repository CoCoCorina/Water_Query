package com.dev.water_query.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 版本
 * @ClassName: DateConvertUtil
 * @Package com.dev.water_query.utils
 * @Description: 时间转换工具类     通过时间戳计算日期与时间
 * @author: Juston
 * @date: 2020/10/20 16:54
 */
public class DateConvertUtil {

    public static final String FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";

    /**
     * @return 日期
     * @param： 时间戳
     * @method timeStampToDate
     * @description 时间戳转日期
     * @date: 2020/10/20 19:11
     * @author: Juston
     */
    public static Date timeStampToDate(long timeStamp) throws ParseException {
        Date date = new Date();
        date.setTime(timeStamp);
        return date;
    }

    /**
     * @return 时间戳
     * @method dateToTimeStamp
     * @description 日期转时间戳
     * @date: 2020/10/20 19:11
     * @author: Juston
     * @param： 日期
     */
    public static long dateToTimeStamp(Date date) {
        return date.getTime();
    }


    public static String getDateTimeString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat(FORMAT_FULL);
        return df.format(date.getTime());
    }
}
