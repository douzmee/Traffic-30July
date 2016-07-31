package com.example.user.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private String urlYoutubeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //main Method สิ่งที่อยู่ใน method เรียก statement ต้องมี ; อยู่เสมอ

    public void clickAboutMe(View view) {

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.phonton2);
        mediaPlayer.start();

        //Intent to WebView
        urlYoutubeString = "https://youtu.be/5lGoQhFb4NM";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(urlYoutubeString));
        startActivity(intent);



    }

} //Main Class นี่คือ คลาสหลัก
