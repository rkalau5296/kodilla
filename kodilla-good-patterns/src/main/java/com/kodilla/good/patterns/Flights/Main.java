package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Flight> flightslist = new ArrayList<>();

        flightslist.add(new Flight("Warszawa", "Kraków"));
        flightslist.add(new Flight("Warszawa", "Gdańsk"));
        flightslist.add(new Flight("Kraków", "Gdańsk"));
        flightslist.add(new Flight("Gdańsk", "Wrocław"));
        flightslist.add(new Flight("Gdańsk", "Katowice"));
        flightslist.add(new Flight("Kraków", "Szczecin"));
        flightslist.add(new Flight("Katowice", "Warszawa"));
        flightslist.add(new Flight("Katowice", "Kraków"));
        flightslist.add(new Flight("Warszawa", "Poznań"));
        flightslist.add(new Flight("Radom", "Szczecin"));

        FlightService flightService = new FlightService();
        flightService.findFlightsFrom("Warszawa", flightslist);
        flightService.findFlightsTo("Warszawa", flightslist);
    }
}
