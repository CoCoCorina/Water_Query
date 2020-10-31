package com.dev.water_query.network;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @version: v1.0
 * @ClassName: OkHttpUtil
 * @Package: com.dev.water_query.network
 * @Description: 网络请求工具类，封装OKHttp3
 * @author: Corina
 * @date: 2020/10/28 15:57
 */
public class OkHttp3Util {

    /**
     * @param url      请求的地址
     * @param cls      要转换为的类的class对象
     * @param callBack 请求完成回调函数
     * @return 无
     * @method serializeObjectFromHttpGet
     * @description 通过httpGet请求直接反序列化为对应类的对象
     * @date: 2020/10/29 15:15
     * @author: Juston
     */
    public static void deserializeObjectFromHttpGet(String url, Class<?> cls, CallBack<?> callBack) {
        //构建请求 get方式
        OkHttpClient httpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();

        //开始请求
        httpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.onFailure(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {
                    callBack.onFailure(response.message());
                } else {
                    String resStr = response.body().string();
                    System.out.println(resStr);
                    callBack.onSuccess(new Gson().fromJson(resStr, (Type) cls));
                }
            }
        });

    }
}
