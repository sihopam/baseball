package org.androidtown.mylayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

;

/**
 * Created by hhe on 2015-11-24.
 */
public class choice extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        startActivity(new Intent(this, Splash.class));

        Button choice1 = (Button) findViewById(R.id.choice1);
        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(choice.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        Button choice3 = (Button) findViewById(R.id.choice3);
        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(choice.this, stadium_map.class);
                startActivity(intent3);
            }
        });

    }
}
