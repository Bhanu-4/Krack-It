package com.example.krackit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class AIANDML extends AppCompatActivity {
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aiandml);
        ListView lv1=findViewById(R.id.lv1);
        List<String> l1=new ArrayList<>();
        l1.add("M1");
        l1.add("CHEMISTRY");
        l1.add("BEE");
        l1.add("ENGLISH");
        l1.add("M2");
        l1.add("APPLIED PHYSICS");
        l1.add("PROGRAM FOR PROBLEM SOLVING");
        l1.add("ENGINEERING GRAPHICS");
        l1.add("DISCRETE MATHEMATICS");
        l1.add("DATA STRUCTURES");
        l1.add("MATHEMATICAL AND STATISTICAL FOUNDATIONS");
        l1.add("COA");
        l1.add("PYTHON PROGRAMMING");
        l1.add("BEFA");
        l1.add("FLAT");
        l1.add("SOFTWARE ENGINEERING");
        l1.add("OPERATING SYSTEMS");
        l1.add("DBMS");
        l1.add("JAVA PROGRAMMING");
        l1.add("DAA");
        l1.add("MACHINE LEARNING");
        l1.add("COMPUTER NETWORKS");
        l1.add("COMPILER DESIGN");
        l1.add("ARTIFICIAL INTELLIGENCE");
        l1.add("DEVOPS");
        l1.add("NATURAL LANGUAGE PROCESSING");
        l1.add("NEURAL NETWORKS AND DEEP LEARNING");
        l1.add("REINFORCEMENT LEARNING");
        l1.add("ORGANIZATIONAL BEHAVIOUR");
        ArrayAdapter ad1=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,l1);
        lv1.setAdapter(ad1);

    }
}