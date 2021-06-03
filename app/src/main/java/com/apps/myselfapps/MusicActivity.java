package com.apps.myselfapps;
  /*

    TANGGAL PENGERJAAN : 29 Mei 2021 - 04 Juni 2021
    NIM     : 10118020
    NAMA    : Fiqri Akbar Pratama
    KELAS   : IF1
    */
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MusicActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.ic_node,R.drawable.ic_node};
    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        recyclerView = findViewById(R.id.recycleViewMusic);

        s1 = getResources().getStringArray(R.array.MusicTitle);
        s2 = getResources().getStringArray(R.array.AlbumName);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //inisialisasi variabel
        BottomNavigationView bottomNavigationView = findViewById(R.id.bot_nav);

        //Set Main Selected
        bottomNavigationView.setSelectedItemId(R.id.music);

        //Video Set
        videoView = findViewById(R.id.videoView);
        playVideo = findViewById(R.id.play);
        mediaController = new MediaController(this);

        //Menjalankan Video saat tombol Play di Klik
        playVideo.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {

                                             //Variable Uri untuk menentukan lokasi Resource Video yang akan ditampilkan
                                             Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video2);

                                             videoView.setVideoURI(uri);

                                             //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                                             videoView.setMediaController(mediaController);
                                             mediaController.setAnchorView(videoView);

                                             //Menjalankan Video
                                             videoView.start();
                                         }
                                     });


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
                        return true;
                    case R.id.profile:
                        startActivity(new Intent(getApplicationContext()
                                , AboutActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }
        });
    }
}
