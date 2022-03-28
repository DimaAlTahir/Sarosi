//package com.example.sarosi;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.android.volley.RequestQueue;
//import com.android.volley.toolbox.Volley;
//
//import java.util.Vector;
//
//public class CityList extends AppCompatActivity {
//    private final Vector <City> City = new Vector<>();
//
//    // Volley queue used to make HTTP requests
//    private RequestQueue requestQueue;
//
//    // The DAO used to access the Room database
//    private AppDao appDao;
//
//    private ArrayAdapter<City> CityArrayAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.city_list);
//
//        // set the title and add the 'back' button in the action bar
//        setTitle("Select city");
//        assert getSupportActionBar() != null;
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        // init the Volley request queue
//        this.requestQueue = Volley.newRequestQueue(this);
//        // init the DAO
//        this.appDao = AppDatabase.getDatabase(this).appDao();
//
//        final ListView CityListView = findViewById(R.id.cityListView);
//        CityListView.setOnClickListener((adapterView, view, i, l) -> selectCity(City.get(i)));
//
//        CityArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, City);
//        CityListView.setAdapter(CityArrayAdapter);
//    }
//
//    /**
//     * This is required to realize the 'back' button functionality in the action bar.
//     * @return true as the action completes successfully
//     */
//    @Override
//    public boolean onSupportNavigateUp() {
//        finish();
//        return true;
//    }
//
//    @Override
//    protected void onResume(){
//        super.onResume();
//        Intent intent = getIntent();
//
//        fetch(); // initiates a 'fetch' when the activity is displayed
//        /*
//        for(int i=0; i<31;i++){
//            //countries.add(new City(//fill l8r));
//            City.add(i);
//        }*/
//
//
//    }
//
//    //open City when clicked
//    void selectCity( final City city){
//        Intent intent = new Intent(this, City.class);
//        intent.putExtra("cityId", City.getId());
//        intent.putExtra("albumTitle", album.getTitle());
//        startActivity(intent);
//    }
//}
