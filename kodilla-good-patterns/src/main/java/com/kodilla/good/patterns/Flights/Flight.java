package com.kodilla.good.patterns.Flights;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    public Map<String, List<String>> getFlight() {

        List<String> City = new ArrayList<>();
        City.add("Kraków");
        City.add("Gdańsk");
        City.add("Warszawa");
        City.add("lódź");
        City.add("Szczecin");
        City.add("Poznań");
        City.add("Wrocław");
        City.add("Katowice");

        List<String> CityStopOver = new ArrayList<>();
        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();


        return booksTitlesWithTranslations;
    }
}
