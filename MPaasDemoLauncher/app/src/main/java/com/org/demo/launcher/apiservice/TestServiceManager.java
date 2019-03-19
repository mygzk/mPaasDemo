package com.org.demo.launcher.apiservice;


import com.org.demo.launcher.TestEnty;
import com.org.demo.launcher.net.ApiSubscribe;
import com.org.demo.launcher.net.BaseEntity;
import com.org.demo.launcher.net.DefaultTransformer;
import com.org.demo.launcher.net.NetCallback;
import com.org.demo.launcher.net.RetrofitManager;

import java.util.HashMap;
import java.util.Map;

/**
 * create by guozhk on 2018/7/17
 **/
public class TestServiceManager {

    private TestService mNetService;

    public static class NetServiceManagerInstance {
        private static TestServiceManager INSTANCE = new TestServiceManager();
    }

    private TestServiceManager() {
        mNetService = RetrofitManager.getInstanse().createService(TestService.class);
    }

    public static TestServiceManager getInstance() {
        return NetServiceManagerInstance.INSTANCE;
    }

   // userKey=e455b2855accee55ee2e6daf0d09823b&currentPageNum=0&rowsOfPage=10
    public void login( NetCallback callback) {
        Map<String,String> params = new HashMap<>();
        params.put("userKey","e455b2855accee55ee2e6daf0d09823b");
        params.put("currentPageNum","0");
        params.put("rowsOfPage","10");
        mNetService.query(params)
                .compose(new DefaultTransformer<BaseEntity<TestEnty>>())
                .subscribe(new ApiSubscribe<TestEnty>(callback));
    }


}
