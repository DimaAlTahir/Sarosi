package com.example.sarosi;

//POJO

import androidx.room.Entity;

@Entity(tableName ="cities")
public class Cities { //class containing the keys of cities from

    private final String status;
    private final Object data;
    private final Object current;

    private final class data{
        private final String city;
        private final String state;
        private final String country;
        private final Object location;

        private final class location{
            private final String type;
            private final Double coordinates;

            private location(String type, Double coordinates) {
                this.type = type;
                this.coordinates = coordinates;
            }
            public String getType() {return type;}
            public Double getCoordinates() {return coordinates;}
        }
        public data(String city, String state, String country, location location){
            this.city = city;
            this.state = state;
            this.country = country;
            this.location = location;
        }
        public Object getData() {return data;}
    }

    private final class current{
        private final Object weather;
        private final Object polution;

        public current(Object weather, Object polution){
            this.weather = weather;
            this.polution = polution;
        }
        public Object getWeather() {return weather;}
        public Object getPolution() {return polution;}

    }


    public Cities(String status, data data, current current){
        this.status = status;
        this.data = data;
        this.current = current;
    }
    public String getStatus() {return status;}
    public Object getData() {return data;}
    public Object getCurrent() {return current;}

}


/*{
        "status": "success",
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
