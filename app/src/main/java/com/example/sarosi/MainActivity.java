package com.example.sarosi;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button location_list_btn; //move to view favorite location screen/activity
    private Button add_location_btn; //move to add a new location screen/activity
    private Button record_observation_btn; //move to record observation screen/activity
    private Button observations_list_btn; //move to view observations screen/activity

    Snackbar mySnackbar;
    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        message = "cant resolve activity";
        location_list_btn = findViewById(R.id.location);
        observations_list_btn = findViewById(R.id.observations);
        record_observation_btn = findViewById(R.id.record_observations);
        observations_list_btn = findViewById(R.id.view_observations);

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

        location_list_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startCountryList();
            }
        });
    }

    //open list of countries activity when button is clicked
    void startCountryList(){
        Intent countryListIntent = new Intent(this, CountryList.class);
        startActivity(countryListIntent);
    }

    //open record observation activity when button is clicked
    void startRecordObservation(){
        Intent recordObservationIntent = new Intent(this, WriteObservation.class);
        startActivity(recordObservationIntent);
    }

    //open record observation activity when button is clicked
    void startViewObservation(){
        Intent viewObsIntent = new Intent(this, ViewObservations.class);
        startActivity(viewObsIntent);
    }
}