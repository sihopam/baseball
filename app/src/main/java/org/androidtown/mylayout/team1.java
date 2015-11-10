package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;

import java.io.IOException;

/**
 * Created by Administrator on 2015-09-17.
 */
public class team1 extends AppCompatActivity {
    ImageButton button,button2,button3,button4,button5,button6,button7,button8,button9;
    SeekBar seekbar;
    MediaPlayer music,music2,music3,music4,music5,music6,music7,music8,music9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team1);

        music = MediaPlayer.create(this, R.raw.kimtaekyun);
        music.setLooping(false);
        button = (ImageButton) findViewById(R.id.imageButton);

        music2 = MediaPlayer.create(this, R.raw.choijinhang);
        music2.setLooping(false);
        button2 = (ImageButton) findViewById(R.id.imageButton2);


        music3 = MediaPlayer.create(this, R.raw.joinsung);
        music3.setLooping(false);
        button3 = (ImageButton) findViewById(R.id.imageButton3);

        music4 = MediaPlayer.create(this, R.raw.joinsung);
        music4.setLooping(false);
        button4 = (ImageButton) findViewById(R.id.imageButton4);

        music5 = MediaPlayer.create(this, R.raw.joinsung);
        music5.setLooping(false);
        button5 = (ImageButton) findViewById(R.id.imageButton5);

        music6 = MediaPlayer.create(this, R.raw.kimkyungun);
        music6.setLooping(false);
        button6 = (ImageButton) findViewById(R.id.imageButton6);

        music7 = MediaPlayer.create(this, R.raw.leesungyul);
        music7.setLooping(false);
        button7 = (ImageButton) findViewById(R.id.imageButton7);

        music8 = MediaPlayer.create(this, R.raw.leeyongkyu);
        music8.setLooping(false);
        button8 = (ImageButton) findViewById(R.id.imageButton8);

        music9 = MediaPlayer.create(this, R.raw.songjuho);
        music9.setLooping(false);
        button9 = (ImageButton) findViewById(R.id.imageButton9);

    }



    public void button(View v) {
        if(music.isPlaying()){
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

        }
    }
    public void button2(View v) {
        if(music2.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music2.stop();
            try {
                music2.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music2.start();

        }
    }
    public void button3(View v) {
        if(music3.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music3.stop();
            try {
                music3.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music3.start();

        }
    }
    public void button4(View v) {
        if(music4.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music4.stop();
            try {
                music4.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music4.start();

        }
    }
    public void button5(View v) {
        if(music5.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music5.stop();
            try {
                music5.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music5.start();

        }
    }
    public void button6(View v) {
        if(music6.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music6.stop();
            try {
                music6.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music6.start();

        }
    }
    public void button7(View v) {
        if(music7.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music7.stop();
            try {
                music7.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music7.start();

        }
    }
    public void button8(View v) {
        if(music8.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music8.stop();
            try {
                music8.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music8.start();

        }
    }
    public void button9(View v) {
        if(music9.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            music9.stop();
            try {
                music9.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            music9.start();

        }
    }

    private void killPlayer(){
        if(music!=null ||music2!=null ||music3!=null ||music4!=null ||music5!=null ||music6!=null ||music7!=null ||music8!=null ||music9!=null){
            music.release(); //
            music = null;

            music2.release(); //
            music2= null;

            music3.release(); //
            music3 = null;

            music4.release(); //
            music4 = null;

            music5.release(); //
            music5 = null;

            music6.release(); //
            music6 = null;

            music7.release(); //
            music7 = null;

            music8.release(); //
            music8 = null;

            music9.release(); //
            music9 = null;
        }
        /*if(music!=null){
            music.release(); //
            music = null;
        }
        if(music!=null){
            music.release(); //
            music = null;
        }
        if(music!=null){
            music.release(); //
            music = null;
        }
        if(music!=null){
            music.release(); //
            music = null;
        }
        if(music!=null){
            music.release(); //
            music = null;
        }
        if(music!=null){
            music.release(); //
            music = null;
        }
        if(music!=null){
            music.release(); //
            music = null;
        }
        if(music!=null){
            music.release(); //
            music = null;
        }
        */
    }
    protected void onDestroy() {
        super.onDestroy();
       killPlayer();
    }


}