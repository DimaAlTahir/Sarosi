package com.example.sarosi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Vector;

public class ViewObservations extends AppCompatActivity {
    private FloatingActionButton addBtn;

    private final Vector obs = new Vector();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_observations);

        ListView obsListView = findViewById(R.id.observationListView);
        ArrayAdapter obsArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, obs);
        obsListView.setAdapter(obsArrayAdapter);

        addBtn = findViewById(R.id.addObs);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startWriteObservation();
            }
        });



    }

    @Override
    protected void onResume(){
        super.onResume();
        Intent intent = getIntent();

        for(int i=0; i<31;i++){
            //countries.add(new Cities(/*fill l8r*/));
            obs.add(i);
        }

    }

    //go to write observation activity when button is pressed
    void startWriteObservation(){
        Intent addObsIntent = new Intent(this, WriteObservation.class);
        startActivity(addObsIntent);
    }



}
