package com.patrikrizek.musicalstructureapp;

public class Podcast {
    private String podcastTitle;
    private String podcastDate;
    private int mAudioResourceId;

    public Podcast(String title, String date, int audioResourceId) {
        podcastTitle = title;
        podcastDate = date;
        mAudioResourceId = audioResourceId;
    }


    public String getPodcastTitle() {
        return podcastTitle;
    }

    public String getPodcastDate() {
        return podcastDate;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}