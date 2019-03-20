package com.org.demo.launcher;

import android.app.Application;

/**
 * create by guozhk on 2019/3/19 14:25
 **/

public class App extends Application {
    private static App mApp;
    @Override
    public void onCreate() {
        mApp = this;
        super.onCreate();
    }

    public static App getApp(){
        return mApp;
    }
}
