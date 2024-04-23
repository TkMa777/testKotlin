package com.simplecity.amp_library.utils;

import android.util.Log;

public class TimeLogger {

    private long initialTime;
    private long intervalTime;


    public void startLog() {
        initialTime = System.currentTimeMillis();
        intervalTime = System.currentTimeMillis();
    }

    public void logInterval(String tag, String message) {

        Log.i(tag, message
                + "\n Interval: " + (System.currentTimeMillis() - intervalTime)
                + "\n Total: " + (System.currentTimeMillis() - initialTime)
        );
        intervalTime = System.currentTimeMillis();
    }
}