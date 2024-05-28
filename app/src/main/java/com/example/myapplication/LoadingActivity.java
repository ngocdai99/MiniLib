package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityLoadingBinding;

public class LoadingActivity extends AppCompatActivity {

    ActivityLoadingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoadingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoadingActivity.this, LoginActivity.class));
            }
        });
    }
}