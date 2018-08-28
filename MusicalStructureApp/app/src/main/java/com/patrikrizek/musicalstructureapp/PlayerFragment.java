package com.patrikrizek.musicalstructureapp;

import android.widget.SeekBar;

public class Player {
    Thread updateSeekBar;
    SeekBar sb;

    sb = (SeekBar) findViewById(R.id.seekBar);
    updateSeekBar = new Thread() {
        @Override
        public void run() {
            int totalDuration = podcastMediaPlater.getDuration();
            int currentPosition = 0;
            while (currentPosition < totalDuration) {
                try {
                    sleep(500);
                    currentPosition = podcastMediaPlater.getCurrentPosition();
                    sb.setProgress(currentPosition);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //super.run();
        }
    };



}
