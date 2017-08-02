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
        int min = 10;
        int max = 90;

        String op = "Random Numbers";

        if(min >= 40 && max <= 90)
        {
            op = "Small Ranged Random Numbers ;)";
        }

    }

}
