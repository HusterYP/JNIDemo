package com.gif.ping.jnidemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    FFmpeg mFFmpeg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        mFFmpeg = new FFmpeg();
        mFFmpeg.playMyMedia("http://www.gifbin.com/bin/052018/driver-mistakes-bikers.webm");
    }
}
