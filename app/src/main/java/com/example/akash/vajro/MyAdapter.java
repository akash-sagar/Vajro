package com.example.akash.vajro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by akash on 28-04-2016.
 */
public class MyAdapter extends ArrayAdapter<Item> {
    private final Context context;
    private final ArrayList<Item> itemsArrayList;

    public MyAdapter(Context context, ArrayList<Item> itemsArrayList) {

        super(context, R.layout.row, itemsArrayList);

        this.context = context;
        this.itemsArrayList = itemsArrayList;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // 3. Get the two text view from the rowView
        TextView tshirtView = (TextView) rowView.findViewById(R.id.textView);
        TextView brandView = (TextView) rowView.findViewById(R.id.textView2);
        TextView priceView = (TextView) rowView.findViewById(R.id.textView3);

        // 4. Set the text for textView
        tshirtView.setText(itemsArrayList.get(position).getTshirt());
        brandView.setText(itemsArrayList.get(position).getBrand());
        priceView.setText(itemsArrayList.get(position).getPrice());
        // 5. retrn rowView
        return rowView;
    }
}
