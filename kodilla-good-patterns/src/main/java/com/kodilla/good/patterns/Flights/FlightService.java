package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public void findFlightsFrom(String city, List<Flight> flightsList) {
        System.out.println(flightsList.stream()
                .filter(s -> s.getFlightFrom().equals(city))
                .collect(Collectors.toList()));
    }

    public void findFlightsTo(String city, List<Flight> flightsList) {
        System.out.println(flightsList.stream()
                .filter(s -> s.getFlightTo().equals(city))
                .collect(Collectors.toList()));
    }

    public void findConnectingFlights(String cityFrom, String cityTo, String cityVia, List<Flight> flightsList) {
        List<Flight> flightsTo = flightsList.stream()
                .filter(s -> s.getFlightTo().equals(cityTo))
                .collect(Collectors.toList());
        List<Flight> flightsFrom = flightsList.stream()
                .filter(s -> s.getFlightFrom().equals(cityFrom))
                .collect(Collectors.toList());
        List<Flight> newList = new ArrayList<>();
        newList.addAll(flightsTo);
        newList.addAll(flightsFrom);
        newList.stream().filter(s -> s.getFlightFrom().equals(cityVia)).forEach(System.out::println);

    }
}
