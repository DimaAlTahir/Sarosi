package com.example.sarosi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Vector;

public class CountryList extends AppCompatActivity {

    private final Vector<Countries> countries = new Vector<>();
    //private final Vector countries = new Vector();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.country_list);

        ListView countriesListView = findViewById(R.id.countryListView);
        //citiesListView.setOnClickListener((adapterView, view, i, l) -> selectCountry(countries.get(i)));
        ArrayAdapter<Countries> countriesArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);
        //ArrayAdapter countriesArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);
        countriesListView.setAdapter(countriesArrayAdapter);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Intent intent = getIntent();
/*
        for(int i=0; i<31;i++){
            //countries.add(new Cities(fill l8r));
            countries.add(new Countries("success", Countries [i]));
        }*/

    }

    /*void selectCities( Cities city){
        Toast.makeText(this, "selected city" + city, Toast.LENGTH_SHORT).show();
        Intent citryIntent = new Intent(this, ViewCityInformation.class);
        citryIntent.putExtra("City", )
        startActivity(citryIntent);
    } */
}
