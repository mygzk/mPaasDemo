package com.org.demo.launcher;

import android.app.Activity;
import android.os.Bundle;


/**
 * Created by mPaaS on 16/9/28.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.org.demo.launcher.R.layout.main);
    }
}
