package com.dev.water_query.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @description: 利用SharedPreferences本地存储水表号
 * @date 2020/10/19 10:03
 */

public class SharedPreferencesUtil {

    private static android.content.SharedPreferences share(Context context) {
        SharedPreferences sharedPreferences = context
                .getSharedPreferences("data", Context.MODE_PRIVATE);
        return sharedPreferences;
    }

    /**
     * @return SupplyNumber
     * @description: 获取水表号
     * @date 2020/10/19 10:08
     */
    public static Object getSupplyNumber(Context context) {
        return share(context).getString("SupplyNumber", null);
    }

    /**
     * @return bool
     * @description: 写入水表号
     * @date 2020/10/19 10:07
     */
    public static boolean setSupplyNumber(String mSupplyNumber, Context context) {
        android.content.SharedPreferences.Editor e = share(context).edit();
        e.putString("SupplyNumber", mSupplyNumber);
        Boolean bool = e.commit();
        return bool;
    }
}
