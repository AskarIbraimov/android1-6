package com.example.android1_6.ui.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.example.android1_6.R;
import com.example.android1_6.databinding.ActivityMainBinding;
import com.example.android1_6.ui.fragments.FirstFragment.FirstFragment;
import com.example.android1_6.ui.fragments.SecondFragment.SecondFragment;
import com.example.android1_6.ui.fragments.ThirdFragment.ThirdFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ViewPagerAdapter adapter;
    private ArrayList<Fragment> list;
    private String[] titles = {"Exchange","Date & Times","More"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        initAdapter();
    }

    private void initAdapter() {
        adapter = new ViewPagerAdapter(this);
        adapter.setList(getList());
        binding.mainViewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.mainTabs, binding.mainViewPager, (tab, position) -> {
          tab.setText(titles[position]);
        }).attach();

    }

    private ArrayList<Fragment> getList() {
        list = new ArrayList<>();
        list.add(new FirstFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());
        return list;
    }
}