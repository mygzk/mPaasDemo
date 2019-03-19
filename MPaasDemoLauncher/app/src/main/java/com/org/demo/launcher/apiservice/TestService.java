package com.org.demo.launcher.apiservice;

import com.org.demo.launcher.TestEnty;
import com.org.demo.launcher.net.BaseEntity;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * create by guozhk on 2019/3/19 11:11
 **/
public interface TestService {

    @FormUrlEncoded
    @POST("pcs/api/rest/meeting/n001")
    Observable<BaseEntity<TestEnty>> query(@QueryMap Map<String,String> qury);
}
