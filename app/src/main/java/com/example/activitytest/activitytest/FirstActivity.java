package com.example.activitytest.activitytest;

import android.app.Activity;
import android.os.Bundle;

public class FirstActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
    }
}