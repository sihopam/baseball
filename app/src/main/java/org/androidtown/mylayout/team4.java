package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team4 extends AppCompatActivity {

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.acvitivy_team4);
     }

    public void Button41(View v){
        music=m.play(music,"chaetaein4",this,count);
        count=m.count();
    }
    public void Button42(View v){
        music=m.play(music,"choihyungwoo4",this,count);
        count=m.count();
    }
    public void Button43(View v){
        music=m.play(music,"kimsangsoo4",this,count);
        count=m.count();
    }
    public void Button44(View v){
        music=m.play(music,"leejiyoung4",this,count);
        count=m.count();
    }
    public void Button45(View v){
        music=m.play(music,"leeseungyup4",this,count);
        count=m.count();
    }
    public void Button46(View v){
        music=m.play(music,"navaro4",this,count);
        count=m.count();
    }
    public void Button47(View v){
        music=m.play(music,"parkhaemin4",this,count);
        count=m.count();
    }
    public void Button48(View v){
        music=m.play(music,"parkhani4",this,count);
        count=m.count();
    }
    public void Button49(View v){
        music=m.play(music,"parksukmin4",this,count);
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
