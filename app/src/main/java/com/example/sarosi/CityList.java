package com.example.sarosi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Vector;

public class CityList extends AppCompatActivity {
    private final Vector cities = new Vector();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_list);

        ListView citiesListView = findViewById(R.id.cityListView);
        //citiesListView.setOnClickListener((adapterView, view, i, l) -> selectCountry(countries.get(i)));
        ArrayAdapter citiesArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cities);
        citiesListView.setAdapter(citiesArrayAdapter);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Intent intent = getIntent();

        for(int i=0; i<31;i++){
            //countries.add(new Cities(/*fill l8r*/));
            cities.add(i);
        }

    }

    /*//open cities when clicked
    void selectCities( Cities city){
        Toast.makeText(this, "selected city" + city, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, WriteObservation.class);
        startActivity(intent);
    }*/
}
