package com.kodilla.good.patterns.Flights;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.getFlight().entrySet().stream().forEach(System.out::println);
    }
}
