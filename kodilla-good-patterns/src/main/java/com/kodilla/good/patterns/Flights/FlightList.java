package com.kodilla.good.patterns.Flights;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightList that = (FlightList) o;
        return Objects.equals(flights, that.flights) &&
                Objects.equals(connectingFlight, that.connectingFlight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flights, connectingFlight);
    }

    @Override
    public String toString() {
        return "FlightList{" +
                "flights=" + flights +
                ", connectingFlight='" + connectingFlight + '\'' +
                '}';
    }
}
