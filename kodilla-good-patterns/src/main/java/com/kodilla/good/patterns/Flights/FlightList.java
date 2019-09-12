package com.kodilla.good.patterns.Flights;


import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public List<Flight> createFlightList() {
        List<Flight> flightsList = new ArrayList<>();

        flightsList.add(new Flight("Warszawa", "Kraków"));
        flightsList.add(new Flight("Warszawa", "Opole"));
        flightsList.add(new Flight("Kraków", "Gdańsk"));
        flightsList.add(new Flight("Gdańsk", "Wrocław"));
        flightsList.add(new Flight("Gdańsk", "Katowice"));
        flightsList.add(new Flight("Kraków", "Szczecin"));
        flightsList.add(new Flight("Katowice", "Warszawa"));
        flightsList.add(new Flight("Katowice", "Kraków"));
        flightsList.add(new Flight("Warszawa", "Poznań"));
        flightsList.add(new Flight("Radom", "Szczecin"));

        return flightsList;
    }
}
