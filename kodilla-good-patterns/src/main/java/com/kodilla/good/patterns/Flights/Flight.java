package com.kodilla.good.patterns.Flights;

import java.util.HashMap;

import java.util.Map;
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
        return "Flight{" +
                "flightFrom='" + flightFrom + '\'' +
                ", getFlightTo='" + getFlightTo + '\'' +
                '}';
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

    public Map<String, Map<String, String>> getFlight() {

        Map<String, String> directFlightsKrakowPoznan = new HashMap<>();
        directFlightsKrakowPoznan.put("Kraków", "Poznań");

        Map<String, String> directFlightsLodzSzczecin = new HashMap<>();
        directFlightsLodzSzczecin.put("lódź", "Szczecin");

        Map<String, String> directFlightsPoznanLodz = new HashMap<>();
        directFlightsPoznanLodz.put("Poznań", "lódź");

        Map<String, String> directFlightsSzczecinKatowice = new HashMap<>();
        directFlightsSzczecinKatowice.put("Szczecin", "Katowice");

        Map<String, String> directFlightsOlsztynOpole = new HashMap<>();
        directFlightsOlsztynOpole.put("Olsztyn", "Opole");

        Map<String, String> directFlightsKatowiceOlsztyn = new HashMap<>();
        directFlightsKatowiceOlsztyn.put("Katowice", "Radom");

        Map<String, Map<String, String>> connectingFlights = new HashMap<>();
        connectingFlights.put("Radom", directFlightsKrakowPoznan);
        connectingFlights.put("Warszawa", directFlightsLodzSzczecin);
        connectingFlights.put("Olsztyn", directFlightsPoznanLodz);
        connectingFlights.put("Tarnów", directFlightsSzczecinKatowice);
        connectingFlights.put("Nowy Sącz", directFlightsOlsztynOpole);
        connectingFlights.put("Gdansk", directFlightsKatowiceOlsztyn);

        return connectingFlights;
    }


}
