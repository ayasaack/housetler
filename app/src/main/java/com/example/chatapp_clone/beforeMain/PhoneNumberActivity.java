package com.example.chatapp_clone.beforeMain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.chatapp_clone.databinding.ActivityPhoneNumberBinding;

public class PhoneNumberActivity extends AppCompatActivity {

    ActivityPhoneNumberBinding phoneBind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        phoneBind =ActivityPhoneNumberBinding.inflate(getLayoutInflater());
         setContentView(phoneBind.getRoot());
        phoneBind.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PhtoOt = new Intent(PhoneNumberActivity.this, OTPActivity.class);
                startActivity(PhtoOt);
                finish();
            }
        });


}}