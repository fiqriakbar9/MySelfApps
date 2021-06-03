package com.apps.myselfapps;
  /*

    TANGGAL PENGERJAAN : 29 Mei 2021 - 04 Juni 2021
    NIM     : 10118020
    NAMA    : Fiqri Akbar Pratama
    KELAS   : IF1
    */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView mImageview, mImageView2;
    TextView textView;
    Dialog mDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        mImageview = findViewById(R.id.imgIG);
        mImageview.setOnClickListener(this);

        mImageView2 = findViewById(R.id.imgFind);
        mImageView2.setOnClickListener(this);


        //Custom Dialog
        mDialog = new Dialog(this);
        textView = (TextView)findViewById(R.id.aboutapps);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp();
            }
        });


        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.profile);

        //selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.daily:
                        startActivity(new Intent(getApplicationContext()
                                , DailyActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.gallery:
                        startActivity(new Intent(getApplicationContext()
                                , GalleryActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.music:
                        startActivity(new Intent(getApplicationContext()
                                , MusicActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.profile:
                        return true;
                }
                return false;
            }
        });
    }
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.imgIG: i = new Intent(this, IgActivity.class);startActivity(i);break;
            case R.id.imgFind: i = new Intent(this, MapsActivity.class);startActivity(i);break;
            default:break;
        }
    }

    public void showPopUp(){
        mDialog.setContentView(R.layout.custom_popup);
        mImageView2 = (ImageView) mDialog.findViewById(R.id.Close);

        mImageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.show();
    }
}
