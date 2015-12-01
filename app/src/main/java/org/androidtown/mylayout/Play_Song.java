package org.androidtown.mylayout;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;

/**
 * Created by hhe on 2015-12-01.
 */
public class Play_Song extends Activity {
    public int c;
    static public String name;
    MediaPlayer music;

    int position;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_song);

        switch (name){
            case "himenes" :
                c = R.raw.himenes5;
                break;
            case "leebyunggyu" :
                c = R.raw.leebyunggyu5;
                break;
            case "leejinyoung" :
                c = R.raw.leejinyoung5;
                break;
            case "ohjihwan" :
                c = R.raw.ohjihwan5;
                break;
            case "parkjigyu" :
                c = R.raw.parkjigyu5;
                break;
            case "parkyongtak" :
                c = R.raw.parkyongtak5;
                break;
            case "seosanghoon" :
                c = R.raw.seosangwoo5;
                break;
            case "yangsukhwan" :
                c = R.raw.yangsukhwan5;
                break;
            case "yoogangnam" :
                c = R.raw.yoogangnam5;
                break;
        }

        music = MediaPlayer.create(this, c);
        music.setLooping(false);

    }
    public void play(View v) {
        /*if(music.isPlaying()){
            // 재생중이면 실행될 작업 (정지)
            music.stop();
            try {
                music.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music.start();

        }*/
        music.start();
    }

    public void pause(View v){
        if(music.isPlaying()) {
            // 재생중이면 실행될 작업 (정지)
            music.pause();
            try {
                music.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop(View v){
        if(music !=null ) {
            music.pause();
            music.seekTo(0);
        }

    }

    protected void killplayer(){
        if(music!=null){
            music.release();
            music=null;
        }
    }
    protected void onDestroy(){
        super.onDestroy();
        killplayer();
    }


}
