package org.androidtown.mylayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

/**
 * Created by hhe on 2015-12-01.
 */
public class Search_Player extends Activity{
    String[] items = {"himenes","leebyunggyu","leejinyoung","ohjihwan","parkjigyu","parkyongtak","seosangwoo","yangsukhwan","yoogangnam",
            "히메네스","이병규","이진영","오지환","박지규","박용택","서상우","양석환","유강남"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_player);

        final AutoCompleteTextView edit = (AutoCompleteTextView) findViewById(R.id.edit);

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
/*
edit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Play_Song.name = edit.getText().toString();
                startActivity(new Intent(Search_Player.this, Play_Song.class));

            }
        });
 */