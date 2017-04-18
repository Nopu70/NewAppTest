package com.mtest.basicclass;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nopu70 on 2017/4/9.
 */

public class BaseActivity extends AppCompatActivity {

    public static List<Activity> as = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        as.add(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        as.remove(this);
    }

    public void finishAll(){
        for(Activity a : as){
            a.finish();
        }
    }
}
