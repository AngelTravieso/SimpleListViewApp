package com.librepago.simplelistviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // 1. AdapterView
    ListView listView;

    // 2. Origen de datos (data source)
    String[] worldCup22 = {
            "Germany",
            "Spain",
            "Brazil",
            "England",
            "USA",
            "Saudi Arabia",
            "Qatar",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R .layout.activity_main);

        // inicializar widget
        listView = findViewById(R.id.listView);

        // 3. Adapter <Type>
        ArrayAdapter adapter = new ArrayAdapter(
            this,
                android.R.layout.simple_list_item_1,
                worldCup22
        );

        // Set adapter
        listView.setAdapter(adapter);

    }
}