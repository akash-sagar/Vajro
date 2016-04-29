package com.example.akash.vajro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Pie extends AppCompatActivity {
    private PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);
        pieChart = (PieChart)findViewById(R.id.chart);

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(new BarEntry(839, 0));
        entries.add(new BarEntry(900, 1));
        entries.add(new BarEntry(1000, 2));
        entries.add(new BarEntry(1199, 3));


        PieDataSet dataset = new PieDataSet(entries, "Superhero t-shirt Price Chart For Different Size");

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
