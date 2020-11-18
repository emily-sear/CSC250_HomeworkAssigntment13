package com.example.csc250_homeworkassigntment13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClickedFirst(View v)
    {
        TextView textView = this.findViewById(R.id.firstName);
        textView.setText("Emily");
    }

    public void onButtonClickedLast(View v)
    {
            TextView textView = this.findViewById(R.id.lastName);
            textView.setText("Sear");
    }

}