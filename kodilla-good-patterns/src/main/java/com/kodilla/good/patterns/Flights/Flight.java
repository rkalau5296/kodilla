package com.kodilla.good.patterns.Flights;

import java.util.Objects;

public class Flight {
    private String flightFrom;
    private String getFlightTo;

    public Flight(String flightFrom, String getFlightTo) {
        this.flightFrom = flightFrom;
        this.getFlightTo = getFlightTo;
    }

    public String getFlightFrom() {
        return flightFrom;
    }

    public String getGetFlightTo() {
        return getFlightTo;
    }

    @Override
    public String toString() {
        return " is connecting: " + flightFrom +
                "-" + getFlightTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(flightFrom, flight.flightFrom) &&
                Objects.equals(getFlightTo, flight.getFlightTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightFrom, getFlightTo);
    }

//    public Map<String, Map<String, String>> getFlight() {
//
//
//    }


}
