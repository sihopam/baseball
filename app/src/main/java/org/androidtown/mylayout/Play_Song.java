package org.androidtown.mylayout;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by hhe on 2015-12-01.
 */
public class Play_Song extends Activity {
    public int c;
    static public String name;
    MediaPlayer music;

    int position;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.play_song);

        ImageView image=(ImageView)findViewById(R.id.imageView4);
        TextView text=(TextView)findViewById(R.id.play_song);
        TextView profile=(TextView)findViewById(R.id.profile);

        switch (name){
            case "himenes":
            case "히메네스":
                text.setText("LG 트윈스");
                c = R.raw.himenes5;
                image.setImageResource(R.drawable.himenesname);
                profile.setText("신장/몸무게 185cm/92kg\n" +
                        "포지션      3루수\n" +
                        "투타        우투우타");
                break;
            case "leebyunggyu" :
            case "이병규":
                text.setText("LG 트윈스");
                c = R.raw.leebyunggyu5;
                image.setImageResource(R.drawable.leebyunggyuname);
                profile.setText("신장/몸무게 185cm/85kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "leejinyoung" :
            case "이진영":
                text.setText("LG 트윈스");
                c = R.raw.leejinyoung5;
                image.setImageResource(R.drawable.leejinyoungname);
                profile.setText("신장/몸무게 185cm/90kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "ohjihwan" :
            case "오지환":
                text.setText("LG 트윈스");
                c = R.raw.ohjihwan5;
                image.setImageResource(R.drawable.ohjihwanname);
                profile.setText("신장/몸무게 186cm/80kg\n" +
                        "포지션      유격수\n" +
                        "투타        우투좌타");
                break;
            case "parkjigyu" :
            case "박지규":
                text.setText("LG 트윈스");
                c = R.raw.parkjigyu5;
                image.setImageResource(R.drawable.parkjigyuname);
                profile.setText("신장/몸무게 183cm/80kg\n" +
                        "포지션      2루수\n" +
                        "투타        우투좌타\n");
                break;
            case "parkyongtak" :
            case "박용택":
                text.setText("LG 트윈스");
                c = R.raw.parkyongtak5;
                image.setImageResource(R.drawable.parkyongtakname);
                profile.setText("신장/몸무게 185cm/90kg\n" +
                        "포지션      외야수\n" +
                        "투타\t    우투좌타\n");
                break;
            case "seosangwoo" :
            case "서상우":
                text.setText("LG 트윈스");
                c = R.raw.seosangwoo5;
                image.setImageResource(R.drawable.seosangwooname);
                profile.setText("신장/몸무게 187cm/90kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투좌타");
                break;
            case "yangsukhwan" :
            case "양석환":
                text.setText("LG 트윈스");
                c = R.raw.yangsukhwan5;
                image.setImageResource(R.drawable.yangsukhwanname);
                profile.setText("신장/몸무게 185cm/90kg\n" +
                        "포지션\t    3루수\n" +
                        "투타\t    우투우타\n");
                break;
            case "yoogangnam" :
            case "유강남":
                text.setText("LG 트윈스");
                c = R.raw.yoogangnam5;
                image.setImageResource(R.drawable.yooganamname);
                profile.setText("신장/몸무게 182cm/88kg\n" +
                        "포지션\t    포수\n" +
                        "투타\t    우투우타");
                break;

            case "kimtaekyun" :
            case "김태균":
                text.setText("한화 이글스");
                c = R.raw.kimtaekyun;
                image.setImageResource(R.drawable.kimtakyun);
                profile.setText("신장/몸무게 185cm/110kg  \n" +
                        "포지션 \t    1루수\n" +
                        "투타\t    우투우타\n");
                break;
            case "choijinhang":
            case "최진행":
                text.setText("한화 이글스");
                c = R.raw.choijinhang;
                image.setImageResource(R.drawable.choijinhang);
                profile.setText("신장/몸무게 188cm/100kg\n" +
                        "포지션\t     외야수\n" +
                        "투타\t    우투우타");
                break;
            case "joinsung" :
            case "조인성":
                text.setText("한화 이글스");
                c = R.raw.joinsung;
                image.setImageResource(R.drawable.joinsung);
                profile.setText("신장/몸무게 183cm/99kg\n" +
                        "포지션\t    포수\n" +
                        "투타\t    우투우타");
                break;
            case "joohyunsang" :
            case "주현상":
                text.setText("한화 이글스");
                c = R.raw.joohyunsang;
                image.setImageResource(R.drawable.joohyunsang);
                profile.setText("신장/몸무게 177cm/84kg\n" +
                        "포지션\t    3루수\n" +
                        "투타\t    우투우타\n");
                break;
            case "junggeunwoo" :
            case "정근우":
                text.setText("한화 이글스");
                c = R.raw.junggeunwoo;
                image.setImageResource(R.drawable.junggeunwoo);
                profile.setText("신장/몸무게 172cm/75kg\n" +
                        "포지션\t    2루수\n" +
                        "투타\t    우투우타");
                break;
            case "kimkyungun" :
            case "김경언":
                text.setText("한화 이글스");
                c = R.raw.kimkyungun;
                image.setImageResource(R.drawable.kimkyungun);
                profile.setText("신장/몸무게 188cm/84kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    좌투좌타");
                break;

            case "leesungyul" :
            case "이성열":
                text.setText("한화 이글스");
                c = R.raw.leesungyul;
                image.setImageResource(R.drawable.leesungyul);
                profile.setText("신장/몸무게 185cm/102kg\n" +
                        "포지션\t    외야수 \n" +
                        "투타\t    우투좌타\n");
                break;
            case "leeyongkyu":
            case "이용규":
                text.setText("한화 이글스");
                c = R.raw.leeyongkyu;
                image.setImageResource(R.drawable.leeyongkyu);
                profile.setText("신장/몸무게 175cm/70kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    좌투좌타");
                break;
            case "songjuho" :
            case "송주호":
                text.setText("한화 이글스");
                c = R.raw.songjuho;
                image.setImageResource(R.drawable.songjuho);
                profile.setText("신장/몸무게 181cm/80kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투좌타");
                break;
            case "kanghanwool" :
            case "강한울":
                text.setText("기아 타이거즈");
                c = R.raw.kanghanwool2;
                image.setImageResource(R.drawable.kanghanwool2);
                profile.setText("신장/몸무게 181cm/66kg\n" +
                        "포지션     유격수\n" +
                        "투타     우투좌타");
                break;
            case "kimjoochan" :
            case "김주찬":
                text.setText("기아 타이거즈");
                c = R.raw.kimjoochan2;
                image.setImageResource(R.drawable.kimjuchan2);
                profile.setText("신장/몸무게 183cm/85kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투우타");
                break;
            case "kimminwoo" :
            case "김민우":
                text.setText("기아 타이거즈");
                c = R.raw.kimminwoo2;
                image.setImageResource(R.drawable.kimminwoo2);
                profile.setText("신장/몸무게 184cm/84kg\n" +
                        "포지션     2루수\n" +
                        "투타     우투우타");
                break;
            case "kimwonsub" :
            case "김원섭":
                text.setText("기아 타이거즈");
                c = R.raw.kimwonsub2;
                image.setImageResource(R.drawable.kimwonsub2);
                profile.setText("신장/몸무게 180cm/75kg\n" +
                        "포지션     외야수\n" +
                        "투타     우투좌타");
                break;
            case "leebeomho" :
            case "이범호":
                text.setText("기아 타이거즈");
                c = R.raw.leebeomho2;
                image.setImageResource(R.drawable.leebumho2);
                profile.setText("신장/몸무게 182cm/93kg\n" +
                        "포지션     3루수\n" +
                        "투타     우투우타");
                break;
            case "leehonggoo" :
            case "이홍구":
                text.setText("기아 타이거즈");
                c = R.raw.leehonggoo2;
                image.setImageResource(R.drawable.leehonggoo2);
                profile.setText("신장/몸무게 180cm/88kg\n" +
                        "포지션\t    포수\n" +
                        "투타\t    우투우타\n");
                break;
            case "najiwan" :
            case "나지완":
                text.setText("기아 타이거즈");
                c = R.raw.najiwan2;
                image.setImageResource(R.drawable.najiwan2);
                profile.setText("신장/몸무게 182cm/101kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투우타");
                break;
            case "phil" :
            case "필":
                text.setText("기아 타이거즈");
                c = R.raw.phil2;
                image.setImageResource(R.drawable.pill2);
                profile.setText("신장/몸무게 193cm/102kg\n" +
                        "포지션\t    1루수\n" +
                        "투타\t    우투우타");
                break;
            case "shinjonggil" :
            case "신종길":
                text.setText("기아 타이거즈");
                c = R.raw.shinjonggil2;
                image.setImageResource(R.drawable.shinjonggil2);
                profile.setText("신장/몸무게 183cm/85kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투좌타");
                break;


            case "aduchi" :
            case "아두치":
                text.setText("롯데 자이언츠");
                c = R.raw.aduchi3;
                image.setImageResource(R.drawable.aduchi3);
                profile.setText("신장/몸무게 188cm/95kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    좌투좌타");
                break;
            case "choijunsuk" :
            case "최준석":
                text.setText("롯데 자이언츠");
                c = R.raw.choijunsuk3;
                image.setImageResource(R.drawable.choijunsuk3);
                profile.setText("신장/몸무게 187cm/130kg\n" +
                        "포지션\t    1루수\n" +
                        "투타\t    우투우타");
                break;
            case "hwangjaegyun" :
            case "황재균":
                text.setText("롯데 자이언츠");
                c = R.raw.hwangjaegyun3;
                image.setImageResource(R.drawable.hwangjaegyun3);
                profile.setText("신장/몸무게 183cm/90kg\n" +
                        "포지션\t    3루수\n" +
                        "투타\t    우투우타");
                break;
            case "junghoon" :
            case "정훈":
                text.setText("롯데 자이언츠");
                c = R.raw.junghoon3;
                image.setImageResource(R.drawable.junghoon3);
                profile.setText("신장/몸무게 181cm/84kg\n" +
                        "포지션\t    2루수\n" +
                        "투타\t    우투우타");
                break;
            case "kangminho" :
            case "강민호":
                text.setText("롯데 자이언츠");
                c = R.raw.kangminho3;
                image.setImageResource(R.drawable.kangminho3);
                profile.setText("신장/몸무게 186cm/100kg\n" +
                        "포지션\t    포수\n" +
                        "투타\t    우투우타");
                break;
            case "kimdaewoo" :
            case "김대우":
                text.setText("롯데 자이언츠");
                c = R.raw.kimdaewoo3;
                image.setImageResource(R.drawable.kimdaewoo3);
                profile.setText("신장/몸무게 190cm/94kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투좌타");
                break;
            case "kimmunho" :
            case "김문호":
                text.setText("롯데 자이언츠");
                c = R.raw.kimmunho3;
                image.setImageResource(R.drawable.kimmunho3);
                profile.setText("신장/몸무게 184cm/90kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    좌투좌타");
                break;
            case "mungyuhyun" :
            case "문규현":
                text.setText("롯데 자이언츠");
                c = R.raw.mungyuhyun3;
                image.setImageResource(R.drawable.mungyuhyun3);
                profile.setText("신장/몸무게 184cm/87kg\n" +
                        "포지션\t    유격수\n" +
                        "투타\t    우투우타");
                break;
            case "sonasub" :
            case "손아섭":
                text.setText("롯데 자이언츠");
                c = R.raw.sonasub3;
                image.setImageResource(R.drawable.sonasub3);
                profile.setText("신장/몸무게 174cm/88kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투좌타");
                break;

            case "chaetaein" :
            case "채태인":
                text.setText("삼성 라이온즈");
                c = R.raw.chaetaein4;
                profile.setText("신장/몸무게 187cm/94kg\n" +
                        "포지션\t    1루수\n" +
                        "투타\t    좌투좌타");
                image.setImageResource(R.drawable.chaetaein4);
                break;
            case "choihyungwoo" :
            case "최형우":
                text.setText("삼성 라이온즈");
                c = R.raw.choihyungwoo4;
                image.setImageResource(R.drawable.choihyungwoo4);
                profile.setText("신장/몸무게 179cm/105kg\n" +
                        "포지션\t    외야수\n" +
                        "투타\t    우투좌타");
                break;
            case "kimsangsoo" :
            case "김상수":
                text.setText("삼성 라이온즈");
                c = R.raw.kimsangsoo4;
                image.setImageResource(R.drawable.kimsangsoo4);
                profile.setText("신장/몸무게 175cm/68kg\n" +
                        "포지션\t    유격수\n" +
                        "투타\t    우투우타");
                break;
            case "leejiyoung" :
            case "이지영":
                text.setText("삼성 라이온즈");
                c = R.raw.leejiyoung4;
                image.setImageResource(R.drawable.leejiyoung4);
                profile.setText("신장/몸무게 178cm/83kg\n" +
                        "포지션\t    포수\n" +
                        "투타\t    우투우타");
                break;
            case "leeseungyup" :
            case "이승엽":
                text.setText("삼성 라이온즈");
                c = R.raw.leeseungyup4;
                image.setImageResource(R.drawable.leeseungyup4);
                profile.setText("신장/몸무게 183cm/87kg\n" +
                        "포지션\t    1루수\n" +
                        "투타\t    좌투좌타\n");
                break;
            case "navaro" :
            case "나바로":
                text.setText("삼성 라이온즈");
                c = R.raw.navaro4;
                image.setImageResource(R.drawable.navaro4);
                profile.setText("신장/몸무게 183cm/93kg\n" +
                        "포지션\t2루수\n" +
                        "투타\t우투우타");
                break;
            case "parkhaemin" :
            case "박해민":
                text.setText("삼성 라이온즈");
                c = R.raw.parkhaemin4;
                image.setImageResource(R.drawable.parkhaemin4);
                profile.setText("신장/몸무게 180cm/75kg\n" +
                        "포지션\t외야수\n" +
                        "투타\t우투좌타");
                break;
            case "parkhani" :
            case "박한이":
                text.setText("삼성 라이온즈");
                c = R.raw.parkhani4;
                image.setImageResource(R.drawable.parkhani4);
                profile.setText("신장/몸무게 182cm/91kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "parksukmin" :
            case "박석민":
                text.setText("삼성 라이온즈");
                c = R.raw.parksukmin4;
                image.setImageResource(R.drawable.parksukmin4);
                profile.setText("신장/몸무게 178cm/88kg\n" +
                        "포지션      3루수\n" +
                        "투타        우투우타");
                break;

            case "jisukhun" :
            case "지석훈":
                text.setText("NC 다이노스");
                c = R.raw.jisukhoon6;
                image.setImageResource(R.drawable.jisukhun_name);
                profile.setText("신장/몸무게 181cm/74kg\n" +
                        "포지션      2루수\n" +
                        "투타        우투우타");
                break;
            case "kimjongho" :
            case "김종호":
                text.setText("NC 다이노스");
                c = R.raw.kimjongho6;
                image.setImageResource(R.drawable.kimjongho_name);
                profile.setText("신장/몸무게 183cm/82kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "kimtaegun" :
            case "김태군":
                text.setText("NC 다이노스");
                c = R.raw.kimtaegun6;
                image.setImageResource(R.drawable.kimtaegun_name);
                profile.setText("신장/몸무게 182cm/92kg\n" +
                        "포지션      포수\n" +
                        "투타        우투우타");
                break;
            case "leehojoon" :
            case "이호준":
                text.setText("NC 다이노스");
                c = R.raw.leehojoon6;
                image.setImageResource(R.drawable.leehojun_name);
                profile.setText("신장/몸무게 187cm/98kg\n" +
                        "포지션      1루수\n" +
                        "투타        우투우타");
                break;
            case "leejongwook" :
            case "이종욱":
                text.setText("NC 다이노스");
                c = R.raw.leejongwook6;
                image.setImageResource(R.drawable.leejongwook_name);
                profile.setText("신장/몸무게 176cm/78kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "nasungbeom" :
            case "나성범":
                text.setText("NC 다이노스");
                c = R.raw.nasungbeom6;
                image.setImageResource(R.drawable.nasungbeom_name);
                profile.setText("신장/몸무게 183cm/95kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "parkminwoo" :
            case "박민우":
                text.setText("NC 다이노스");
                c = R.raw.parkminwoo6;
                image.setImageResource(R.drawable.parkminwoo_name);
                profile.setText("신장/몸무게 185cm\n" +
                        "포지션      2루수\n" +
                        "투타        좌투좌타");
                break;
            case "sonsiheon" :
            case "손시헌":
                text.setText("NC 다이노스");
                c = R.raw.sonsiheon6;
                image.setImageResource(R.drawable.sonsiheon_name);
                profile.setText("신장/몸무게 172cm/73kg\n" +
                        "포지션      유격수\n" +
                        "투타        우투우타");
                break;
            case "thames" :
            case "테임즈":
                text.setText("NC 다이노스");
                c = R.raw.thames6;
                image.setImageResource(R.drawable.thames_name);
                profile.setText("신장/몸무게 183cm/95kg\n" +
                        "포지션      1루수\n" +
                        "투타        좌투좌타\n");
                break;


            case "brown" :
            case "브라운":
                text.setText("sk 와이번스");
                c = R.raw.brown7;
                image.setImageResource(R.drawable.brown7);
                profile.setText("신장/몸무게 182cm/90kg\n" +
                        "포지션      외야수\n" +
                        "투타        우투우타");
                break;
            case "choijung" :
            case "최정":
                text.setText("sk 와이번스");
                c = R.raw.choijung7;
                image.setImageResource(R.drawable.choijung7);
                profile.setText("신장/몸무게 180cm/90kg\n" +
                        "포지션      3루수\n" +
                        "투타        우투우타");
                break;
            case "jodonghwa" :
            case "조동화":
                text.setText("sk 와이번스");
                c = R.raw.jodonghwa7;
                image.setImageResource(R.drawable.jodonghwa7);
                profile.setText("신장/몸무게 175cm/74kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "jungsangho" :
            case "정상호":
                text.setText("sk 와이번스");
                c = R.raw.jungsangho7;
                image.setImageResource(R.drawable.jungsangho7);
                profile.setText("신장/몸무게 187cm/100kg\n" +
                        "포지션      포수\n" +
                        "투타        우투우타\n");
                break;
            case "kimsunghyun" :
            case "김성현":
                text.setText("sk 와이번스");
                c = R.raw.kimsunghyun7;
                image.setImageResource(R.drawable.kimsunghyun7);
                profile.setText("신장/몸무게 172cm/68kg\n" +
                        "포지션      2루수\n" +
                        "투타        우투우타");
                break;
            case "leejaewon" :
            case "이재원":
                text.setText("sk 와이번스");
                c = R.raw.leejaewon7;
                image.setImageResource(R.drawable.leejaewon7);
                profile.setText("신장/몸무게 185cm/98kg\n" +
                        "포지션      포수\n" +
                        "투타        우투우타");
                break;
            case "leemyunggi" :
            case "이명기":
                text.setText("sk 와이번스");
                c = R.raw.leemyunggi7;
                image.setImageResource(R.drawable.leemyungki7);
                profile.setText("신장/몸무게 183cm/80kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "najuhwan" :
            case "나주환":
                text.setText("sk 와이번스");
                c = R.raw.najuhwan7;
                image.setImageResource(R.drawable.najuhwan7);
                profile.setText("신장/몸무게 180cm/84kg\n" +
                        "포지션      유격수\n" +
                        "투타        우투우타");
                break;
            case "parkjunggwon" :
            case "박정권":
                text.setText("sk 와이번스");
                c = R.raw.parkjunggwon7;
                image.setImageResource(R.drawable.parkjunggwon7);
                profile.setText("신장/몸무게 187cm/93kg\n" +
                        "포지션      1루수\n" +
                        "투타        좌투좌타");
                break;

            case "kimhasung" :
            case "김하성":
                text.setText("넥센 히어로즈");
                c = R.raw.kimhasung8;
                image.setImageResource(R.drawable.kimhasung_name);
                profile.setText("신장/몸무게 175cm/76kg\n" +
                        "포지션      유격수\n" +
                        "투타        우투우타");
                break;
            case "kimminsung" :
            case "김민성":
                text.setText("넥센 히어로즈");
                c = R.raw.kimminsung8;
                image.setImageResource(R.drawable.kimminsung_name);
                profile.setText("신장/몸무게 181cm/94kg\n" +
                        "포지션      3루수\n" +
                        "투타        우투우타");
                break;
            case "kojongwook" :
            case "고종욱":
                text.setText("넥센 히어로즈");
                c = R.raw.kojongwook8;
                image.setImageResource(R.drawable.kojongwook_name);
                profile.setText("신장/몸무게 184cm/83kg\n" +
                        "포지션      외야수\n" +
                        "투타        우투좌타");
                break;
            case "parkbyungho" :
            case "박병호":
                text.setText("넥센 히어로즈");
                c = R.raw.parkbyungho8;
                image.setImageResource(R.drawable.parkbyungho_name);
                profile.setText("신장/몸무게 185cm/107kg\n" +
                        "포지션      1루수\n" +
                        "투타        우투우타");
                break;
            case "parkdongwon" :
            case "박동원":
                text.setText("넥센 히어로즈");
                c = R.raw.parkdongwon8;
                image.setImageResource(R.drawable.parkdongwon_name);
                profile.setText("신장/몸무게 179cm/92kg\n" +
                        "포지션      포수\n" +
                        "투타        우투우타");
                break;
            case "seogunchang" :
            case "서건창":
                text.setText("넥센 히어로즈");
                c = R.raw.seogeonchang8;
                image.setImageResource(R.drawable.seogunchang_name);
                profile.setText("신장/몸무게 176cm/84kg\n" +
                        "포지션      2루수\n" +
                        "투타        우투좌타");
                break;
            case "snider" :
            case "스나이더":
                text.setText("넥센 히어로즈");
                c = R.raw.snider8;
                image.setImageResource(R.drawable.snider_name);
                profile.setText("신장/몸무게 192cm/96kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "yoohanjun" :
            case "유한준":
                text.setText("넥센 히어로즈");
                c = R.raw.yoohanjoon8;
                image.setImageResource(R.drawable.yoohanjun_name);
                profile.setText("신장/몸무게 186cm/97kg\n" +
                        "포지션      외야수\n" +
                        "투타        우투우타");
                break;
            case "yoonsukmin" :
            case "윤석민":
                text.setText("넥센 히어로즈");
                c = R.raw.yoonsukmin8;
                image.setImageResource(R.drawable.yoonsukmin_name);
                profile.setText("신장/몸무게 180cm/88kg\n" +
                        "포지션      3루수\n" +
                        "투타        우투우타\n");
                break;

            case "heogyungmin" :
            case "허경민":
                text.setText("두산 베어스");
                c = R.raw.heogyungmin9;
                image.setImageResource(R.drawable.heogyungmin9);
                profile.setText("신장/몸무게 178cm/84kg\n" +
                        "포지션      3루수\n" +
                        "투타        우투우타");
                break;
            case "jungsubin" :
            case "정수빈":
                text.setText("두산 베어스");
                c = R.raw.jungsubin9;
                image.setImageResource(R.drawable.jungsubin9);
                profile.setText("신장/몸무게 175cm/70kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "kimhyunsoo" :
            case "김현수":
                text.setText("두산 베어스");
                c = R.raw.kimhyunsoo9;
                image.setImageResource(R.drawable.kimhyunsoo9);
                profile.setText("신장/몸무게 190cm/100kg\n" +
                        "포지션      외야수\n" +
                        "투타        우투좌타");
                break;
            case "kimjaeho" :
            case "김재호":
                text.setText("두산 베어스");
                c = R.raw.kimjaeho9;
                image.setImageResource(R.drawable.kimjaeho9);
                profile.setText("신장/몸무게 181cm/76kg\n" +
                        "포지션      유격수\n" +
                        "투타        우투우타");
                break;
            case "koyoungmin" :
            case "고영민":
                text.setText("두산 베어스");
                c = R.raw.koyoungmin9;
                image.setImageResource(R.drawable.koyoungmin9);
                profile.setText("신장/몸무게 182cm/76kg\n" +
                        "포지션      2루수\n" +
                        "투타        우투우타");
                break;
            case "minbyungheon" :
            case "민병헌":
                text.setText("두산 베어스");
                c = R.raw.minbyungheon9;
                image.setImageResource(R.drawable.minbyungheon9);
                profile.setText("신장/몸무게 178kg/79kg\n" +
                        "포지션      외야수\n" +
                        "투타        우투우타");
                break;
            case "ohjaewon" :
            case "오재원":
                text.setText("두산 베어스");
                c = R.raw.ohjaewon9;
                image.setImageResource(R.drawable.ohjaewon9);
                profile.setText("신장/몸무게 185cm/80kg\n" +
                        "포지션      2루수\n" +
                        "투타        우투좌타");
                break;
            case "romero" :
            case "로메로":
                text.setText("두산 베어스");
                c = R.raw.romero9;
                image.setImageResource(R.drawable.romero9);
                profile.setText("신장/몸무게 188cm/102kg\n" +
                        "포지션      1루수\n" +
                        "투타        우투우타");
                break;
            case "yangeuiji" :
            case "양의지":
                text.setText("두산 베어스");
                c = R.raw.yangeuiji9;
                image.setImageResource(R.drawable.yangeuiji9);
                profile.setText("신장/몸무게 179cm/85kg\n" +
                        "포지션      포수\n" +
                        "투타        우투우타");
                break;

            case "danblack" :
            case "댄블랙":
                text.setText("KT 위즈");
                c = R.raw.danblack0;
                image.setImageResource(R.drawable.danblack0);
                profile.setText("신장/몸무게 193cm/116kg\n" +
                        "포지션      1루수\n" +
                        "투타        우투양타");
                break;
            case "hajunho" :
            case "하준호":
                text.setText("KT 위즈");
                c = R.raw.hajunho0;
                image.setImageResource(R.drawable.hajunho0);
                profile.setText("신장/몸무게 174cm/78kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "jangsungwoo" :
            case "장성우":
                text.setText("KT 위즈");
                c = R.raw.jansungwoo0;
                image.setImageResource(R.drawable.jangsungwoo0);
                profile.setText("신장/몸무게 187cm/100kg\n" +
                        "포지션      포수\n" +
                        "투타        우투우타");
                break;
            case "kimsanghyun" :
            case "김상현":
                text.setText("KT 위즈");
                c = R.raw.kimsanghyun0;
                image.setImageResource(R.drawable.kimsanghyun0);
                profile.setText("신장/몸무게 190cm/95kg\n" +
                        "포지션      외야수\n" +
                        "투타        우투우타");
                break;
            case "kimsayeon" :
            case "김사연":
                text.setText("KT 위즈");
                c = R.raw.kimsayeon0;
                image.setImageResource(R.drawable.kimsayeon0);
                profile.setText("신장/몸무게 179cm/80kg\n" +
                        "포지션      외야수\n" +
                        "투타        우투우타");
                break;
            case "leedaehyung" :
            case "이대형":
                text.setText("KT 위즈");
                c = R.raw.leedaehyung0;
                image.setImageResource(R.drawable.leedaehyung0);
                profile.setText("신장/몸무게 184cm/78kg\n" +
                        "포지션      외야수\n" +
                        "투타        좌투좌타");
                break;
            case "marte" :
            case "마르테":
                text.setText("KT 위즈");
                c = R.raw.marte0;
                image.setImageResource(R.drawable.marte0);
                profile.setText("신장/몸무게 185cm/93kg \n" +
                        "포지션      3루수\n" +
                        "투타        우투우타");
                break;
            case "parkkihyuk" :
            case "박기혁":
                text.setText("KT 위즈");
                c = R.raw.parkkihyuk0;
                image.setImageResource(R.drawable.parkkihyuk0);
                profile.setText("신장/몸무게 179cm/77kg\n" +
                        "포지션      유격수\n" +
                        "투타        우투우타");
                break;
            case "parkkyungsoo" :
            case "박경수":
                text.setText("KT 위즈");
                c = R.raw.parkkyungsoo0;
                image.setImageResource(R.drawable.parkkyungsoo0);
                profile.setText("신장/몸무게 178cm/80kg\n" +
                        "포지션        2루수\n" +
                        "투타        우투우타");
                break;

            default:
                c = 0;
                break;
        }

        image.invalidate();

        music = MediaPlayer.create(this, c);
        music.setLooping(false);

    }
    public void play(View v) {
        music.start();
    }

    public void pause(View v){
        if(music.isPlaying()) {
            // 재생중이면 실행될 작업 (정지)
            music.pause();
            try {
                music.prepare();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop(View v){
        if(music !=null ) {
            music.pause();
            music.seekTo(0);
        }

    }

    protected void killplayer(){
        if(music!=null){
            music.release();
            music=null;
        }
    }
    protected void onDestroy(){
        super.onDestroy();
        killplayer();
    }

}
