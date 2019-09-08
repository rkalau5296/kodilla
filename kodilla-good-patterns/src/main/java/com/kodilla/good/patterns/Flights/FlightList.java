package com.kodilla.good.patterns.Flights;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FlightList {
    private Map<String, Flight> flights = new HashMap<>();
    private String connectingFlight;

    public Map<String, Flight> getFlights() {
        return flights;
    }

    public String getConnectingFlight() {
        return connectingFlight;
    }
    public void addFlightToList (String connectingFlight, Flight flight) {
        flights.put(connectingFlight, flight);
    }

    public Map<String, Flight> createFlightList() {

        Map<String, Flight> connectingFlightsList = new HashMap<>();
        connectingFlightsList.put("Radom", new Flight("Kraków", "Poznań"));
        connectingFlightsList.put("Warszawa", new Flight("lódź", "Szczecin"));
        connectingFlightsList.put("Olsztyn", new Flight("Poznań", "lódź"));
        connectingFlightsList.put("Tarnów", new Flight("Szczecin", "Katowice"));
        connectingFlightsList.put("Nowy Sącz", new Flight("Olsztyn", "Opole"));
        connectingFlightsList.put("Gdansk", new Flight("Katowice", "Radom"));

        return connectingFlightsList;
    }
    public void displayFlightList(FlightList flightList) {
        flightList.createFlightList().entrySet().stream().forEach(System.out::println);
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
