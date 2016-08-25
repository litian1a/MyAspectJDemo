package com.example.litiancheng.myaspectjdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.aspectj.lang.annotation.Aspect;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @LogTrace("按钮点击事件")
    public void click(View view) {



    }
}
