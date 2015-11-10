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

            case "choijinhang":
                c = R.raw.choijinhang;
                break;
            case "joinsung" :
                c = R.raw.joinsung;
                break;
            case "joohyunsang" :
                c = R.raw.joohyunsang;
                break;
            case "junggeunwoo" :
                c = R.raw.junggeunwoo;
                break;
            case "kimkyungun" :
                c = R.raw.kimkyungun;
                break;
            case "kimtaekyun" :
                c = R.raw.kimtaekyun;
                break;
            case "leesungyul" :
                c = R.raw.leesungyul;
                break;
            case "leeyongkyu":
                c = R.raw.leeyongkyu;
                break;
            case "songjuho" :
                c = R.raw.songjuho;
                break;


            case "kanghanwool2" :
                c = R.raw.kanghanwool2;
                break;
            case "kimjoochan2" :
                c = R.raw.kimjoochan2;
                break;
            case "kimminwoo2" :
                c = R.raw.kimminwoo2;
                break;
            case "kimwonsub2" :
                c = R.raw.kimwonsub2;
                break;
            case "leebeomho2" :
                c = R.raw.leebeomho2;
                break;
            case "leehonggoo2" :
                c = R.raw.leehonggoo2;
                break;
            case "najiwan2" :
                c = R.raw.najiwan2;
                break;
            case "phil2" :
                c = R.raw.phil2;
                break;
            case "shinjonggil2" :
                c = R.raw.shinjonggil2;
                break;


            case "aduchi3" :
                c = R.raw.aduchi3;
                break;
            case "choijunsuk3" :
                c = R.raw.choijunsuk3;
                break;
            case "hwangjaegyun3" :
                c = R.raw.hwangjaegyun3;
                break;
            case "junghoon3" :
                c = R.raw.junghoon3;
                break;
            case "kangminho3" :
                c = R.raw.kangminho3;
                break;
            case "kimdaewoo3" :
                c = R.raw.kimdaewoo3;
                break;
            case "kimmunho3" :
                c = R.raw.kimmunho3;
                break;
            case "mungyuhyung3" :
                c = R.raw.mungyuhyun3;
                break;
            case "sonasub3" :
                c = R.raw.sonasub3;
                break;

            case "chaetaein4" :
                c = R.raw.chaetaein4;
                break;
            case "choihyungwoo4" :
                c = R.raw.choihyungwoo4;
                break;
            case "kimsangsoo4" :
                c = R.raw.kimsangsoo4;
                break;
            case "leejiyoung4" :
                c = R.raw.leejiyoung4;
                break;
            case "leeseungyup4" :
                c = R.raw.leeseungyup4;
                break;
            case "navaro4" :
                c = R.raw.navaro4;
                break;
            case "parkhaemin4" :
                c = R.raw.parkhaemin4;
                break;
            case "parkhani4" :
                c = R.raw.parkhani4;
                break;
            case "parksukmin4" :
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

            case "jisukhun6" :
                c = R.raw.jisukhoon6;
                break;
            case "kimjongho6" :
                c = R.raw.kimjongho6;
                break;
            case "kimtaegun6" :
                c = R.raw.kimtaegun6;
                break;
            case "leehojoon6" :
                c = R.raw.leehojoon6;
                break;
            case "leejongwook6" :
                c = R.raw.leejongwook6;
                break;
            case "nasungbeom6" :
                c = R.raw.nasungbeom6;
                break;
            case "parkminwoo6" :
                c = R.raw.parkminwoo6;
                break;
            case "sonsiheon6" :
                c = R.raw.sonsiheon6;
                break;
            case "thames6" :
                c = R.raw.thames6;
                break;
/*

            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
            case "" :
                c = R.raw.;
                break;
*/

            case "kimhasung8" :
                c = R.raw.kimhasung8;
                break;
            case "kimminsung8" :
                c = R.raw.kimminsung8;
                break;
            case "kojongwook8" :
                c = R.raw.kojongwook8;
                break;
            case "parkbyungho8" :
                c = R.raw.parkbyungho8;
                break;
            case "parkdongwon8" :
                c = R.raw.parkdongwon8;
                break;
            case "seogunchang8" :
                c = R.raw.seogeonchang8;
                break;
            case "snider8" :
                c = R.raw.snider8;
                break;
            case "yoohanjun8" :
                c = R.raw.yoohanjoon8;
                break;
            case "yoonsukmin8" :
                c = R.raw.yoonsukmin8;
                break;

            case "heogyungmin9" :
                c = R.raw.heogyungmin9;
                break;
            case "jungsubin9" :
                c = R.raw.jungsubin9;
                break;
            case "kimhyunsoo9" :
                c = R.raw.kimhyunsoo9;
                break;
            case "kimjaeho9" :
                c = R.raw.kimjaeho9;
                break;
            case "koyoungmin9" :
                c = R.raw.koyoungmin9;
                break;
            case "minbyungheon9" :
                c = R.raw.minbyungheon9;
                break;
            case "ohjaewon9" :
                c = R.raw.ohjaewon9;
                break;
            case "romero9" :
                c = R.raw.romero9;
                break;
            case "yangeuiji9" :
                c = R.raw.yangeuiji9;
                break;

            case "danblack0" :
                c = R.raw.danblack0;
                break;
            case "hajunho0" :
                c = R.raw.hajunho0;
                break;
            case "jangsungwoo0" :
                c = R.raw.jansungwoo0;
                break;
            case "kimsanghyn0" :
                c = R.raw.kimsanghyun0;
                break;
            case "kimsayeon0" :
                c = R.raw.kimsayeon0;
                break;
            case "leedaehyung0" :
                c = R.raw.leedaehyung0;
                break;
            case "marte0" :
                c = R.raw.marte0;
                break;
            case "parkkihyuk0" :
                c = R.raw.parkkihyuk0;
                break;
            case "parkkyungsoo0" :
                c = R.raw.parkkyungsoo0;
                break;



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
