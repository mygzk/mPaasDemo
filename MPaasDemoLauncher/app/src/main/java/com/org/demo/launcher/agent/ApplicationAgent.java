package com.org.demo.launcher.agent;

import android.app.Application;
import android.util.Log;

import com.alipay.mobile.framework.LauncherApplicationAgent;

/**
 * create by guozhk on 2019/3/19 14:48
 **/
public class ApplicationAgent extends LauncherApplicationAgent {



    private String TAG = ApplicationAgent.class.getCanonicalName();

    public ApplicationAgent(Application context, Object bundleContext) {
        super(context, bundleContext);
    }


    public Application getApp() {

        return getApplicationContext();
    }

    @Override
    public void preInit() {
        super.preInit();

        Log.e(TAG, "--===preInit--=-");
    }


    @Override
    public void postInit() {
        super.postInit();
        Log.e(TAG, "--===postInit--=-");
    }

}
