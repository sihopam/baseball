package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-09-17.
 */
public class team2 extends AppCompatActivity {

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    int position;
    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team2);
    }

    public void Button21(View v){
        music=m.play(music,"kanghanwool2",this,count);
        count=m.count();
    }
    public void Button22(View v){
        music=m.play(music,"kimjoochan2",this,count);
        count=m.count();
    }
    public void Button23(View v){
        music=m.play(music,"kimminwoo2",this,count);
        count=m.count();
    }
    public void Button24(View v){
        music=m.play(music,"kimwonsub2",this,count);
        count=m.count();
    }
    public void Button25(View v){
        music=m.play(music,"leebeomho2",this,count);
        count=m.count();
    }
    public void Button26(View v){
        music=m.play(music,"leehonggoo2",this,count);
        count=m.count();
    }
    public void Button27(View v){
        music=m.play(music,"najiwan2",this,count);
        count=m.count();
    }
    public void Button28(View v){
        music=m.play(music,"phil2",this,count);
        count=m.count();
    }
    public void Button29(View v){
        music=m.play(music,"shinjonggil2",this,count);
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

