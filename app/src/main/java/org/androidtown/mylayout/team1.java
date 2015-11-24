package org.androidtown.mylayout;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Administrator on 2015-09-17.
 */
public class team1 extends AppCompatActivity {

    MediaPlayer music=new MediaPlayer();
    int count=0;
    MusicMaker m=new MusicMaker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team1);
    }

        public void Button11(View v){
            music=m.play(music,"choijinhang",this,count);
            count=m.count();
        }
        public void Button12(View v){
            music=m.play(music,"joinsung",this,count);
            count=m.count();
        }
        public void Button13(View v){
            music=m.play(music,"joohyungsang",this,count);
            count=m.count();
        }
        public void Button14(View v){
            music=m.play(music,"junggeunwoo",this,count);
            count=m.count();
        }
        public void Button15(View v){
            music=m.play(music,"kimkyungun",this,count);
            count=m.count();
        }
        public void Button16(View v){
            music=m.play(music,"kimtaekyun",this,count);
            count=m.count();
        }
        public void Button17(View v){
            music=m.play(music,"leesungyul",this,count);
            count=m.count();
        }
        public void Button18(View v){
            music=m.play(music,"leeyongkyu",this,count);
            count=m.count();
        }
        public void Button19(View v){
            music=m.play(music,"songjuho",this,count);
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