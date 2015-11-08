package org.androidtown.mylayout;

import android.content.Context;
import android.media.MediaPlayer;

import java.io.IOException;

/**
 * Created by hhe on 2015-11-06.
 */
public class MusicMaker {
    String name;
    MediaPlayer song,remember;
    int incount=0;
    String prev_name;
    //int addr;
    public MediaPlayer play(MediaPlayer a,String b,Context context,int count) {
        song = a;
        name = b;
        int c;
        incount=count;

        switch (b) {
            case "jisukhun":
                c = R.raw.leeyongkyu;
                break;
            case "kimjongho":
                c = R.raw.choijinhang;
                break;
            case "kimtaegun" :
                c = R.raw.joohyungsang;
                break;
            case "leehojun" :
                c = R.raw.kimkyungun;
                break;
            case "leejongwook" :
                c = R.raw.joinsung;
                break;
            case "nasungbeom" :
                c = R.raw.kimtaekyun;
                break;
            case "parkminwoo" :
                c = R.raw.najiwan;
                break;
            case "sonsiheon" :
                c = R.raw.songjuho;
                break;
            case "thames" :
                c = R.raw.leesungyul;
                break;
            case "chaetaein" :
                c = R.raw.chaetaein4;
                break;
            case "choihyungwoo" :
                c = R.raw.choihyungwoo4;
                break;
            case "kimsangsoo" :
                c = R.raw.kimsangsoo4;
                break;
            case "leejiyoung" :
                c = R.raw.leejiyoung4;
                break;
            case "leeseungyup" :
                c = R.raw.leeseungyup4;
                break;
            case "navaro" :
                c = R.raw.navaro4;
                break;
            case "parkhaemin" :
                c = R.raw.parkhaemin4;
                break;
            case "parkhani" :
                c = R.raw.parkhani4;
                break;
            case "parksukmin" :
                c = R.raw.parksukmin4;
                break;
            case "himenes5" :
                c = R.raw.himenes5;
                break;
            case "leebyunggyu5" :
                c = R.raw.leebyunggyu5;
                break;
            case "leejinyoung5" :
                c = R.raw.leejinyoung5;
                break;
            case "ohjihwan5" :
                c = R.raw.ohjihwan5;
                break;
            case "parkjigyu5" :
                c = R.raw.parkjigyu5;
                break;
            case "parkyongtak5" :
                c = R.raw.parkyongtak5;
                break;
            case "seosanghoon5" :
                c = R.raw.seosangwoo5;
                break;
            case "yangsukhwan5" :
                c = R.raw.yangsukhwan5;
                break;
            case "yoogangnam5" :
                c = R.raw.yoogangnam5;
                break;
            /*case "brown7" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw;
                break;
            case "" :
                c = R.raw;
                break;
            case "" :
                c = R.raw;
                break;
            case "" :
                c = R.raw;
                break;
            case "" :
                c = R.raw;
                break;
            case "" :
                c = R.raw;
                break;
            case "" :
                c = R.raw;
                break;
            case "" :
                c = R.raw;
                break;*/
            default:
                c = 0;
                break;
        }
        if(incount==0){
            song=MediaPlayer.create(context,c);
        }
        if(prev_name!=name){
            killPlayer();
            song=MediaPlayer.create(context,c);
            incount=0;
        }

        if(song.isPlaying()){
            song.stop();
            try {
                a.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //song=a;
        }
        else{
            song.start();
        }




        prev_name=name;

        return song;
    }


    public int count(){
        incount++;
        if(incount==10)incount=0;
        return incount;
    }

    protected void killPlayer(){
        if(song!=null){
            song.release();
            song=null;
        }
    }
}
