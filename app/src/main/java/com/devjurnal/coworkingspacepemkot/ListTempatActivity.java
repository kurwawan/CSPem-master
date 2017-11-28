package com.devjurnal.coworkingspacepemkot;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ListTempatActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView img1,img2,img3,img4;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tempat);
        img1 = findViewById(R.id.imglist1);
        img2 = findViewById(R.id.imglist2);
        img3 = findViewById(R.id.imglist3);
        img4 = findViewById(R.id.imglist4);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
        viewPager.setAdapter(viewPagerAdapter);
    }

    @Override
    public void onClick(View view) {

        String tipe=null;
        String judul=null;

        switch (view.getId())
        {
            case R.id.imglist1:
                tipe = "SDK";
                judul = "Ruang Rapat";
                break;
            case R.id.imglist2:
                tipe = "SDK";
                judul = "Ruang StartUp";
                break;
            case R.id.imglist3:
                tipe="PIP";
                judul = "Ruang Studio Mini";
                break;
            case R.id.imglist4:
                tipe="PIP";
                judul = "Ruang Studio Mini";
                break;
        }

        Intent intent = new Intent(this, FormPeminjamanActivity.class);
        intent.putExtra("tipe",tipe);
        intent.putExtra("judul",judul);
        startActivity(intent);

    }
}
