package com.example.eva2_5_bundles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[]datos={
            "Chihuahua",
            "Parral",
            "Delicias",
            "Ju'arez",
            "Camargo",
            "Jimenez",
            "Casas grandes",
            "Durango",
            "Hermosillo",
            "Obregon",
            "Mexicali",
            "Nogales",
            "SSaltillo",
            "Torreon",
            "Piedras negras",
            "Monterrey",
            "Acuña",
            "Guanajuato",
            "Ciudad Victoria"


    };
ListView lstVwDatos;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lxtVwDatos = findViewById (R.id.lxtVwDatos);
        lxtVwDatos.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,datos ));
        intent = new Intent(this, )
        lstVwDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             Bundle bundle = new Bundle();
                bundle.putString("Ciudad", datos[i]);
                intent.putExtras(bundle);
            startActivities(intent);
            }
        });


    }
}