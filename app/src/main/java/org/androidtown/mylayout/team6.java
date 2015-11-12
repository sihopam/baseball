package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team6 extends AppCompatActivity{

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team6);
    }




    public void Button61(View v){
        //MusicMaker m=new MusicMaker();
        music=m.play(music,"jisukhun6",this,count);
        count=m.count();

    }

    public void Button62(View v){
        music=m.play(music,"kimjongho6",this,count);
        count=m.count();
    }
    public void Button63(View v){
        music=m.play(music,"kimtaegun6",this,count);
        count=m.count();
    }
    public void Button64(View v){
        music=m.play(music,"leehojoon6",this,count);
        count=m.count();
    }
    public void Button65(View v){
        music=m.play(music,"leejongwook6",this,count);
        count=m.count();
    }
    public void Button66(View v){
        music=m.play(music,"nasungbeom6",this,count);
        count=m.count();
    }
    public void Button67(View v){
        music=m.play(music,"parkminwoo6",this,count);
        count=m.count();
    }
    public void Button68(View v){
        music=m.play(music,"sonsiheon6",this,count);
        count=m.count();
    }
    public void Button69(View v){
        music=m.play(music,"thames6",this,count);
        count=m.count();
    }

    @Override
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
