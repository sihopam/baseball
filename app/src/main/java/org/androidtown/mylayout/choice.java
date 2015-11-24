package org.androidtown.mylayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by hhe on 2015-11-24.
 */
public class choice extends AppCompatActivity{
    private ListView listView;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> adapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);

        arrayList = new ArrayList<String>();
        arrayList.add("Select Team");
        arrayList.add("Search Player");
        arrayList.add("Map of Stadium");
    }
}
