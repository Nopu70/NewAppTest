package com.mtest.newapptest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Window;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.mtest.basicclass.BaseActivity;

/**
 * Created by Nopu70 on 2017/4/9.
 */

public class ShowActivity extends BaseActivity {

    public static Intent getIntent(Context context){
        Intent intent = new Intent(context, ShowActivity.class);
        return intent;
    }

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        Transition explode =
                TransitionInflater.from(this).inflateTransition(R.transition.explode);
        setContentView(R.layout.activity_show);

        iv = (ImageView)findViewById(R.id.showimg);
        Glide.with(this).load(R.drawable.aa).into(iv);

    }
}
