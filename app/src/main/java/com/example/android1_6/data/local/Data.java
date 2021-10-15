package com.example.android1_6.data.local;

import com.example.android1_6.R;
import com.example.android1_6.data.models.Coin;

import java.util.ArrayList;

public class Data {

    private ArrayList<Coin> list;

    public ArrayList<Coin> getList() {
        list = new ArrayList<>();
        list.add(new Coin("V-coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("B-coin +","4.00", R.drawable.bcoin ));
        list.add(new Coin("Label","0.00", R.drawable.label ));
        list.add(new Coin("S-coin","6.00", R.drawable.scoin ));
        list.add(new Coin("T-coin","0.00", R.drawable.tcoin ));
        list.add(new Coin("X-coin","40.00", R.drawable.xcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));
        list.add(new Coin("V coin","1.00", R.drawable.vcoin ));

        return list;
    }



}
