package com.example.auvik.shondhan247;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PoliceActivity extends AppCompatActivity {

    private ListView lvProduct;
    private ProductListAdapter adapter;
    private List<Product> mProductList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);


        lvProduct=(ListView)findViewById(R.id.policeListView);

        mProductList=new ArrayList<>();

        mProductList.add(new Product("Adabor"));
        mProductList.add(new Product("Bangshal"));
        mProductList.add(new Product("Dhanmondi"));
        mProductList.add(new Product("Mirpur"));
        mProductList.add(new Product("Tejgaon"));
        mProductList.add(new Product("Banani"));

        adapter =new ProductListAdapter(getApplicationContext(),mProductList);
        lvProduct.setAdapter(adapter);



    }
}
