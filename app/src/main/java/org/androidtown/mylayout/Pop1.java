package org.androidtown.mylayout;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Administrator on 2015-11-27.
 */
public class Pop1 extends Activity{

    static public int pop_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(pop_num);

        switch(pop_num){
            case R.layout.pop_team1:
                TextView pop1=(TextView)findViewById(R.id.pop1);
                pop1.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%ED%95%9C%ED%99%94%EC%83%9D%EB%AA%85%EC%9D%B4%EA%B8%80%EC%8A%A4%ED%8C%8C%ED%81%AC&pinType=site&pinId=11831114&mapMode=0\">구장 위치</a>"));
                pop1.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team2:
                TextView pop2=(TextView)findViewById(R.id.pop2);
                pop2.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EA%B4%91%EC%A3%BC%EA%B8%B0%EC%95%84%EC%B1%94%ED%94%BC%EC%96%B8%EC%8A%A4%ED%95%84%EB%93%9C&pinType=site&pinId=19909618&mapMode=0\">구장 위치</a>"));
                pop2.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team3:
                TextView pop3=(TextView)findViewById(R.id.pop3);
                pop3.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EC%82%AC%EC%A7%81%EC%95%BC%EA%B5%AC%EC%9E%A5&pinType=site&pinId=13202715&mapMode=0\">구장 위치</a>"));
                pop3.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team4:
                TextView pop4=(TextView)findViewById(R.id.pop4);
                pop4.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EB%8C%80%EA%B5%AC%EC%8B%9C%EB%AF%BC%EC%9A%B4%EB%8F%99%EC%9E%A5%EC%95%BC%EA%B5%AC%EC%9E%A5&pinType=site&pinId=13549337&mapMode=0\">구장 위치</a>"));
                pop4.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team5:
                TextView pop5=(TextView)findViewById(R.id.pop5);
                pop5.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EC%9E%A0%EC%8B%A4%EC%95%BC%EA%B5%AC%EC%9E%A5&pinType=site&pinId=13202577&mapMode=0\">구장 위치</a>"));
                pop5.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team6:
                TextView pop6=(TextView)findViewById(R.id.pop6);
                pop6.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EB%A7%88%EC%82%B0%EC%95%BC%EA%B5%AC%EC%9E%A5&pinType=site&pinId=13119122&mapMode=0\">구장 위치</a>"));
                pop6.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team7:
                TextView pop7=(TextView)findViewById(R.id.pop7);
                pop7.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EC%9D%B8%EC%B2%9C%20SK%ED%96%89%EB%B3%B5%EB%93%9C%EB%A6%BC%EA%B5%AC%EC%9E%A5&pinType=site&pinId=13202558&mapMode=0\">구장 위치</a>"));
                pop7.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team8:
                TextView pop8=(TextView)findViewById(R.id.pop8);
                pop8.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EB%AA%A9%EB%8F%99%EC%95%BC%EA%B5%AC%EC%9E%A5&pinType=site&pinId=13094616&mapMode=0\">구장 위치</a>"));
                pop8.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team9:
                TextView pop9=(TextView)findViewById(R.id.pop9);
                pop9.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EC%9E%A0%EC%8B%A4%EC%95%BC%EA%B5%AC%EC%9E%A5&pinType=site&pinId=13202577&mapMode=0\">구장 위치</a>"));
                pop9.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            case R.layout.pop_team10:
                TextView pop10=(TextView)findViewById(R.id.pop10);
                pop10.setText(Html.fromHtml("<a href=\"http://map.naver.com/index.nhn?pinTitle=%EC%88%98%EC%9B%90kt%EC%9C%84%EC%A6%88%ED%8C%8C%ED%81%AC&pinType=site&pinId=13491582&mapMode=0\">구장 위치</a>"));
                pop10.setMovementMethod(LinkMovementMethod.getInstance());
                break;
            default:
                break;

        }

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .6));
    }
}
