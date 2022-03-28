package com.example.sarosi;

//POJO

import java.io.Serializable;

public class City implements Serializable { //class containing the keys of City from

    private String name;
    private String country;
    private String aq;
    private boolean fav;
    public City(String name, String country, String aq, boolean fav){
        this.name = name;
        this.country = country;
        this.aq = aq;
        this.fav = fav;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getaq() {
        return aq;
    }

    public boolean isFav() {
        return fav;
    }

    @Override
    public String toString(){
        return name;
    }


}


/*{
        "aq": "success",
        "data": {
        "city": "Preston",
        "state": "England",
        "country": "United Kingdom",
        "location": {
        "type": "Point",
        "coordinates": [ -2.680353, 53.76559 ]
        },
        "current": {
        "weather": {
        "ts": "2021-09-09T07:00:00.000Z",
        "tp": 18,
        "pr": 1004,
        "hu": 38,
        "ws": 1.72,
        "wd": 152,
        "ic": "10d"
        },
        "pollution": {
        "ts": "2021-09-09T09:00:00.000Z",
        "aqius": 91,
        "mainus": "p2",
        "aqicn": 48,
        "maincn": "p1"
        }
        }
        }
}*/
