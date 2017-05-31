package com.example.android.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void counterIncrement(View view)
    {
     counter++;

        TextView textview = (TextView) findViewById(R.id.Counter);
        textview.setText(String.valueOf(counter));
    }
}
