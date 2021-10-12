package com.example.android1_6.ui.fragments.SecondFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.android1_6.R;
import com.example.android1_6.databinding.FragmentSecondBinding;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.time.setText(new SimpleDateFormat("hh:mm dd/MM/yyyy").format(new Date(System.currentTimeMillis())));

        Glide.with(binding.getRoot())
                .load("https://koenig-media.raywenderlich.com/uploads/2019/05/Glide-feature-1.png")
                .into(binding.imgSecond);
    }
}