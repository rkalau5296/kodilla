package com.kodilla.good.patterns.Flights;

public class Main {
    public static void main(String[] args) {

//        Flight.findFlightsFrom("Warszawa", Flight.createFlightList());
//        Flight.findFlightsTo("Warszawa", Flight.createFlightList());
        Flight.findConnectingFlights("Warszawa", "Gdańsk", Flight.createFlightList());
    }
}

