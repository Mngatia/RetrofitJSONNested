package com.example.retrofitjsonnested;

import com.google.gson.annotations.SerializedName;

public class Movie {

    //model class
    private String id;
    private String title;
    private double rating;
    private String poster;

    //Object of class details
    //Different name from JSON, so we need to serialize it
    @SerializedName("Details")
    private MoreDetails moreDetails;
//constructor
    public Movie(String id, String title, double rating, String poster, MoreDetails moreDetails) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.poster = poster;
        this.moreDetails = moreDetails;
    }
    //Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public MoreDetails getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(MoreDetails moreDetails) {
        this.moreDetails = moreDetails;
    }
}
