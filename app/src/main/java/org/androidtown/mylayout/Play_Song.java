package org.androidtown.mylayout;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

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

        ImageView image=(ImageView)findViewById(R.id.imageView4);

        switch (name){
            case "himenes":
            case "히메네스":
                c = R.raw.himenes5;
                image.setImageResource(R.drawable.himenesname);
                break;
            case "leebyunggyu" :
            case "이병규":
                c = R.raw.leebyunggyu5;
                image.setImageResource(R.drawable.leebyunggyuname);
                break;
            case "leejinyoung" :
            case "이지영":
                c = R.raw.leejinyoung5;
                image.setImageResource(R.drawable.leejinyoungname);
                break;
            case "ohjihwan" :
            case "오지환":
                c = R.raw.ohjihwan5;
                image.setImageResource(R.drawable.ohjihwanname);
                break;
            case "parkjigyu" :
            case "박지규":
                c = R.raw.parkjigyu5;
                image.setImageResource(R.drawable.parkjigyuname);
                break;
            case "parkyongtak" :
            case "박용택":
                c = R.raw.parkyongtak5;
                image.setImageResource(R.drawable.parkyongtakname);
                break;
            case "seosangwoo" :
            case "서상우":
                c = R.raw.seosangwoo5;
                image.setImageResource(R.drawable.seosangwooname);
                break;
            case "yangsukhwan" :
            case "양석환":
                c = R.raw.yangsukhwan5;
                image.setImageResource(R.drawable.yangsukhwanname);
                break;
            case "yoogangnam" :
            case "유강남":
                c = R.raw.yoogangnam5;
                image.setImageResource(R.drawable.yooganamname);
                break;
            default:
                c=R.raw.yoogangnam5;
        }

        image.invalidate();

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
