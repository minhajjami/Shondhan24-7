package com.example.auvik.shondhan247;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Auvik on 07-Jan-17.
 */

public class ProductListAdapter extends BaseAdapter{

    private Context mContext;
    private List<Product> mProductList;


    public ProductListAdapter(Context mContext, List<Product> mProductList) {
        this.mContext = mContext;
        this.mProductList = mProductList;
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContext, R.layout.item_product_list, null);
        TextView adabor = (TextView) v.findViewById(R.id.AdaborText);
        Button btnCall = (Button) v.findViewById(R.id.AdaborCall);
        Button btnMap = (Button) v.findViewById(R.id.AdaborMap);

        adabor.setText(mProductList.get(position).getThana());

        v.setTag(mProductList.get(position).getThana());

        return v;
    }
}
