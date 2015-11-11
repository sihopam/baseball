package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team10 extends AppCompatActivity{

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team10);
    }

    public void Button01(View v){
        music=m.play(music,"danblack0",this,count);
        count=m.count();
    }
    public void Button02(View v){
        music=m.play(music,"hajunho0",this,count);
        count=m.count();
    }
    public void Button03(View v){
        music=m.play(music,"jangsungwoo0",this,count);
        count=m.count();
    }
    public void Button04(View v){
        music=m.play(music,"kimsanghyun0",this,count);
        count=m.count();
    }
    public void Button05(View v){
        music=m.play(music,"kimsayeon0",this,count);
        count=m.count();
    }
    public void Button06(View v){
        music=m.play(music,"leedaehyung0",this,count);
        count=m.count();
    }
    public void Button07(View v){
        music=m.play(music,"marte0",this,count);
        count=m.count();
    }
    public void Button08(View v){
        music=m.play(music,"parkkihyuk0",this,count);
        count=m.count();
    }
    public void Button09(View v){
        music=m.play(music,"parkkyungsoo0",this,count);
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
