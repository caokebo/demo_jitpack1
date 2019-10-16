package com.visionet.liberty.demo_jitpack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.visionet.liberty.mylibrary.utils.libraryUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        libraryUtil.testFunction();
    }
}
