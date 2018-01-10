package com.baidumap.sample;

import android.app.Application;

import baidumapsdk.demo.BaiduMapSDK;

/**
 * Created by net on 2018/1/10.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        BaiduMapSDK.init(this);
    }
}
