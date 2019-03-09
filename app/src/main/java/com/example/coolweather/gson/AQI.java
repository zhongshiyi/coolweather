package com.example.coolweather.gson;

public class AQI {
    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}

/**
 * 返回数据的大致格式
 * {
 *     "HeWeather":[
 *         {
 *             "status":"ok",
 *             "basic":{},
 *             "aqi":{},
 *             "now":{},
 *             "suggestion":{},
 *             "daily_forecast":[]
 *         }
 *     ]
 * }
 * 其中basic、aqi、now、suggestion和daily_forecast定义为5个实体类
 */
