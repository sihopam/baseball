package org.androidtown.mylayout;

import android.content.Context;
import android.media.MediaPlayer;

import java.io.IOException;

/**
 * Created by hhe on 2015-11-06.
 */
public class MusicPlayer {
    String name;
    MediaPlayer song;
    //int addr;
    public int play(MediaPlayer a,String b,Context context){
        song=a;
        name=b;
        int c;

        switch (name){
            case "leeyonggyu" : c=R.raw.leeyongkyu;
                break;
            case "choijinhang" : c=R.raw.choijinhang;
                break;
            default:c=0;break;
        }
       //song= MediaPlayer.create(context,c);
        //song.start();

 /*       if(song.isPlaying()){
// 재생중이면 실행될 작업 (정지)
            song.stop();
            try {
                song.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }else{
            song.start();

        }
*/
        return c;
    }

    public MediaPlayer musicplay(MediaPlayer song,int a){
        if(a==1) {
            song.stop();
            try {
                song.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else{
            song.start();
        }
        return song;
    }


}
