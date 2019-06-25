package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Polska", new BigDecimal("4")));
        europe.addCountry(new Country("Niemcy", new BigDecimal("5")));
        europe.addCountry(new Country("Czechy", new BigDecimal("6")));
        europe.addCountry(new Country("Francja", new BigDecimal("5")));

        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("Russia", new BigDecimal("4")));
        asia.addCountry(new Country("China", new BigDecimal("6")));
        asia.addCountry(new Country("Japan", new BigDecimal("5")));
        asia.addCountry(new Country("Izrael", new BigDecimal("5")));

        Continent southAmerica = new Continent("SouthAmerica");
        southAmerica.addCountry(new Country("Brasil", new BigDecimal("4")));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("5")));
        southAmerica.addCountry(new Country("Paraguay", new BigDecimal("6")));
        southAmerica.addCountry(new Country("Peru", new BigDecimal("5")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(southAmerica);

        //When

        BigDecimal actual = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantityPeople = new BigDecimal("60");
        Assert.assertEquals(expectedQuantityPeople, actual );
    }
}
