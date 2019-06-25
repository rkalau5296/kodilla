package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given

        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Polska", new BigDecimal("23412341234")));
        Europe.addCountry(new Country("Niemcy", new BigDecimal("2141234413")));
        Europe.addCountry(new Country("Czechy", new BigDecimal("5253213412")));
        Europe.addCountry(new Country("Francja", new BigDecimal("54141241441")));

        Continent Asia = new Continent("Asia");
        Asia.addCountry(new Country("Russia", new BigDecimal("23412341234")));
        Asia.addCountry(new Country("China", new BigDecimal("2141234413")));
        Asia.addCountry(new Country("Japan", new BigDecimal("5253213412")));
        Asia.addCountry(new Country("Izrael", new BigDecimal("54141241441")));

        Continent SouthAmerica = new Continent("SouthAmerica");
        Asia.addCountry(new Country("Brasil", new BigDecimal("23412341234")));
        Asia.addCountry(new Country("Argentina", new BigDecimal("2141234413")));
        Asia.addCountry(new Country("Paraguay", new BigDecimal("5253213412")));
        Asia.addCountry(new Country("Peru", new BigDecimal("54141241441")));

        //When

        World world = new World();
        BigDecimal actual = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantityPeople = new BigDecimal("339792122000");
        Assert.assertEquals(expectedQuantityPeople, actual );
    }
}
