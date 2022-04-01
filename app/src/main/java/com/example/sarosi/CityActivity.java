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
            new City("New York", "America", "Medium", false),
            new City("Austin", "America", "Medium", false),
            new City("San Francisco", "America", "Medium", false),
            new City("Seattle", "America", "Medium", false),
            new City("Boston", "America", "Medium", false),
            new City("Denver", "America", "Medium", false),
            new City("Nashville", "America", "Medium", false),
            new City("Hatta", "Dubai", "Medium", false),
            new City("Kyrenia", "Cyprus", "Medium", false),
            new City("Jebel Ali", "Dubai", "Medium", false),
            new City("Agros", "Cyprus", "Medium", false),
            new City("Pera", "Cyprus", "Medium", false),
            new City("Khorfakkan", "Dubai", "Medium", false),
            new City("Berlin", "German", "Medium", false),
            new City("Hamburg", "German", "Medium", false),
            new City("Munich", "German", "Medium", false),
            new City("Stuttgart", "German", "Medium", false),
            new City("Dortmund", "German", "Medium", false),
            new City("Bremen", "German", "Medium", false),
            new City("Andalusia", "Spain", "Medium", false),
            new City("Galicia", "Spain", "Medium", false),
            new City("Madrid", "Spain", "Medium", false),
            new City("La Rioja", "Spain", "Medium", false),
            new City("Melilla", "Spain", "Medium", false),
            new City("Murcia", "Spain", "Medium", false)
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        ListView citiesListView = findViewById(R.id.cityListView);
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
