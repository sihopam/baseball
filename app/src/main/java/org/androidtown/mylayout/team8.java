package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */

public class team8 extends AppCompatActivity {

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team8);

    }

    public void Button81(View v){
        music=m.play(music,"kimhasung8",this,count);
        count=m.count();
    }
    public void Button82(View v){
        music=m.play(music,"kimminsung8",this,count);
        count=m.count();
    }
    public void Button83(View v){
        music=m.play(music,"kojongwook8",this,count);
        count=m.count();
    }
    public void Button84(View v){
        music=m.play(music,"parkbyungho8",this,count);
        count=m.count();
    }
    public void Button85(View v){
        music=m.play(music,"parkdongwon8",this,count);
        count=m.count();
    }
    public void Button86(View v){
        music=m.play(music,"seogunchang8",this,count);
        count=m.count();
    }
    public void Button87(View v){
        music=m.play(music,"snider8",this,count);
        count=m.count();
    }
    public void Button88(View v){
        music=m.play(music,"yoohanjun8",this,count);
        count=m.count();
    }
    public void Button89(View v){
        music=m.play(music,"yoonsukmin8",this,count);
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
