package com.example.android.projectsixdemo.places;

public class PlacesToVisit {
    private int imageId;
    private String hotelName;
    private String mRating;


    public PlacesToVisit(int imageId, String hotelName, String rating) {
        this.imageId = imageId;
        this.hotelName = hotelName;
        this.mRating = rating;
    }

    public int getImageId() {
        return imageId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getmRating() {
        return mRating;
    }
}
