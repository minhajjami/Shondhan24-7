package com.example.auvik.shondhan247;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FireActivity extends AppCompatActivity {

    private ListView lvProduct1;
    private ProductListAdapterFire adapter1;
    private List<ProductFire> mProductListfire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
        lvProduct1 = (ListView) findViewById(R.id.fireListView);

        mProductListfire = new ArrayList<>();

        mProductListfire.add(new ProductFire("Lalbag"));
        mProductListfire.add(new ProductFire("Mommadpur"));
        mProductListfire.add(new ProductFire("Dhanmondi"));
        mProductListfire.add(new ProductFire("Shaymoli"));
        mProductListfire.add(new ProductFire("Uttara"));
        mProductListfire.add(new ProductFire("Paltan"));


        adapter1 = new ProductListAdapterFire(getApplicationContext(),mProductListfire);
        lvProduct1.setAdapter(adapter1);
    }
}
