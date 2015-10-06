package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-09-17.
 */
public class team2 extends AppCompatActivity {

    MediaPlayer player;

    String url = "http://www.tigers.co.kr/upload/song/강한울-코리아 오 코리아.mp3";

    int position;
    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team2);
    }
    public void onButton1Clicked(View v){  //음악시작
        try{
            killPlayer();
            player = new MediaPlayer();
            player.setDataSource(url);
            player.prepare();
            player.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        private void killPlayer(){
            if(player!=null){
                player.release();
                player = null;
            }
        }
    public void onButton2Clicked(View v){
        if (player!=null && player.isPlaying()) {
            position = player.getCurrentPosition();
            player.pause();

        }
    }
    public void onButton3Clicked(View v){
        if (player != null && !player.isPlaying()) {
            player.start();
            player.seekTo(position);
        }
    }
    public void onButton4Clicked(View v) {

        if(player !=null && player.isPlaying()) {
            player.stop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        killPlayer();
    }
    }

