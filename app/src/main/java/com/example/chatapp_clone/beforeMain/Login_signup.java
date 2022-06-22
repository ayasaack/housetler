package com.example.chatapp_clone.beforeMain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.chatapp_clone.Mlogin;
import com.example.chatapp_clone.R;
import com.example.chatapp_clone.databinding.ActivityLoginSignupBinding;

public class Login_signup extends AppCompatActivity {

    ActivityLoginSignupBinding acts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acts = ActivityLoginSignupBinding.inflate(getLayoutInflater());
        setContentView(acts.getRoot());

        acts.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.constrains,new Mlogin()).commit();
            }
        });

    }
}