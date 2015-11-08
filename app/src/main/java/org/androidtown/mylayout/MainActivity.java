package org.androidtown.mylayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, Splash.class));


        ImageButton button1 = (ImageButton) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, team1.class);
                startActivity(intent1);
            }
        });
        ImageButton button2 = (ImageButton) findViewById(R.id.button2);
                button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
            Intent intent2 = new Intent(MainActivity.this, team2.class);
            startActivity(intent2);
            }
        });
       ImageButton button3 = (ImageButton) findViewById(R.id.button3);
        //Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent3 = new Intent(MainActivity.this, team3.class);
                startActivity(intent3);
            }
        });
        ImageButton button4 = (ImageButton) findViewById(R.id.button4);
        //Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent4 = new Intent(MainActivity.this, team4.class);
                startActivity(intent4);

            }
        });
        ImageButton button5 = (ImageButton) findViewById(R.id.button5);
        //Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent5 = new Intent(MainActivity.this, team5.class);
                startActivity(intent5);

            }
        });
        ImageButton button6 = (ImageButton) findViewById(R.id.button6);
       // Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent6 = new Intent(MainActivity.this, team6.class);
                startActivity(intent6);
                overridePendingTransition(R.anim.fade, R.anim.cycle_7);

            }
        });
        ImageButton button7 = (ImageButton) findViewById(R.id.button7);
       // Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent7 = new Intent(MainActivity.this, team7.class);
                startActivity(intent7);

            }
        });
        ImageButton button8 = (ImageButton) findViewById(R.id.button8);
        //Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent8 = new Intent(MainActivity.this, team8.class);
                startActivity(intent8);
            }
        });
        ImageButton button9 = (ImageButton) findViewById(R.id.button9);
       // Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent9 = new Intent(MainActivity.this, team9.class);
                startActivity(intent9);
            }
        });
        ImageButton button10 = (ImageButton) findViewById(R.id.button10);
        //Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){
                Intent intent10 = new Intent(MainActivity.this, team10.class);
                startActivity(intent10);
            }
        });


}





    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

