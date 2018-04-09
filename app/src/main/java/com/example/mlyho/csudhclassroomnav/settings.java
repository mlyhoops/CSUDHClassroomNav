package com.example.mlyho.csudhclassroomnav;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


    }

    public void contactUs(View view){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:mgonzales102@toromail.csudh.edu"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Toro Navigation Feedback");
        startActivity(emailIntent);
    }
}
