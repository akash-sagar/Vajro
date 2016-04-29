package com.example.akash.vajro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class College extends AppCompatActivity {
    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college);
        pieChart = (PieChart)findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new BarEntry(600, 0));
        entries.add(new BarEntry(700, 1));
        entries.add(new BarEntry(850, 2));
        entries.add(new BarEntry(900, 3));


        PieDataSet dataset = new PieDataSet(entries, "College t-shirt Price Chart For Different Size");

        ArrayList<String> labels = new ArrayList<String>();
        labels.add("SMALL");
        labels.add("MEDIUM");
        labels.add("LARGE");
        labels.add("XL");


        PieData data1 = new PieData(labels, dataset);
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.setData(data1);
        pieChart.animateY(5000);
    }
}
