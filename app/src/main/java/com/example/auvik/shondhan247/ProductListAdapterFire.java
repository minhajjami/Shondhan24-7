package com.example.auvik.shondhan247;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Auvik on 08-Jan-17.
 */

public class ProductListAdapterFire extends BaseAdapter {

    private Context mContextfire;
    private List<ProductFire> mProductListfire;

    public ProductListAdapterFire(Context mContextfire, List<ProductFire> mProductListfire) {
        this.mContextfire = mContextfire;
        this.mProductListfire = mProductListfire;
    }

    @Override
    public int getCount() {
        return mProductListfire.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductListfire.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContextfire, R.layout.item_product_fire, null);
        TextView fireser = (TextView)v.findViewById(R.id.fireText);
        Button btnfireCall = (Button)v.findViewById(R.id.fireCall);
        Button btnfireMap = (Button)v.findViewById(R.id.fireMap);

        fireser.setText(mProductListfire.get(position).getFire());

        v.setTag(mProductListfire.get(position).getFire());


        return v;
    }
}
