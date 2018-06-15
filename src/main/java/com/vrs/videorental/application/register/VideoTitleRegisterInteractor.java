package com.vrs.videorental.application.register;

import com.vrs.videorental.domain.register.*;

import java.util.Date;

public class VideoTitleRegisterInteractor {

    private VideoRepository repository;

    public VideoTitleRegisterInteractor(VideoRepository repository) {
        this.repository = repository;
    }

    public VideoRepository getRepository() {
        return repository;
    }


    public void registerVideoTitle(String title, int videoType, int videoPriceCode, int videoRating) {
        Date registeredDate = new Date();
        Rating rating;
        if (videoRating == 1) rating = Rating.TWELVE;
        else if (videoRating == 2) rating = Rating.FIFTEEN;
        else if (videoRating == 3) rating = Rating.EIGHTEEN;
        else throw new IllegalArgumentException("No such rating " + videoRating);

        PriceCode priceCode;
        if (videoPriceCode == 1) priceCode = PriceCode.REGULAR;
        else if (videoPriceCode == 2) priceCode = PriceCode.NEW_RELEASE;
        else if (videoPriceCode == 3) priceCode = PriceCode.CHILDREN;
        else throw new IllegalArgumentException("No such priceCode " + videoPriceCode);

        VideoTitle video = new VideoTitle(title, registeredDate,priceCode,rating);

        getRepository().save(video);
    }
}
