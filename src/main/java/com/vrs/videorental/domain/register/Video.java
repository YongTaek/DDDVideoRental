package com.vrs.videorental.domain.register;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Video {

    VideoTitle videoTitle;

    VideoCopy videoCopy;

    public Video(VideoTitle videoTitle, VideoCopy videoCopy) {
        this.videoTitle = videoTitle;
        this.videoCopy = videoCopy;
    }

    public boolean isUnderAge(Customer customer) {
        try {
            // calculate customer's age in years and months

            // parse customer date of birth
            Calendar calDateOfBirth = Calendar.getInstance();
            calDateOfBirth.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(customer.getDateOfBirth()));

            // get current date
            Calendar calNow = Calendar.getInstance();
            calNow.setTime(new java.util.Date());

            // calculate age different in years and months
            int ageYr = (calNow.get(Calendar.YEAR) - calDateOfBirth.get(Calendar.YEAR));
            int ageMo = (calNow.get(Calendar.MONTH) - calDateOfBirth.get(Calendar.MONTH));

            // decrement age in years if month difference is negative
            if (ageMo < 0) {
                ageYr--;
            }
            int age = ageYr;

            // determine if customer is under legal age for rating
            return videoTitle.isUnderAge(age);


        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
