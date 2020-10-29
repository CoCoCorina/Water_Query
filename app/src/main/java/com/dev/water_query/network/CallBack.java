package com.dev.water_query.network;

/**
 * @version 版本
 * @ClassName: CallBack
 * @Package com.dev.water_query.network
 * @Description: 请求结果 回调函数
 * @author: Juston
 * @date: 2020/10/29 14:46
 */
public interface CallBack<T> {
    /**
     * @param errorMsg 错误信息
     * @return 无
     * @method onFailure
     * @description 请求失败回调函数
     * @date: 2020/10/29 14:51
     * @author: Juston
     */
    void onFailure(String errorMsg);

    /**
     * @param obj 序列化后的实体
     * @return 无
     * @method onSuccess
     * @description 请求成功回调函数
     * @date: 2020/10/29 14:51
     * @author: Juston
     */
    void onSuccess(T obj);
}
