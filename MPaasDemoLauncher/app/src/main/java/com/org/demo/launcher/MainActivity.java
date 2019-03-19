package com.org.demo.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.org.demo.launcher.apiservice.TestServiceManager;
import com.org.demo.launcher.net.NetCallback;


/**
 * Created by mPaaS on 16/9/28.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.org.demo.launcher.R.layout.main);


        initView();
    }

    private void initView() {

        findViewById(R.id.test1).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.test1:

                test();
                break;
            default:
                break;
        }
    }

    private void test() {
        TestServiceManager.getInstance().login(new NetCallback<TestEnty>() {

            @Override
            public void result(TestEnty testEnty) {

                Log.e("log", "-----testEnty---");

            }

            @Override
            public void fail(String msg) {
                Log.e("log", "-----msg---" + msg);
            }
        });

    }
}
