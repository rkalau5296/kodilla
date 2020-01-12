package com.kodilla.exception.test;

import java.util.HashMap;

public class LogicFlight {
    HashMap<String, Boolean> availableAirports;

    public LogicFlight(HashMap<String, Boolean> availableAirports) {
        this.availableAirports = availableAirports;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if (availableAirports.containsKey(flight.getArrivalAirport())) {
            if (availableAirports.get(flight.getArrivalAirport())) {
                System.out.println("Flight found: This airport is avalible from your departure place");
            } else System.out.println("Sorry! Arrival airport is not avalible from your departure place");
        } else {
            throw new RouteNotFoundException();
        }
    }

}

