package com.example.android.careapp;


import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() !=null) {

            getSupportActionBar().hide();
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startService(new Intent(MainActivity.this, onAppKilled.class));
                        Intent intent = new Intent(MainActivity.this, CustomerLoginActivity.class);
                        startActivity(intent);
                        finish();

                    }
                },SPLASH_TIME_OUT);
    }

}




