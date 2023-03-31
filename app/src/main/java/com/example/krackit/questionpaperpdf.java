package com.example.krackit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class questionpaperpdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionpaperpdf);
        int position;
        ListView lv7=findViewById(R.id.lv7);
        List<String> l7=new ArrayList<>();
        l7.add("1 YEAR MID QUESTION PAPER");
        l7.add("1 YEAR SEM QUESTION PAPER");
        l7.add("2 YEAR MID QUESTION PAPER");
        l7.add("2 YEAR SEM QUESTION PAPER");
        l7.add("3 YEAR MID QUESTION PAPER");
        l7.add("3 YEAR SEM QUESTION PAPER");
        l7.add("4 YEAR MID QUESTION PAPER");
        l7.add("4 YEAR SEM QUESTION PAPER");
        l7.add("THE ABOVE QUESTION PAPERS ARE MANAGED ON THE BASIS OF BRANCHES");
        ArrayAdapter ad9=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,l7);
        lv7.setAdapter(ad9);
    }
}