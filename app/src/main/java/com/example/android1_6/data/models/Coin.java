package com.example.android1_6.data.models;

public class Coin {
    private String coinName,coinCost;
    private int imageCoin;

    public Coin(String coinName, String coinCost, int imageCoin) {
        this.coinName = coinName;
        this.coinCost = coinCost;
        this.imageCoin = imageCoin;
    }

    public String getCoinName() {
        return coinName;
    }

    public String getCoinCost() {
        return "USD " + coinCost;
    }

    public int getImageCoin() {
        return imageCoin;
    }
}

