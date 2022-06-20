package com.example.chatapp_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatapp_clone.Frag.LibraryFrag;
import com.example.chatapp_clone.Frag.ProfileFrag;
import com.example.chatapp_clone.Frag.SearchFrag;
import com.example.chatapp_clone.databinding.ActivityMainBinding;

import java.util.ArrayList;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act ;

//
//    ArrayList<Users> users;
//    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        act = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(act.getRoot());
//
//        users = new ArrayList<>();
//        userAdapter =new UserAdapter(this, users);
//        act.recycle.setAdapter(UserAdapter);



        act.bottomNav.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                switch (i) {
                    case 0:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new LibraryFrag()).commit();
                        break;
                    case 1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new SearchFrag()).commit();
                        break;
                    case 2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new ProfileFrag()).commit();
                        break;
                    default:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame, new LibraryFrag()).commit();
                        break;

                }
                return false;
            }
        });


    }
}
