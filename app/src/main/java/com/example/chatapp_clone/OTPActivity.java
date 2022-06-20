package com.example.chatapp_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chatapp_clone.databinding.ActivityOtpactivityBinding;

public class OTPActivity extends AppCompatActivity {

    ActivityOtpactivityBinding otpBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        otpBind =ActivityOtpactivityBinding.inflate(getLayoutInflater());
        setContentView(otpBind.getRoot());
        otpBind.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OttoMa = new Intent(OTPActivity.this,MainActivity.class);
                startActivity(OttoMa);
            }
        });
    }
}