package com.org.demo.launcher.net.down;


/**
 * Create by guozhk
 * Date : 2018/11/20
 * Dre : 进度监听
 **/
public interface IProcessListener {

    void onStart();

    void onProgress(int progress);

    void onFinishDownload();

    void onFail(String errorInfo);
}
