package com.kodilla.good.patterns.Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public void findFlightsFrom (String city, List<Flight> flightsList) {
        System.out.println(flightsList.stream().filter(s->s.getFlightFrom().equals(city)).collect(Collectors.toList()));
    }
    public void findFlightsTo (String city, List<Flight> flightsList) {
        System.out.println(flightsList.stream().filter(s->s.getFlightTo().equals(city)).collect(Collectors.toList()));
    }
}
