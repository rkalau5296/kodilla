package com.kodilla.good.patterns.Flights;

import java.util.*;
import java.util.stream.Collectors;

public class Flight {
    private String flightFrom;
    private String flightTo;
    private List<Flight> flightlist = new ArrayList<>();

    public Flight(String flightFrom, String getFlightTo) {
        this.flightFrom = flightFrom;
        this.flightTo = getFlightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getFlightTo() {
        return flightTo;
    }

    @Override
    public String toString() {
        return "" + flightFrom +
                "-" + flightTo;
    }
    public static List<Flight> createFlightList() {
        List<Flight> flightslist = new ArrayList<>();

        flightslist.add(new Flight("Warszawa", "Kraków"));
        flightslist.add(new Flight("Warszawa", "Opole"));
        flightslist.add(new Flight("Kraków", "Gdańsk"));
        flightslist.add(new Flight("Gdańsk", "Wrocław"));
        flightslist.add(new Flight("Gdańsk", "Katowice"));
        flightslist.add(new Flight("Kraków", "Szczecin"));
        flightslist.add(new Flight("Katowice", "Warszawa"));
        flightslist.add(new Flight("Katowice", "Kraków"));
        flightslist.add(new Flight("Warszawa", "Poznań"));
        flightslist.add(new Flight("Radom", "Szczecin"));

        return flightslist;
    }
    public static void findFlightsFrom (String city, List<Flight> flightsList) {
        System.out.println(flightsList.stream()
                .filter(s->s.getFlightFrom().equals(city))
                .collect(Collectors.toList()));
    }
    public static void findFlightsTo (String city, List<Flight> flightsList) {
        System.out.println(flightsList.stream()
                .filter(s->s.getFlightTo().equals(city))
                .collect(Collectors.toList()));
    }
    public static void findConnectingFlights (String cityFrom, String cityTo, List<Flight> flightsList) {
        List<Flight> flightsTo = flightsList.stream()
                .filter(s->s.getFlightTo().equals(cityTo))
                .collect(Collectors.toList());
        List<Flight> flightsFrom = flightsList.stream()
                .filter(s->s.getFlightFrom().equals(cityFrom))
                .collect(Collectors.toList());
        List<Flight> newList = new ArrayList<>();
        newList.addAll(flightsTo);
        newList.addAll(flightsFrom);
        newList.stream().forEach(System.out::println);
        
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightFrom, flight.flightFrom) &&
                Objects.equals(flightTo, flight.flightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, flightTo);
    }
}
