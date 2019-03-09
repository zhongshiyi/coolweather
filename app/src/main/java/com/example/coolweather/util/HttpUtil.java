//工具类

package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
    /**
     * 现在我们发起一条HTTP请求只需要调用sendOkHttpRequest()方法，传入请求地址，
     * 并注册一个回调来回处理服务器响应就可以了，由于服务器返回的省市县数据都是
     * JSON格式的，所以我们提供一个类来解析处理这种数据，在util新建一个Utility类
     */
}
