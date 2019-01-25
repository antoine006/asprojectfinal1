package com.example.hp1.asproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MovieCustomAdapter extends ArrayAdapter<Movie> {
private int resourceLayout;
private Context mContext;
    public MovieCustomAdapter(@NonNull Context context, int resource, @NonNull List<Movie> objects) {
        super(context, resource, objects);
        this.resourceLayout = resource;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;

        if(v==null)
         v = LayoutInflater.from(mContext).inflate(resourceLayout,parent, false);
        Movie p =getItem(position);
        if (p!=null){
            TextView tv1 =(TextView) v.findViewById(R.id.tvMovieName);
            tv1.setText(p.getMname());

            ImageView imageView=(ImageView)v.findViewById(R.id.imageview);
            imageView.setImageResource(p.getImage());

            Button btAdd =v.findViewById(R.id.btAddToWishList);
            btAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(), "Added", Toast.LENGTH_SHORT).show();
                }
            });

        }
        return v;

    }
}
