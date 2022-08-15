package com.opensource.opencv;

import android.app.Application;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

class AppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initopencv();
    }

    private void initopencv() {
        //初始化 opencv
        boolean success = OpenCVLoader.initDebug();
        if (success) {
            Log.d("init", "initLoadOpenCV: openCV load success");
        } else {
            Log.e("init", "initLoadOpenCV: openCV load failed");
        }
    }
}
