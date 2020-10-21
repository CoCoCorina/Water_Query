package com.dev.water_query.entity;

/**
 * @version 版本
 * @ClassName: NoticeEntity
 * @Package com.dev.water_query.entity
 * @Description: 通知实体类
 * @author: Juston
 * @date: 2020/10/21 21:05
 */
public class NoticeEntity {

    public NoticeEntity(String mTitle, String mDate, String mUrl) {
        setDate(mDate);
        setTitle(mTitle);
        setUrl(mUrl);
    }

    private String mTitle, mDate, mUrl;

    public String getDate() {
        return mDate;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setUrl(String mUrl) {
        this.mUrl = mUrl;
    }
}
