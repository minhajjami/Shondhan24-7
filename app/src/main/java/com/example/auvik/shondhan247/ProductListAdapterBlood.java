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

public class ProductListAdapterBlood extends BaseAdapter{

    private Context mContextblood;
    private List<ProductBlood> mProductListblood;

    public ProductListAdapterBlood(Context mContextblood, List<ProductBlood> mProductListblood) {
        this.mContextblood = mContextblood;
        this.mProductListblood = mProductListblood;
    }

    @Override
    public int getCount() {
        return mProductListblood.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductListblood.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = View.inflate(mContextblood, R.layout.item_product_blood, null);
        TextView blood1= (TextView)v.findViewById(R.id.bloodText);
        Button btnbloodCall = (Button)v.findViewById(R.id.bloodCall);
        Button btnbloodMap = (Button)v.findViewById(R.id.bloodMap);

        blood1.setText(mProductListblood.get(position).getBlood());

        v.setTag(mProductListblood.get(position).getBlood());


        return v;
    }
}
