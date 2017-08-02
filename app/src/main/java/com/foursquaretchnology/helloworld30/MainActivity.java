package com.foursquaretchnology.helloworld30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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

    public void MultiplyNumbers()
    {
        int i = 2 * 2;

        String op = "Multiplication";
    }

    public void DivideNumbers()
    {
        int i = 2 / 2;

        String op = "Division";
    }

    public void RandomNumbers()
    {
        int min = 50;
        int max = 60;
        float scalefactor = 2.5f;

        String op = "Random Numbers";

        if(min >= 40 && max <= 90)
        {
            op = "Small Ranged Random Numbers ;)";
            Log.d("Log", ": ScaleFactor - " + scalefactor);
        }

    }


}
