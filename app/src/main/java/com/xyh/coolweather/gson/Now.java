package com.xyh.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by yinhuan on 2017/1/9.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
