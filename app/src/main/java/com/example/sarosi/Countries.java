package com.example.sarosi;

import androidx.annotation.NonNull;

import java.lang.reflect.Array;

//pojo - immutable
public class Countries {
    private final String status;
    Country [] data = {};

    public Countries(String status, Country[] data, String country){
        this.status = status;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    @NonNull
    @Override
    public String toString(){
        return status;
    }
}

class Country{
    public void main(String[] args){
        Country countryKey = new Country();
        Countries [] countryData = {};
    }
}

/*{
        "status": "success",
        "data": [
        {
        "country": "Afghanistan"
        },
        {
        "country": "Algeria"
        },
        ...
        {
        "country": "United Kingdom"
        },
        {
        "country": "Uzbekistan"
        },
        {
        "country": "Vietnam"
        },
        {
        "country": "Yemen"
        }
        ]
}*/
