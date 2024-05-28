package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityManagerBinding;

public class ManagerActivity extends AppCompatActivity {

    ActivityManagerBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityManagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}