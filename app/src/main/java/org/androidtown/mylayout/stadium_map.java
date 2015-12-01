package org.androidtown.mylayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by hhe on 2015-11-26.
 */

public class stadium_map extends AppCompatActivity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stadium_map);
        ImageButton map_team1 = (ImageButton) findViewById(R.id.map_team1);
                map_team1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Pop1.pop_num=R.layout.pop_team1;
                        startActivity(new Intent(stadium_map.this, Pop1.class));
                    }
                });

        ImageButton map_team2 = (ImageButton) findViewById(R.id.map_team2);
                map_team2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Pop1.pop_num=R.layout.pop_team2;
                        startActivity(new Intent(stadium_map.this, Pop1.class));
                    }
                });
        ImageButton map_team3 = (ImageButton) findViewById(R.id.map_team3);
        map_team3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team3;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });
        ImageButton map_team4 = (ImageButton) findViewById(R.id.map_team4);
        map_team4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team4;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });
        ImageButton map_team5 = (ImageButton) findViewById(R.id.map_team5);
        map_team5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team5;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });
        ImageButton map_team6 = (ImageButton) findViewById(R.id.map_team6);
        map_team6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team6;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });
        ImageButton map_team7 = (ImageButton) findViewById(R.id.map_team7);
        map_team7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team7;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });
        ImageButton map_team8 = (ImageButton) findViewById(R.id.map_team8);
        map_team8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team8;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });
        ImageButton map_team9 = (ImageButton) findViewById(R.id.map_team9);
        map_team9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team9;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });
        ImageButton map_team10 = (ImageButton) findViewById(R.id.map_team10);
        map_team10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pop1.pop_num=R.layout.pop_team10;
                startActivity(new Intent(stadium_map.this, Pop1.class));
            }
        });




    }
}
