package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team9 extends AppCompatActivity{

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team9);
    }
    public void Button91(View v){
        music=m.play(music,"heogyungmin9",this,count);
        count=m.count();
    }
    public void Button92(View v){
        music=m.play(music,"jungsubin9",this,count);
        count=m.count();
    }
    public void Button93(View v){
        music=m.play(music,"kimhyunsoo9",this,count);
        count=m.count();
    }
    public void Button94(View v){
        music=m.play(music,"kimjaeho9",this,count);
        count=m.count();
    }
    public void Button95(View v){
        music=m.play(music,"koyoungmin9",this,count);
        count=m.count();
    }
    public void Button96(View v){
        music=m.play(music,"minbyungheon9",this,count);
        count=m.count();
    }
    public void Button97(View v){
        music=m.play(music,"ohjaewon9",this,count);
        count=m.count();
    }
    public void Button98(View v){
        music=m.play(music,"romero9",this,count);
        count=m.count();
    }
    public void Button99(View v){
        music=m.play(music,"yangeuiji9",this,count);
        count=m.count();
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected void onStop() {
        super.onStop();
        m.killPlayer();
    }

    protected  void onResume(){
        super.onResume();
        music=null;
        count=0;
    }
    protected void onDestroy(){
        super.onDestroy();
        m.killPlayer();
    }
}
