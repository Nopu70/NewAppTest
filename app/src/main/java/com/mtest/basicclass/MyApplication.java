package com.mtest.basicclass;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by Nopu70 on 2017/4/9.
 */

public class MyApplication extends Application {

    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        LitePalApplication.getContext();
    }

    private static Context getContext(){
        return context;
    }
}
