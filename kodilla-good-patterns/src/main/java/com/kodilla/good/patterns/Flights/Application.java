package com.kodilla.good.patterns.Flights;

public class Application {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        FlightList flightList = new FlightList();

        flightService.findFlightsFrom("Warszawa", flightList.createFlightList());
        flightService.findFlightsTo("Warszawa", flightList.createFlightList());
        flightService.findConnectingFlights("Warszawa", "Szczecin", "Kraków", flightList.createFlightList());
    }
}
