package com.example.mlyho.csudhclassroomnav;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class classrooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classrooms);
    }
    public void SBS_B123(View view) {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}
