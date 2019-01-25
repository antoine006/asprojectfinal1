package com.example.hp1.asproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MoviesListActivity extends AppCompatActivity {
    ArrayList<Movie> arrayList = new ArrayList<>();
    ListView lvmovies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);
        lvmovies = findViewById(R.id.lvMovies);

        arrayList.add(new Movie("movie" ,4.5, R.drawable.action,"this is the summary"));
        arrayList.add(new Movie("movie" ,4.5, R.drawable.biography,"this is the summary"));

        MovieCustomAdapter adapter = new MovieCustomAdapter(this, R.layout.movie_custom_row, arrayList);
        lvmovies.setAdapter(adapter);
    }
}
