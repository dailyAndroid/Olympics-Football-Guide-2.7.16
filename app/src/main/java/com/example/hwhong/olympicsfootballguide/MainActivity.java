package com.example.hwhong.olympicsfootballguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] countries = {"South Korea", "Fiji", "Germany", "Mexico",
            "Argentina", "Brazil", "Japan", "Portugal", "Sweden"};
    String[] nextGame = {"8/4/16", "8/4/16", "8/4/16", "8/4/16",
            "8/4/16", "8/4/16", "8/4/16", "8/4/16", "8/4/16"};
    int[] images = {R.drawable.korea, R.drawable.fiji, R.drawable.germany, R.drawable.mexico,
            R.drawable.argentina, R.drawable.brazil, R.drawable.japan,
            R.drawable.portugal, R.drawable.sweden};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        Adapter adapter = new Adapter(this, countries, nextGame, images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int i, long l) {
                Toast.makeText(getApplicationContext(),
                        countries[i]+" is playing on " + nextGame[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
