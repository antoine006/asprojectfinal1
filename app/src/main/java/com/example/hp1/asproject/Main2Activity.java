package com.example.hp1.asproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView LvCountries;
    CustomAdapter arrayAdapter;
    ArrayList<Item> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LvCountries = (ListView) findViewById(R.id.LvCountries) ;
        arrayList.add(new Item(R.drawable.mainback,"Biography"));
        LvCountries = findViewById(R.id.ILVcountries);
        arrayList.add(new Item(R.drawable.biography,"Biography"));
        arrayList.add(new Item(R.drawable.action,"action"));
        arrayList.add(new Item(R.drawable.crime,"crime"));
        arrayList.add(new Item(R.drawable.drama,"drama"));
        arrayList.add(new Item(R.drawable.sceince,"Sceince"));
        arrayList.add(new Item(R.drawable.sports,"Sports"));
        arrayList.add(new Item(R.drawable.photography,"Photography"));
        arrayAdapter = new CustomAdapter(this,R.layout.custom_row,arrayList);
        LvCountries.setAdapter(arrayAdapter);
        LvCountries.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long ld) {
        //  String selectedItem = arrayList.get(position);
        Intent i = new Intent(this, BookListActivity.class);
        if(position==0){
            i.putExtra("Category","Biography" );
        }else if(position ==1 ){
            i.putExtra("Category","Business and Finance" );
        }else if(position==2){
            i.putExtra("Category","Fiction" );
        }else if(position==3){
            i.putExtra("Category","History" );
        }
        else if (position==4){
            i.putExtra("Category","Sceince" );
        }else if (position==5){
            i.putExtra("Category","Sports" );
        }else if (position==6){
            i.putExtra("Category","Photography" );
        }
        startActivity(i);
    }
}
