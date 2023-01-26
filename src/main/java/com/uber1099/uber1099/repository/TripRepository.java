package com.uber1099.uber1099.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uber1099.uber1099.pojo.Trip;

@Repository
public class TripRepository {

    private ArrayList<Trip> trips = new ArrayList<>();

    public List getTrips(){
        return trips;
    }
    
}
