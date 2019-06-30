package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
//用okhttp和服务器进行传输
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
