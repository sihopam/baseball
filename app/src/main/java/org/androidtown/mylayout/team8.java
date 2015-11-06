package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */

public class team8 extends AppCompatActivity {
    SoundPool pool;
    int a;
    MediaPlayer music;
    int count=0;
    MediaPlayer out;
    MediaPlayer remember;
    //MusicPlayer p= new MusicPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team8);

        out=MediaPlayer.create(this,R.raw.najiwan);

    }

    public void Button82(View v){
        //count++;
        MusicPlayer p=new MusicPlayer();

        int addr;
        if(out.isPlaying()){
            count=1;
            remember= p.musicplay(out,count);
            count++;
            return;
        }

        addr=p.play(music,"leeyonggyu",this);
        out=MediaPlayer.create(this,addr);
        if(count==0)remember=p.musicplay(out,count);
        if(count==2)out=p.musicplay(remember,count);

        //out= p.play(music,"leeyonggyu",this);
       // if(out.isPlaying()){
       //     p.musicstop(out);
       // }
    }

    protected void killPlayer(){
        if(out!=null){
            out.release();
            out=null;
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        killPlayer();
    }



}
//getApplicationContext()
/*   public void Button81(View v) {
        pool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        a = pool.load(this, R.raw.joohyungsang, 1);
        pool.play(a, 1.0f, 1.0f, 0, 0, 1.0f);
        int waitLimit=1000;
        int waitCounter=0;
        int throttle=10;
        while(pool.play(a, 1.0f, 1.0f, 0, 0, 1.0f)==0&&waitCounter<waitLimit){
            waitCounter++;
            SystemClock.sleep((throttle));
        }
    }*/