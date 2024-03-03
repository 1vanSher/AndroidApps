package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick(View view) {
        Button button = findViewById(R.id.button);
        Log.i(TAG, "Press button");
        Log.e(TAG, "Error");
        Log.w(TAG, "Warning");
        Log.d(TAG, "Debug");
        Log.v(TAG, "Verbose");
    }
}