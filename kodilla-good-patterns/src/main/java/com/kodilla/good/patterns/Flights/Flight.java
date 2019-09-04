package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class Flight {
    public Map<String, String> getFlight() {

        Map<String, String> Flights = new HashMap<>();
        Flights.put("Kraków", "Poznań");
        Flights.put("Warszawa", "Poznań");
        Flights.put("lódź", "Szczecin");
        Flights.put("Poznań", "lódź");
        Flights.put("Szczecin", "Katowice");
        Flights.put("Olsztyn", "Opole");
        Flights.put("Katowice", "Radom");
        Flights.put("Radom", "Poznań");
        Flights.put("Kielce", "Bydgoszcz");
        Flights.put("Bydgoszcz", "Warszawa");
        Flights.put("Opole", "Kielce");

        return Flights;
    }
}
