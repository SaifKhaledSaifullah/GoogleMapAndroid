package com.saif.playwithmaps;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] demoArrey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        demoArrey = new String[]{"Simple Map With Marker"
                , "Map With Draggable Marker"
                , "Map With Sticky Marker", "Get My Current Location"
                , "PollyLines and Pollygones"
                , "Show Map With Current Location"};
        listView = findViewById(R.id.demoList);
        ArrayAdapter<String> demoAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, demoArrey);
        listView.setAdapter(demoAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(MainActivity.this, SimpleMapActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MainActivity.this, MapWithDraggableMarker.class));
                        break;
                    case 2:
                        startActivity(new Intent(MainActivity.this, MapWithStickyMarker.class));
                        break;
                    case 3:
                        startActivity(new Intent(MainActivity.this, GetCurrentLocation.class));
                        break;
                    case 4:
                        startActivity(new Intent(MainActivity.this, PolyActivity.class));
                    case 5:
                        startActivity(new Intent(MainActivity.this, ShowMapOnCurrentLocationActivity.class));
                }
            }
        });

    }
}
