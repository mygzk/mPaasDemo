package com.org.demo.launcher.net;


import com.org.demo.launcher.R;

/**
 * Created by guozhk on 2018/4/17.
 */

public class HttpConfig {

    public static final long CONNECT_TIME = 10L;
    public static final long READ_TIME = 10L;
    public static final long WRITE_TIME = 10L;
    public static final String BASE_URL = "https://219.142.79.183:8443/";
   // public static final String BASE_URL = "http://dat.dahuobaoxian.com";

    public static final String[] BASE_URLS = new String[]{BASE_URL};


    public static final int[] certificates = {R.raw.dangdang};
}
