package com.example.sarosi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class CityAdapter extends ArrayAdapter<City> {

    public CityAdapter(@NonNull Context context, @NonNull City[] objects) {
        super(context, R.layout.item_city, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        
        if (view == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(getContext());
            view = layoutInflater.inflate(R.layout.item_city, parent, false);
        }

        final City city = getItem(position); // access the selected item

        // access the UI elements from the layout
        CheckBox favoriteCheckBox = view.findViewById(R.id.fav);
        TextView cityTextView = view.findViewById(R.id.name);
        TextView countryTextView = view.findViewById(R.id.country);
        TextView aqTextView = view.findViewById(R.id.aq);
        
        // initialize the UI elements
        favoriteCheckBox.setChecked(city.isFav());
        cityTextView.setText(city.getName());
        countryTextView.setText(city.getCountry());
        aqTextView.setText(city.getaq());
        
        // we can even set a listener to any of the UI elements
        favoriteCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton button, boolean isChecked) {
                Toast.makeText(getContext(), city.getName() + ": " + isChecked,
                        Toast.LENGTH_SHORT).show();
                }
            });
        return view;
    }

}
