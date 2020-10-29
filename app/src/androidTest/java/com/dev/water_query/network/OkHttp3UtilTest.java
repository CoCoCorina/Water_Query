package com.dev.water_query.network;

import android.util.Log;

import com.dev.water_query.entity.HalfYearStatisticsEntity;
import com.google.gson.Gson;

import org.junit.Test;

public class OkHttp3UtilTest {

    @Test
    public void httpGet() {
        String qwe= OkHttp3Util.httpGet("http://zn.qlnuqianyun.cn/qlnuznsb/jsonTest/getInfoBySupplyNum.shtml?supplyNum=FYCJ001&flag=0");

        HalfYearStatisticsEntity halfYearStatisticsEntity = new Gson().fromJson(qwe, HalfYearStatisticsEntity.class);
        Log.d("12312321", halfYearStatisticsEntity.getMonthlySt5());
        System.out.printf(qwe);

    }

    @Test
    public void httpPost() {
    }
}