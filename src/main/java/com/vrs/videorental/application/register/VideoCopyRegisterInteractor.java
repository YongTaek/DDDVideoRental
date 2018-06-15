package com.vrs.videorental.application.register;

import com.vrs.videorental.domain.register.Video;
import com.vrs.videorental.domain.register.VideoCopy;
import com.vrs.videorental.domain.register.VideoRepository;
import com.vrs.videorental.domain.register.VideoTitle;

public class VideoCopyRegisterInteractor {

    private VideoRepository repository;

    public VideoCopyRegisterInteractor(VideoRepository repository) {
        this.repository = repository;
    }

    public VideoRepository getRepository() {
        return repository;
    }


    public void registerVideoCopy(String videoName, int videoType) {
        VideoTitle videoTitle = getRepository().getVideoTitle(videoName);
        VideoCopy videoCopy;
        if (videoType == 1) videoCopy = VideoCopy.CD;
        else if (videoType == 2) videoCopy = VideoCopy.DVD;
        else if (videoType == 3) videoCopy = VideoCopy.VHS;
        else throw new IllegalArgumentException("No such rating " + videoType);


        Video video = new Video(videoTitle, videoCopy);

        getRepository().save(video);
    }

}
