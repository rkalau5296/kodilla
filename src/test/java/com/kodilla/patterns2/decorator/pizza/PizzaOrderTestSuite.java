package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void BasicPizzaOrder() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(15), theCost);
        assertEquals("Basic Pizza", description);
    }
    @Test
    public void BasicPizzaOrderWithGarlic() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new GarlicPizzaDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(17), theCost);
        assertEquals("Basic Pizza + garlic", description);
    }
    @Test
    public void BasicPizzaOrderWithGarlicAndHam() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new GarlicPizzaDecorator(pizzaOrder);
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(19), theCost);
        assertEquals("Basic Pizza + garlic + ham", description);
    }
    @Test
    public void BasicPizzaOrderWithGarlicAndHamAndMashrooms() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new GarlicPizzaDecorator(pizzaOrder);
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        pizzaOrder = new MashroomsPizzaDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(21), theCost);
        assertEquals("Basic Pizza + garlic + ham + mashrooms", description);
    }
    @Test
    public void BasicPizzaOrderWithGarlicAndHamAndMashroomsAndOnion() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new GarlicPizzaDecorator(pizzaOrder);
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        pizzaOrder = new MashroomsPizzaDecorator(pizzaOrder);
        pizzaOrder = new OnionPizzaDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(23), theCost);
        assertEquals("Basic Pizza + garlic + ham + mashrooms + onion", description);
    }
    @Test
    public void BasicPizzaOrderWithGarlicAndHamAndMashroomsAndOnionAndSalami() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        pizzaOrder = new GarlicPizzaDecorator(pizzaOrder);
        pizzaOrder = new HamPizzaDecorator(pizzaOrder);
        pizzaOrder = new MashroomsPizzaDecorator(pizzaOrder);
        pizzaOrder = new OnionPizzaDecorator(pizzaOrder);
        pizzaOrder = new SalamiPizzaDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(25), theCost);
        assertEquals("Basic Pizza + garlic + ham + mashrooms + onion + salami", description);
    }
}
