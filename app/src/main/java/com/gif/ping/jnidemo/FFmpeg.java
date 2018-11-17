package com.gif.ping.jnidemo;

/**
 * @created by PingYuan at 11/17/18
 * @email: husteryp@gmail.com
 * @description:
 */
public class FFmpeg {
    static {
        System.loadLibrary("avutil-56");
        System.loadLibrary("swresample-3");
        System.loadLibrary("avcodec-58");
        System.loadLibrary("avformat-58");
        System.loadLibrary("swscale-5");
        System.loadLibrary("avfilter-7");
        System.loadLibrary("avdevice-58");
        System.loadLibrary("wlffmpeg");
    }

    public native void playMyMedia(String url);
}
