package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    public final static String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void increaseCounter(View view){
        counter ++;
        TextView textView = (TextView) findViewById(R.id.counter_view);
        textView.setText((String.valueOf(counter)));
    }

    public void decreaseCounter(View view){
        counter --;
        TextView textView = (TextView) findViewById(R.id.counter_view);
        textView.setText((String.valueOf(counter)));
    }

    public void zeroCounter(View view){
        counter =0;
        TextView textView = (TextView) findViewById(R.id.counter_view);
        textView.setText((String.valueOf(counter)));
    }


}