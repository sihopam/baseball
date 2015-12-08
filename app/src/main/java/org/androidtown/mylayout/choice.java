package org.androidtown.mylayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

;

/**
 * Created by hhe on 2015-11-24.
 */
public class choice extends AppCompatActivity{

    private Back_Key back_handler;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        startActivity(new Intent(this, Splash.class));

        ImageButton choice1 = (ImageButton) findViewById(R.id.choice1);
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(choice.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        ImageButton choice2 = (ImageButton) findViewById(R.id.choice2);
        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(choice.this, Search_Player.class);
                startActivity(intent2);
            }
        });
        ImageButton choice3 = (ImageButton) findViewById(R.id.choice3);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(choice.this, stadium_map.class);
                startActivity(intent3);
            }
        });

        back_handler=new Back_Key(this);

    }
    public void onBackPressed(){
        back_handler.onBackPressed();
    }
}
