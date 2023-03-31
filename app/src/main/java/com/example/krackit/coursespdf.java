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

public class coursespdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursespdf);
        int position;
        ListView lv9=findViewById(R.id.lv9);
        List<String> l9=new ArrayList<>();
        l9.add("C PROGRAMMING");
        l9.add("C++");
        l9.add("JAVA");
        l9.add("PYTHON");
        l9.add("DBMS");
        l9.add("OPERATING SYSTEMS");
        ArrayAdapter ad9=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,l9);
        lv9.setAdapter(ad9);
    }
}