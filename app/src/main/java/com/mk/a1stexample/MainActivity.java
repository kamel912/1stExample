package com.mk.a1stexample;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view){

        ImageView  a = (ImageView) findViewById(R.id.imageViewA);
        ImageView b = (ImageView) findViewById(R.id.imageViewB);
        a.animate().alpha(0f).setDuration(2000);
        b.animate().alpha(1f).setDuration(2000);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
