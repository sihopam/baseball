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

    static public int team_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(team_num);
    }

        public void Button11(View v){
            music=m.play(music,"kimtaekyun",this,count);
            count=m.count();
        }
        public void Button12(View v){
            music=m.play(music,"choijinhang",this,count);
            count=m.count();
        }
        public void Button13(View v){
            music=m.play(music,"joinsung",this,count);
            count=m.count();
        }
        public void Button14(View v){
            music=m.play(music,"joohyunsang",this,count);
            count=m.count();
        }
        public void Button15(View v){
            music=m.play(music,"junggeunwoo",this,count);
            count=m.count();
        }
        public void Button16(View v){
            music=m.play(music,"kimkyungun",this,count);
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

    public void Button51(View v){
        music=m.play(music,"himenes5",this,count);
        count=m.count();
    }
    public void Button52(View v){
        music=m.play(music,"leebyunggyu5",this,count);
        count=m.count();
    }
    public void Button53(View v){
        music=m.play(music,"leejinyoung5",this,count);
        count=m.count();
    }
    public void Button54(View v){
        music=m.play(music,"ohjihwan5",this,count);
        count=m.count();
    }
    public void Button55(View v){
        music=m.play(music,"parkjigyu5",this,count);
        count=m.count();
    }
    public void Button56(View v){
        music=m.play(music,"parkyongtak5",this,count);
        count=m.count();
    }
    public void Button57(View v){
        music=m.play(music,"seosangwoo5",this,count);
        count=m.count();
    }
    public void Button58(View v){
        music=m.play(music,"yangsukhwan5",this,count);
        count=m.count();
    }
    public void Button59(View v){
        music=m.play(music,"yoogangnam5",this,count);
        count=m.count();
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

    public void Button71(View v){
        music=m.play(music,"brown7",this,count);
        count=m.count();
    }
    public void Button72(View v){
        music=m.play(music,"choijung7",this,count);
        count=m.count();
    }
    public void Button73(View v){
        music=m.play(music,"jodonghwa7",this,count);
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

    public void Button91(View v){
        music=m.play(music,"heogyungmin9",this,count);
        count=m.count();
    }
    public void Button92(View v){
        music=m.play(music,"jungsubin9",this,count);
        count=m.count();
    }
    public void Button93(View v){
        music=m.play(music,"kimhyunsoo9",this,count);
        count=m.count();
    }
    public void Button94(View v){
        music=m.play(music,"kimjaeho9",this,count);
        count=m.count();
    }
    public void Button95(View v){
        music=m.play(music,"koyoungmin9",this,count);
        count=m.count();
    }
    public void Button96(View v){
        music=m.play(music,"minbyungheon9",this,count);
        count=m.count();
    }
    public void Button97(View v){
        music=m.play(music,"ohjaewon9",this,count);
        count=m.count();
    }
    public void Button98(View v){
        music=m.play(music,"romero9",this,count);
        count=m.count();
    }
    public void Button99(View v){
        music=m.play(music,"yangeuiji9",this,count);
        count=m.count();
    }

    public void Button01(View v){
        music=m.play(music,"danblack0",this,count);
        count=m.count();
    }
    public void Button02(View v){
        music=m.play(music,"hajunho0",this,count);
        count=m.count();
    }
    public void Button03(View v){
        music=m.play(music,"jangsungwoo0",this,count);
        count=m.count();
    }
    public void Button04(View v){
        music=m.play(music,"kimsanghyun0",this,count);
        count=m.count();
    }
    public void Button05(View v){
        music=m.play(music,"kimsayeon0",this,count);
        count=m.count();
    }
    public void Button06(View v){
        music=m.play(music,"leedaehyung0",this,count);
        count=m.count();
    }
    public void Button07(View v){
        music=m.play(music,"marte0",this,count);
        count=m.count();
    }
    public void Button08(View v){
        music=m.play(music,"parkkihyuk0",this,count);
        count=m.count();
    }
    public void Button09(View v){
        music=m.play(music,"parkkyungsoo0",this,count);
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