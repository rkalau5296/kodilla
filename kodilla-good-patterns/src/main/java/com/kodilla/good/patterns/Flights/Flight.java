package com.kodilla.good.patterns.Flights;

import java.util.*;

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
