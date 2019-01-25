package com.example.hp1.asproject;

import android.support.annotation.NonNull;

public class Movie {
    private String mname;
    private  double rating;
    private int image;
    private String summary;
    private  boolean wighlist;

      public  Movie (String mname,double rating,int image,String summary){
        this.mname=mname;
        this.rating=rating;
        this.summary=summary;
        this.wighlist=false;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public boolean isWighlist() {
        return wighlist;
    }

    public void setWighlist(boolean wighlist) {
        this.wighlist = wighlist;
    }
}
