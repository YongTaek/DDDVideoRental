package com.vrs.videorental.domain.register;

import java.util.Date;

public class VideoTitle {

    private String title;
    private Date registeredDate;

    PriceCode priceCode;
    Rating rating;

    boolean isUnderAge(int age) {
        return age < rating.getValue();
    }

    public VideoTitle(String title, Date registeredDate, PriceCode priceCode, Rating rating) {
        this.title = title;
        this.registeredDate = registeredDate;
        this.priceCode = priceCode;
        this.rating = rating;
    }
}
