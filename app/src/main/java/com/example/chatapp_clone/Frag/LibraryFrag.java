package com.example.chatapp_clone.Frag;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.chatapp_clone.DetailPageActivity;
import com.example.chatapp_clone.R;


public class LibraryFrag extends Fragment {



    public LibraryFrag() {
        // Required empty public constructor
    }

Button xyz;
    ImageView Image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_library, container, false);

        xyz =view.findViewById(R.id.xyz);
        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),DetailPageActivity.class);
                startActivity(i);
            }
        });


        return view;
    }
}