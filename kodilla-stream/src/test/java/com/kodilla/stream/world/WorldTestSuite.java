package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given

        Continent Europe = new Continent("Europe");
        Europe.addCountry(new Country("Polska", new BigDecimal("4")));
        Europe.addCountry(new Country("Niemcy", new BigDecimal("5")));
        Europe.addCountry(new Country("Czechy", new BigDecimal("6")));
        Europe.addCountry(new Country("Francja", new BigDecimal("5")));

        Continent Asia = new Continent("Asia");
        Asia.addCountry(new Country("Russia", new BigDecimal("4")));
        Asia.addCountry(new Country("China", new BigDecimal("6")));
        Asia.addCountry(new Country("Japan", new BigDecimal("5")));
        Asia.addCountry(new Country("Izrael", new BigDecimal("5")));

        Continent SouthAmerica = new Continent("SouthAmerica");
        Asia.addCountry(new Country("Brasil", new BigDecimal("4")));
        Asia.addCountry(new Country("Argentina", new BigDecimal("5")));
        Asia.addCountry(new Country("Paraguay", new BigDecimal("6")));
        Asia.addCountry(new Country("Peru", new BigDecimal("5")));

        World world = new World();
        world.addContinent(Europe);
        world.addContinent(Asia);
        world.addContinent(SouthAmerica);

        //When

        BigDecimal actual = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantityPeople = new BigDecimal("60");
        Assert.assertEquals(expectedQuantityPeople, actual );
    }
}
