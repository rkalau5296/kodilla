package com.kodilla.good.patterns.Flights;

import java.util.HashMap;
import java.util.Map;

public class FlightList {
    private Map<String, Flight> flights = new HashMap<>();
    private String connectingFlight;

    public FlightList(String connectingFlight) {
        this.connectingFlight = connectingFlight;
    }

    public Map<String, Flight> getFlights() {
        return flights;
    }

    public String getConnectingFlight() {
        return connectingFlight;
    }
    public void addFlightToList (String connectingFlight, Flight flight) {
        flights.put(connectingFlight, flight);
    }
}
