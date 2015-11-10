package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team7 extends AppCompatActivity {

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team7);
    }
    public void Button71(View v){
        music=m.play(music,"brown7",this,count);
        count=m.count();
    }
    public void Button72(View v){
        music=m.play(music,"jodonghwa7",this,count);
        count=m.count();
    }
    public void Button73(View v){
        music=m.play(music,"jungeuiyun7",this,count);
        count=m.count();
    }
    public void Button74(View v){
        music=m.play(music,"jungsangho7",this,count);
        count=m.count();
    }
    public void Button75(View v){
        music=m.play(music,"kimsunghyun7",this,count);
        count=m.count();
    }
    public void Button76(View v){
        music=m.play(music,"leejaewon7",this,count);
        count=m.count();
    }
    public void Button77(View v){
        music=m.play(music,"leemyunggi7",this,count);
        count=m.count();
    }
    public void Button78(View v){
        music=m.play(music,"najuhwan7",this,count);
        count=m.count();
    }
    public void Button79(View v){
        music=m.play(music,"parkjungkwon7",this,count);
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
