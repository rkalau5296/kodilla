package com.kodilla.exception.test;

import java.util.HashMap;

public class LogicFlightRunner {
    public static void main(String[] args) {

        Flight flight1 = new Flight("Okecie", "Gatwick");
        Flight flight2 = new Flight("Heatrow", "Modlin");
        Flight flight3 = new Flight("Lodz", "Szczecin");
        Flight flight4 = new Flight("Gdansk", "JFK");
        Flight flight5 = new Flight("Radom", "Newark");

        HashMap<String, Boolean> availableAirports = new HashMap<String, Boolean>();

        availableAirports.put(flight1.getArrivalAirport(), true);
        availableAirports.put(flight2.getArrivalAirport(), true);
        availableAirports.put(flight3.getArrivalAirport(), true);
        availableAirports.put(flight4.getArrivalAirport(), true);
        availableAirports.put(flight5.getArrivalAirport(), true);

        LogicFlight logicFlight = new LogicFlight(availableAirports);

        try {
            logicFlight.findFlight(flight1);
        }catch (RouteNotFoundException e){

        }
    }
}
