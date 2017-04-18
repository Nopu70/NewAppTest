package com.mtest.newapptest;

import android.app.ActivityOptions;
import android.content.SharedPreferences;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.mtest.basicclass.BaseActivity;

import org.litepal.tablemanager.Connector;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initApp();
    }

    private void initApp(){
        SharedPreferences sp = getSharedPreferences("info", MODE_PRIVATE);
        int appOpen = sp.getInt("appOpen", 0);
        if (appOpen==0){
            Connector.getDatabase();
        }else{
            sp.edit().putInt("appOpen", appOpen++).commit();
        }
    }
}
