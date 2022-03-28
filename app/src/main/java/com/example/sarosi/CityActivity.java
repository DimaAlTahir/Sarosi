package com.example.sarosi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CityActivity extends AppCompatActivity {

    public static final City [] cities = new City[]{
            new City("Larnaca", "Cyprus", "Medium", true),
            new City("Nicosia", "Cyprus", "Medium", false),
            new City("Limasol", "Cyprus", "Medium", false),
            new City("Paphos", "Cyprus", "Medium", false),
            new City("Los Angeles", "America", "Medium", false),
            new City("Larnaca10", "Cyprus", "Medium", false),
            new City("Nicosia10", "Cyprus", "Medium", false),
            new City("Limasol10", "Cyprus", "Medium", false),
            new City("Paphos10", "Cyprus", "Medium", false),
            new City("Los Angeles10", "America", "Medium", false),
            new City("Larnaca15", "Cyprus", "Medium", false),
            new City("Nicosia15", "Cyprus", "Medium", false),
            new City("Limasol15", "Cyprus", "Medium", false),
            new City("Paphos15", "Cyprus", "Medium", false),
            new City("Los Angeles15", "America", "Medium", false),
            new City("Larnaca20", "Cyprus", "Medium", false),
            new City("Nicosia20", "Cyprus", "Medium", false),
            new City("Limasol20", "Cyprus", "Medium", false),
            new City("Paphos20", "Cyprus", "Medium", false),
            new City("Los Angeles20", "America", "Medium", false),
            new City("Larnaca25", "Cyprus", "Medium", false),
            new City("Nicosia25", "Cyprus", "Medium", false),
            new City("Limasol25", "Cyprus", "Medium", false),
            new City("Paphos25", "Cyprus", "Medium", false),
            new City("Los Angeles25", "America", "Medium", false),
            new City("Larnaca30", "Cyprus", "Medium", false),
            new City("Nicosia30", "Cyprus", "Medium", false),
            new City("Limasol30", "Cyprus", "Medium", false),
            new City("Paphos30", "Cyprus", "Medium", false),
            new City("Los Angeles30", "America", "Medium", false)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        ListView citiesListView = findViewById(R.id.myListView);
        CityAdapter cityAdapter = new CityAdapter( this , cities);
        citiesListView.setAdapter(cityAdapter);
        citiesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final City selected = cities[position];
                Toast.makeText(CityActivity.this , selected.getName(),
                        Toast.LENGTH_SHORT).show();
                }
            });
    }

    @Override
    protected void onResume(){
        super.onResume();
        Intent intent = getIntent();

    }
}
