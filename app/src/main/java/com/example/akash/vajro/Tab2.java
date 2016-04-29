package com.example.akash.vajro;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by akash on 27-04-2016.
 */
public class Tab2 extends Fragment implements AdapterView.OnItemClickListener{

    ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab2,container,false);
        MyAdapter adapter = new MyAdapter(getActivity(), generateData());
        ListView listView = (ListView)view.findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return  view;
    }

    private ArrayList<Item> generateData(){

        items.add(new Item("SUPERHERO","LEE","839-1199"));
        items.add(new Item("WORK","U.S.POLO ASSN","2000"));
        items.add(new Item("LEISURE", "KILLER","899-1259"));
        items.add(new Item("PERFORMANCE", "PUMA","1500"));
        items.add(new Item("TRAVEL", "WRANGLER","500"));
        items.add(new Item("COLLEGE", "PEPE JEANS","600-900"));
        items.add(new Item("1 POCKET", "UNITED COLORS OF BENETTON","900"));


        return items;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0){

            Intent i = new Intent(getActivity().getBaseContext(),Pie.class);
            startActivity(i);
        }else if (position == 1){
            Intent i1 = new Intent(getActivity().getBaseContext(),Main2Activity.class);
            startActivity(i1);
        }else if (position == 2){
            Intent i2 = new Intent(getActivity().getBaseContext(),Lesiure.class);
            startActivity(i2);
        }else if (position == 3){
            Intent i3 = new Intent(getActivity().getBaseContext(),Per.class);
            startActivity(i3);
        }else if (position == 4){
            Intent i4 = new Intent(getActivity().getBaseContext(),Travel.class);
            startActivity(i4);
        }else if (position == 5){
            Intent i5 = new Intent(getActivity().getBaseContext(),College.class);
            startActivity(i5);
        }else if (position == 6){
            Intent i6 = new Intent(getActivity().getBaseContext(),Pocket.class);
            startActivity(i6);
        }

    }
}
