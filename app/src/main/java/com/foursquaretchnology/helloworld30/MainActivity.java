package com.foursquaretchnology.helloworld30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddNumbers()
    {
        int i = 2 + 2;

        String op = "Addition";
    }

    public void SubNumbers()
    {
        int i = 2 - 2;

        String op = "Subtraction";
    }

}