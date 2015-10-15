package org.androidtown.mylayout;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015-10-01.
 */
public class team3 extends AppCompatActivity {

    ListView listview;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team3);

        listview = (ListView) this.findViewById(R.id.listview);

        ArrayList<String> items = new ArrayList<>();
        items.add("강민호");
        items.add("황재균");
        items.add("손아섭");
        items.add("아두치");

        adapter = new CustomAdapter(this, 0, items);
        listview.setAdapter(adapter);
    }

        private class CustomAdapter extends ArrayAdapter<String> {
            private ArrayList<String> items;

            public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
                super(context, textViewResourceId, objects);
                this.items = objects;
            }

            public View getView(int position, View convertView, ViewGroup parent) {
                View v = convertView;
                if (v == null) {
                    LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                    v = vi.inflate(R.layout.list1, null);
                }

                ImageView player = (ImageView) v.findViewById(R.id.player);

                if ("강민호".equals(items.get(position)))
                    player.setImageResource(R.drawable.kangminho);
                else if ("황재균".equals(items.get(position)))
                    player.setImageResource(R.drawable.jaegyun);
                else if ("손아섭".equals(items.get(position)))
                    player.setImageResource(R.drawable.asup);
                else if ("아두치".equals(items.get(position)))
                    player.setImageResource(R.drawable.aduchi);

                TextView player_name = (TextView) v.findViewById(R.id.player_name);
                player_name.setText(items.get(position));

                final String text = items.get(position);
                Button play_button = (Button) v.findViewById(R.id.play_button);
                play_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(team3.this, text, Toast.LENGTH_SHORT).show();
                    }
                });

                return v;
            }

    }

}
