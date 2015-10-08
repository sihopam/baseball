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
    ImageButton button;
    SeekBar seekbar;
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team1);

        music = MediaPlayer.create(this, R.raw.leeyongkyu);
        music.setLooping(false);
        button = (ImageButton) findViewById(R.id.imageButton);





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

    private void killPlayer(){
        if(music!=null){
            music.release(); //
            music = null;
        }
    }
    protected void onDestroy() {
        super.onDestroy();
       killPlayer();
    }


}