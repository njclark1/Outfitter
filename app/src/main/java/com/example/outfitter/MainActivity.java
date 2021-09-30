package com.example.outfitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //intent to launch main activity 2
    public void launchWardrobe(View view) {
        Intent launchWD = new Intent(this, Wardrobe.class);
        startActivity(launchWD);
    }

}