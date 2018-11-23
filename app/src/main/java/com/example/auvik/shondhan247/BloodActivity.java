package com.example.auvik.shondhan247;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class BloodActivity extends AppCompatActivity {

    private ListView lvProduct3;
    private ProductListAdapterBlood adapter3;
    private List<ProductBlood> mProductListBlood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

        lvProduct3=(ListView)findViewById(R.id.bloodListView);

        mProductListBlood = new ArrayList<>();

        mProductListBlood.add(new ProductBlood("Shondhani"));
        mProductListBlood.add(new ProductBlood("Badhan"));
        mProductListBlood.add(new ProductBlood("Shondon"));
        mProductListBlood.add(new ProductBlood("Sphuron"));
        mProductListBlood.add(new ProductBlood("DU Blood Bank"));
        mProductListBlood.add(new ProductBlood("Comfort Blood Bank"));


        adapter3 = new ProductListAdapterBlood(getApplicationContext(),mProductListBlood);
        lvProduct3.setAdapter(adapter3);


    }
}
