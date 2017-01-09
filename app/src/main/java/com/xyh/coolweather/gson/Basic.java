package com.xyh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yinhuan on 2017/1/9.
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
