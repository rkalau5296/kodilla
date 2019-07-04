package com.kodilla.exception.test;

import java.util.HashMap;

public class LogicFlight {
    public void findFilght(Flight flight){
        HashMap<String, Boolean> availableAirports = new HashMap<>();
        availableAirports.put("Okecie", true);
        availableAirports.put("Modlin", false);
        availableAirports.put("Heatrow", true);
        availableAirports.put("Gatwick", false);
        availableAirports.put("JFK", true);

    }
}
