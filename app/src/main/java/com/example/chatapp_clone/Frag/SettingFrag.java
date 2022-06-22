package com.example.chatapp_clone.Frag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chatapp_clone.R;

public class SettingFrag extends Fragment {

    public SettingFrag() {
        // Required empty public constructor
        super(R.layout.fragment_setting);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_setting, container, false);
        return view;
    }
}