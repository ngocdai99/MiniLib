package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.myapplication.Adapters.ViewPager2Adapter;
import com.example.myapplication.databinding.ActivityManagerBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ManagerActivity extends AppCompatActivity {

    ActivityManagerBinding binding;
    ViewPager2Adapter viewPager2Adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityManagerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewPager2Adapter = new ViewPager2Adapter(this);
        binding.viewPager2.setAdapter(viewPager2Adapter);
        new TabLayoutMediator(binding.tabLayout, binding.viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0){
                    tab.setText("Home");
                    tab.setIcon(R.drawable.ic_home);
                } else if (position == 1) {
                    tab.setText("Order");
                    tab.setIcon(R.drawable.ic_order);
                } else if (position == 2) {
                    tab.setText("Profile");
                    tab.setIcon(R.drawable.ic_profile);
                }
            }
        }).attach();


    }
}