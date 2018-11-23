package com.example.auvik.shondhan247;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HospitalActivity extends AppCompatActivity {

    private ListView lvProduct2;
    private ProductListAdapterHos adapter2;
    private List<ProductHos> mProductListhos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);


        lvProduct2 = (ListView) findViewById(R.id.hospitalListView);

        mProductListhos = new ArrayList<>();

        mProductListhos.add(new ProductHos("DMC"));
        mProductListhos.add(new ProductHos("Lab Aid"));
        mProductListhos.add(new ProductHos("Central Hospital"));
        mProductListhos.add(new ProductHos("Square Hospital"));
        mProductListhos.add(new ProductHos("Apollo"));
        mProductListhos.add(new ProductHos("Green Life"));


        adapter2 = new ProductListAdapterHos(getApplicationContext(),mProductListhos);
        lvProduct2.setAdapter(adapter2);
    }
}
