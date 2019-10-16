package com.visionet.liberty.demo_jitpack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.visionet.liberty.mylibrary.utils.libraryUtil;

public class MainActivity extends AppCompatActivity {

    public TextView tv_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        libraryUtil.testFunction();
        tv_test = findViewById(R.id.tv_test);
        tv_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,com.visionet.liberty.mylibrary.utils.TestActivity.class);
                startActivity(intent);
            }
        });
    }
}
