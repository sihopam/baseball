package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team3 extends AppCompatActivity {

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team3);
    }

    public void Button31(View v){
        music=m.play(music,"aduchi3",this,count);
        count=m.count();
    }
    public void Button32(View v){
        music=m.play(music,"choijunsuk3",this,count);
        count=m.count();
    }
    public void Button33(View v){
        music=m.play(music,"hwangjaegyun3",this,count);
        count=m.count();
    }
    public void Button34(View v){
        music=m.play(music,"junghoon3",this,count);
        count=m.count();
    }
    public void Button35(View v){
        music=m.play(music,"kangminho3",this,count);
        count=m.count();
    }
    public void Button36(View v){
        music=m.play(music,"kimdaewoo3",this,count);
        count=m.count();
    }
    public void Button37(View v){
        music=m.play(music,"kimmunho3",this,count);
        count=m.count();
    }
    public void Button38(View v){
        music=m.play(music,"mungyuhyun3",this,count);
        count=m.count();
    }
    public void Button39(View v){
        music=m.play(music,"sonasub3",this,count);
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
