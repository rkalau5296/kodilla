package com.kodilla.good.patterns.Food2Door;

import com.kodilla.good.patterns.Food2Door.Distributors.ExtraFoodShop;
import com.kodilla.good.patterns.Food2Door.Distributors.GlutenFreeShop;
import com.kodilla.good.patterns.Food2Door.Distributors.HealthyShop;

public class Application {
    public static void main(String[] args) {
        OrderProduct orderProductExtraFoodShop = new OrderProduct(
                new ExtraFoodShop(
                        new Product("Bread", 5, "ExtraFoodShop"),
                        new ProductOrderRepository(),
                        new ProductOrderService()
                ));
        orderProductExtraFoodShop.order(new ExtraFoodShop(new Product("Bread", 5, "ExtraFoodShop"),
                new ProductOrderRepository(),
                new ProductOrderService()));

        OrderProduct orderProductGlutenFreeShop = new OrderProduct(
                new GlutenFreeShop(
                        new Product("Butter", 15, "GlutenFreeShop"),
                        new ProductOrderRepository(),
                        new ProductOrderService()
                ));
        orderProductGlutenFreeShop.order(new GlutenFreeShop(new Product("Butter", 15, "GlutenFreeShop"),
                new ProductOrderRepository(),
                new ProductOrderService()));

        OrderProduct orderProductHealthyShop = new OrderProduct(
                new HealthyShop(
                        new Product("Milk", 10, "HealthyShop"),
                        new ProductOrderRepository(),
                        new ProductOrderService()
                ));
        orderProductHealthyShop.order(new HealthyShop(new Product("Milk", 10, "HealthyShop"),
                new ProductOrderRepository(),
                new ProductOrderService()));

    }

}
