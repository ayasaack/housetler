package com.example.chatapp_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.chatapp_clone.databinding.ActivitySplashScreenBinding;

public class SplashScreen extends AppCompatActivity {

    ActivitySplashScreenBinding splashBind ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashBind = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(splashBind.getRoot());
        splashBind.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent SptoPh = new Intent(SplashScreen.this,PhoneNumberActivity.class);
                startActivity(SptoPh);
            }
        });
    }
}