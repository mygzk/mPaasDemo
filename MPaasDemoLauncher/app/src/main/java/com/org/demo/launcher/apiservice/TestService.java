package com.org.demo.launcher.apiservice;

import com.org.demo.launcher.LoginEntity;
import com.org.demo.launcher.TestEnty;
import com.org.demo.launcher.net.BaseEntity;
import com.org.demo.launcher.net.RequestJsonBody;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

/**
 * create by guozhk on 2019/3/19 11:11
 **/
public interface TestService {

    @FormUrlEncoded
    @POST("pcs/api/rest/meeting/n001")
    Observable<BaseEntity<TestEnty>> query(@QueryMap Map<String, String> qury, @FieldMap Map<String, String> params);



    Observable<BaseEntity<LoginEntity>> login(@FieldMap Map<String, String> params);

    @Headers({"Content-Type: application/json","Accept: application/json"})//需要添加头
    @POST("dangdang/login")
    Observable<BaseEntity<LoginEntity>> login1(@Body RequestJsonBody info);

}
