package com.example.krackit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CIVIL extends AppCompatActivity {
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);
        ListView lv2=findViewById(R.id.lv2);
        List<String> l2=new ArrayList<>();
        l2.add("M1");
        l2.add("ENGINEERING PHYSICS");
        l2.add("PROGRAMMING FOR PROBLEM SOLVING");
        l2.add("ENGINEERING GRAPHICS");
        l2.add("M2");
        l2.add("CHEMISTRY");
        l2.add("ENGINEERING MECHANICS");
        l2.add("ENGINEERING WORKSHOP");
        l2.add("ENGLISH");
        l2.add("SURVIVING AND GEOMATICS");
        l2.add("ENGINEERING GEOLOGY");
        l2.add("STENGTH OF MATERIALS 1");
        l2.add("PROBABILITY AND STATISTICS");
        l2.add("FLUID MECHANICS");
        l2.add("BEE");l2.add("BASIC MECHANICAL ENGINEERING FOR CIVIL ENGINEERS");
        l2.add("BUILDING MATERIALS CONSTRUCTIONS AND PLANNING");
        l2.add("STRENGTH OF MATERIALS 2");
        l2.add("HYDRAUKIC AND HYDRAULIC MACHIONARY");
        l2.add("STRUCTURAL ANALYSIS 1");l2.add("COMPUTER AIDED CIVIL ENGINEERING DRAWING");
        l2.add("STRUCTURAL ANALYSIS 2");
        l2.add("GEOTECHNICAL ENGINEERING");
        l2.add("STRUCTURAL ENGINEERING 1");
        l2.add("ENGINEERING ECONOMICS AND ACCOUNTANCY");l2.add("HYDROLOGY AND WATER RESOURCES ENGINEERING");
        l2.add("ENVIRONMENTAL ENGINEERING");
        l2.add("FOUNDATION ENGINEERING");l2.add("ESTIMATION,COSTING AND PROJECT MANAGEMENT");
        l2.add("PROFESSIONAL PRACTICE,LAW AND ETHICS");
        ArrayAdapter ad2=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,l2);
        lv2.setAdapter(ad2);
    }
}