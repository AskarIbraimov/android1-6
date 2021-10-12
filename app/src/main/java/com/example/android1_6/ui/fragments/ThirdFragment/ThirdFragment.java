package com.example.android1_6.ui.fragments.ThirdFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import com.bumptech.glide.Glide;
import com.example.android1_6.R;
import com.example.android1_6.databinding.FragmentThirdBinding;


public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentThirdBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       switchImages();
    }

    private void switchImages() {
        binding.switcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean clicked) {
                switch (button.getId()) {
                    case R.id.switcher:
                        if (clicked) {
                            Glide.with(binding.getRoot())
                                    .load("https://champagnat.org/wp-content/uploads/2020/09/EN-Celebration-TW-1.png")
                                    .into(binding.imgSwitch);
                        } else {
                            Glide.with(binding.getRoot())
                                    .load("https://www.trocaire.org/wp-content/uploads/2021/07/Capture-1.png")
                                    .into(binding.imgSwitch);
                        }
                }
            }
        });
    }
}