package com.example.android1_6.ui.fragments.FirstFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1_6.data.models.Coin;
import com.example.android1_6.databinding.ItemCoinRvBinding;

import java.util.ArrayList;

public class FirstFragmentAdapter extends RecyclerView.Adapter<FirstFragmentAdapter.ViewHolder> {

    private ArrayList<Coin> list;

    public void setList(ArrayList<Coin> list) {
        this.list = new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCoinRvBinding binding = ItemCoinRvBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private  ItemCoinRvBinding binding;
        public ViewHolder(@NonNull ItemCoinRvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(Coin coin) {
          binding.coinName.setText(coin.getCoinName());
          binding.coinCost.setText(coin.getCoinCost());
          binding.coinImage.setImageResource(coin.getImageCoin());

        }
    }
}
