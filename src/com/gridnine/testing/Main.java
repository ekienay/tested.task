package com.gridnine.testing;

import java.util.List;



public class Main {
    public static void main(String[] args) {

        List<Flight> flightList = FlightBuilder.createFlights();

        FlightFilter flightFilter = new FlightFilter();

        flightFilter.Filtered(flightList);

    }
}
