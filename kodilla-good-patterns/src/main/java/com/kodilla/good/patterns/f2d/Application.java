package com.kodilla.good.patterns.f2d;

import com.kodilla.good.patterns.f2d.shops.ExtraFoodShop;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(new User("Rafal", "rafal@rafal.pl"), new Product("Bread", 2, "ExtraFoodShop"));
        Supplier supplier = new ExtraFoodShop(new MailService(), new ProductOrderRepository(), new ProductService());
        supplier.process(orderRequest);
    }

}
