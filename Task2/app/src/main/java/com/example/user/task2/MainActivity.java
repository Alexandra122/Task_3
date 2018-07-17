package com.example.user.task2;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {
    TestReceiver receiver;
    IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       receiver = new TestReceiver();

       intentFilter = new IntentFilter("com.example.user.task2.CUSTOM_INTENT");



    }

    @Override
    protected void onResume() {
        registerReceiver(receiver, intentFilter);
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(receiver);
        super.onDestroy();
    }





}


