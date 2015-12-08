package org.androidtown.mylayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

/**
 * Created by hhe on 2015-12-01.
 */
public class Search_Player extends Activity{
    String[] items = {"himenes", "leebyunggyu", "leejinyoung", "ohjihwan", "parkjigyu", "parkyongtak", "seosangwoo", "yangsukhwan", "yoogangnam",
            "히메네스", "이병규", "이진영", "오지환", "박지규", "박용택", "서상우", "양석환", "유강남",
            "joohyungsang","choijinhang","joinsung","junggeungwoo","kimkyungun","kimtaekyun","leesungyul","leeyongkyu","songjuho",
            "주현상", "최진행", "조인성", "정근우", "김경언", "김태균", "이성열", "이용규", "송주호",
            "kanghanwool","kimjoochan","kimminwoo","kimwonsub","leebeomho","leehonggoo","najiwan","phil","shinjonggil",
            "강한울", "김주찬", "김민우", "김원섭", "이범호", "이홍구", "나지완", "필", "신종길",
            "aduchi","choijunsuk","hwangjaegyun","junghoon","kangminho","kimdaewoo","kimmunho","mungyuhyun","sonasub",
            "아두치", "최준석", "황재균", "정훈", "강민호", "김대우", "김문호", "문규현", "손아섭",
            "chaetaein","choihyungwoo","kimsangsoo","leejiyoung","leeseungyup","navaro","parkhaemin","parkhani","parksukmin",
            "채태인","최형우","김상수","이지영","이승엽","나바로","박해민","박한이","박석민",
            "kimhasung","kimminsung","kojongwook","parkbyungho","parkdongwon","seogunchang","snider","yoohanjoon","yoonsukmin",
            "김하성","김민성","고종욱","박병호","박동원","서건창","스나이더","유한준","윤석민",
            "brown","choijung","jodonghwa","jungsangho","kimsunghyun","leejaewon","leemyunggi","najuhwan","parkjunggwon",
            "브라운","최정","조동화","정상호","김성현","이재원","이명기","나주환","박정권",
            "jisukhun","kimjongho","kimtaegun","leehojoon","leejongwook","nasungbeom","parkminwoo","sonsiheon","thames",
            "지석훈","김종호","김태군","이호준","이종욱","나성범","박민우","손시헌","테임즈",
            "heogyungmin","jungsubin","kimhyunsoo","kimjaeho","koyoungmin","yangeuiji","minbyungheon","ohjaewon","romero",
            "허경민","정수빈","김현수","김재호","고영민","양의지","민병헌","오재원","로메로",
            "danblack","hajunho","jangsungwoo","kimsanghyun","kimsayeon","leedaehyung","marte","parkkihyuk","parkkyungsoo",
            "댄블랙","하준호","장성우","김상현","김사연","이대형","마르테","박기혁","박경수"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_player);

        final AutoCompleteTextView edit = (AutoCompleteTextView) findViewById(R.id.edit);

        Button del=(Button)findViewById(R.id.delete_button);

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.setText("");
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit.showDropDown();

            }
        });

        edit.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, items));

        edit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Play_Song.name = edit.getText().toString();
                startActivity(new Intent(Search_Player.this, Play_Song.class));

            }
        });

    }
}