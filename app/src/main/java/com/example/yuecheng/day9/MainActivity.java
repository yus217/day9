package com.example.yuecheng.day9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lView = (ListView) findViewById(R.id.listView1);  
        final ArrayList<String> classRoster = new ArrayList<String>(); 
        classRoster.add("Yuecheng"); 
        classRoster.add("Ruth"); 
        classRoster.add("James"); 
        classRoster.add("Paul");  
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, classRoster);  
        lView.setAdapter(adapter);  

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() { 

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {  

                Log.i("Hello ", classRoster.get(i)); 
            }
        });

        }
    }










