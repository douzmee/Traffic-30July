package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //main Method สิ่งที่อยู่ใน method เรียก statement ต้องมี ; อยู่เสมอ

    public void clickAboutMe(View view) {

    }

} //Main Class นี่คือ คลาสหลัก
