package com.example.sarosi;

import java.lang.reflect.Array;
import java.util.ArrayList;

//pojo - immutable object
//state class with state object and constructor
public class States {
    private final String status;
    //create an array of states object
   // ArrayList<States> data[] = new ArrayList<States>();
    //create & initialize actual state objects using constructor
    //data[0] = new State();

    public States(String status, String state, ArrayList data){
        this.status = status;
       // this.data = data;
    }




}

class State{
    private final String state;

    public State(String state){
        this.state = state;
    }
}

/*
{
        "status": "success",
        "data": [
        {
        "state": "England"
        },
        {
        "state": "Northern Ireland"
        },
        {
        "state": "Scotland"
        },
        {
        "state": "Wales"
        }
        ]
}*/
