package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        Country polska = new Country("Polska", new BigDecimal("123412341234123"));
        Continent europa = new Continent("Europa");
        europa.addCountry(polska);
        World world = new World();
        world.addContinent(europa);
    }
}
