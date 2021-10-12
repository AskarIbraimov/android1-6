package com.example.android1_6.data.local;

import com.example.android1_6.R;
import com.example.android1_6.data.models.Coin;

import java.util.ArrayList;

public class Data {

    private ArrayList<Coin> list;

    public ArrayList<Coin> getList() {
        list = new ArrayList<>();
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));

        return list;
    }



}
