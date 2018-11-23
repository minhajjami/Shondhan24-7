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

public class ProductListAdapterHos extends BaseAdapter {

    private Context mContexthos;
    private List<ProductHos> mProductListhos;

    public ProductListAdapterHos(Context mContexthos,List<ProductHos>mProductListhos) {

        this.mContexthos = mContexthos;
        this.mProductListhos = mProductListhos;
    }

    @Override
    public int getCount() {
        return mProductListhos.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductListhos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContexthos, R.layout.item_product_listhos, null);
        TextView dmc = (TextView) v.findViewById(R.id.DmcText);
        Button btnhosCall = (Button) v.findViewById(R.id.DmcCall);
        Button btnhosMap = (Button) v.findViewById(R.id.DmcMap);

        dmc.setText(mProductListhos.get(position).getHospital());

        v.setTag(mProductListhos.get(position).getHospital());


        return v;
    }
}
