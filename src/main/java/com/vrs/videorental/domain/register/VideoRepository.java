package com.vrs.videorental.domain.register;

public interface VideoRepository {


    boolean save(VideoTitle videoTitle);

    VideoTitle getVideoTitle(String videoName);

    boolean save(Video video);
}
