package com.wordpress.shivamsharma112.www.grid;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void music(View view){
     int id=view.getId();
        String nameid;
        nameid=view.getResources().getResourceEntryName(id);

        int Mymusic = getResources().getIdentifier(nameid,"raw","com.wordpress.shivamsharma112.www.grid");
        MediaPlayer mediaPlayer = MediaPlayer.create(this,Mymusic);
        mediaPlayer.start();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
