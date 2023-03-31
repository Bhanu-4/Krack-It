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

public class firstpage extends AppCompatActivity {
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        ListView lv=findViewById(R.id.lv);
        List<String> l=new ArrayList<>();
        l.add("AI & ML");
        l.add("CIVIL ENGINEERING");
        l.add("COMPUTER SCIENCE ENGINEERING");
        l.add("ELECTRONICS AND COMMUNICATION ENGINEERING");
        l.add("INFORMATION TECHNOLOGY");
        l.add("MECHANICAL ENGINEERING");
        ArrayAdapter ad=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,l);
        lv.setAdapter(ad);
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            if(position==0){
                startActivity(new Intent(firstpage.this,AIANDML.class));
            }
            else if(position==1){
                startActivity(new Intent(firstpage.this,CIVIL.class));
            }
            else if(position==2){
                startActivity(new Intent(firstpage.this,CSE.class));
            }
            else if(position==3){
                startActivity(new Intent(firstpage.this,ECE.class));
            }
            else if(position==4){
                startActivity(new Intent(firstpage.this,IT.class));
            }
           else if(position==5){
                startActivity(new Intent(firstpage.this,MECH.class));
            }
        }
    });

    }
}