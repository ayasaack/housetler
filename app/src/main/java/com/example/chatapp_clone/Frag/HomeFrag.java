package com.example.chatapp_clone.Frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.chatapp_clone.R;


public class HomeFrag extends Fragment {



    public HomeFrag() {
        // Required empty public constructor
    }
    ImageView Image;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);



        return view;
    }
}