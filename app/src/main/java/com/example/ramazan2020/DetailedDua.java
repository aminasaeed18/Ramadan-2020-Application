package com.example.ramazan2020;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class DetailedDua extends AppCompatActivity {
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_dua);
        SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.imageDua);
        image = getIntent().getIntExtra("image", 0);
        imageView.setImage(ImageSource.resource(image));
        //imageView.setImageResource(image);
    }
}
