package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        launchTelegram();
    }

    private void launchTelegram() {
        Intent telegram = new Intent(Intent.ACTION_VIEW , Uri.parse("https://telegram.me/InfotechAvl_bot"));
        startActivity(telegram);
    }
}