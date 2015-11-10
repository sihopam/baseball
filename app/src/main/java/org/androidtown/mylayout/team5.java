package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team5 extends AppCompatActivity{

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team5);

    }
    public void Button51(View v){
        music=m.play(music,"himenes5",this,count);
        count=m.count();
    }
    public void Button52(View v){
        music=m.play(music,"leebyunggyu5",this,count);
        count=m.count();
    }
    public void Button53(View v){
        music=m.play(music,"leejinyoung5",this,count);
        count=m.count();
    }
    public void Button54(View v){
        music=m.play(music,"ohjihwan5",this,count);
        count=m.count();
    }
    public void Button55(View v){
        music=m.play(music,"parkjigyu5",this,count);
        count=m.count();
    }
    public void Button56(View v){
        music=m.play(music,"parkyongtak5",this,count);
        count=m.count();
    }
    public void Button57(View v){
        music=m.play(music,"seosanghoon5",this,count);
        count=m.count();
    }
    public void Button58(View v){
        music=m.play(music,"yangsukhwan5",this,count);
        count=m.count();
    }
    public void Button59(View v){
        music=m.play(music,"yoogangnam5",this,count);
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
