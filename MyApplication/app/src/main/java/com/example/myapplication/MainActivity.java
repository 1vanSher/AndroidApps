package com.example.myapplication;

import java.io.File;

import android.app.Activity;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;

public class MainActivity extends Activity {

    private static final int REQUEST_TAKE_PHOTO = 1;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
    }

    public void onClick(View v) {
        Intent takePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        try{
            startActivityForResult(takePhotoIntent, REQUEST_TAKE_PHOTO);
        }catch (ActivityNotFoundException e){
            e.printStackTrace();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_TAKE_PHOTO && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap thumbnailBitmap = (Bitmap) extras.get("data");
            imageView.setImageBitmap(thumbnailBitmap);
        }
    }
}