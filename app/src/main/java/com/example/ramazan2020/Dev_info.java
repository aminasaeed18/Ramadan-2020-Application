package com.example.ramazan2020;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dev_info extends AppCompatActivity {

    TextView meer,ameen,feed;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_info);
        this.setTitle("Devloper's Info");


       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ameen = (TextView) findViewById(R.id.ameen_insta);


        String ameeninstagram = "<a href=https://www.linkedin.com/in/amina-saeed-6aa63615b/'>@AminaSa'eed</a>";
        String feedback = "<a href='https://goo.gl/forms/aH5sCPWnKV86E0ZE2'>Give us feed back</a>";

        ameen.setText(Html.fromHtml(ameeninstagram));
        ameen.setMovementMethod(LinkMovementMethod.getInstance());



    }
}
