package com.perpetual.investment.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;

import com.perpetual.investment.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new android.os.Handler(Looper.getMainLooper()).postDelayed(
                () -> {
                    startActivity(new Intent(SplashScreen.this, SignInActivity.class));
                    finish();
                },
                1000);
    }
}