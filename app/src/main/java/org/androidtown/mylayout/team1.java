package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.io.IOException;

/**
 * Created by Administrator on 2015-09-17.
 */
public class team1 extends AppCompatActivity {
    Button button;
    SeekBar seekbar;
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team1);

        music = MediaPlayer.create(this, R.raw.leeyongkyu);
        music.setLooping(false);
        button = (Button) findViewById(R.id.button1);
        seekbar = (SeekBar) findViewById(R.id.seekBar1);

        seekbar.setMax(music.getDuration());



        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                if(fromUser)
                    music.seekTo(progress);
            }
        });



    }
    public void button(View v){
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
            music.seekTo(0);

            button.setText("start");
            seekbar.setProgress(0);
        }else{
            music.start();
            button.setText("stop");

            Thread();
        }
    }
    public void Thread(){
        Runnable task = new Runnable(){
            public void run(){

                while(music.isPlaying()){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }

                    seekbar.setProgress(music.getCurrentPosition());
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
    private void killPlayer(){
        if(music!=null){
            music.release();
            music = null;
        }
    }
    protected void onDestroy() {
        super.onDestroy();
       killPlayer();
    }


}