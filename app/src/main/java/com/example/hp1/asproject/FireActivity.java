package com.example.hp1.asproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FireActivity extends AppCompatActivity {



    ListView IVUSERS;
    ArrayList<String> users;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);

        IVUSERS = findViewById(R.id.USERS);
        users = new ArrayList<>();
    }

}
