package com.vrs.videorental.domain.rental;

import com.vrs.videorental.domain.register.VideoCopy;

import java.util.List;
import java.util.Map;

public class VideoBook {

    Map<VideoCopy, Integer> totalVideos;
    Map<VideoCopy, Integer> remainVideos;


    public boolean rent() {
        Rental rental = new RentalFactory().createRental();
        return true;
    }
}
