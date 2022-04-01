package com.example.sarosi;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.view.GravityCompat;
        import androidx.drawerlayout.widget.DrawerLayout;
        import androidx.navigation.NavController;
        import androidx.navigation.Navigation;
        import androidx.navigation.fragment.NavHostFragment;
        import androidx.navigation.ui.AppBarConfiguration;
        import androidx.navigation.ui.NavigationUI;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.google.android.material.bottomnavigation.BottomNavigationView;
        import com.google.android.material.navigation.NavigationView;
        import com.google.android.material.snackbar.Snackbar;
        import com.google.android.material.tabs.TabItem;

public class MainActivity extends AppCompatActivity {

    private Button city_list_btn;
    private Button add_location_btn; //move to add a new location screen/activity
    private Button record_observation_btn; //move to record observation screen/activity
    private Button observations_list_btn; //move to view observations screen/activity

    //private TabItem record_observation_btn;

    Snackbar mySnackbar;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrawerLayout drawerLayout = findViewById(R.id.drawerLayout);
        findViewById(R.id.imageMenu).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });


        /*NavigationView navigationView = findViewById(R.id.navView);
        //navigationView.setItemIconTintList(null);
        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupActionBarWithNavController(this, navController);
        NavigationUI.setupWithNavController(navigationView, navController);*/


        message = "cant resolve activity";
        city_list_btn = findViewById(R.id.startCityActivity);
        record_observation_btn = findViewById(R.id.record_observations);
        observations_list_btn = findViewById(R.id.view_observations);


        /*NavHostFragment navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
        NavigationUI.setupWithNavController(bottomNav, navController);

        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(navController.getGraph()).build();*/

       /* record_observation_btn = findViewById(R.id.menuRecordObservations);
       /
        */

        record_observation_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRecordObservation();
            }
        });

        observations_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startViewObservation();}
        });

        city_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCityActivity();
            }
        });
    }


    //open record observation activity when button is clicked
    void startRecordObservation(){
        Intent recordObservationIntent = new Intent(this, WriteObservation.class);
        startActivity(recordObservationIntent);
    }

    //open list of countries activity when button is clicked
    void startCityActivity(){
        Intent cityListIntent = new Intent(this, CityActivity.class);
        startActivity(cityListIntent);
    }

    //open list of countries activity when button is clicked
    void startCountryList(){
        Intent countryListIntent = new Intent(this, CountryList.class);
        startActivity(countryListIntent);
    }


    //open record observation activity when button is clicked
    void startViewObservation(){
        Intent viewObsIntent = new Intent(this, ViewObservations.class);
        startActivity(viewObsIntent);
    }
}