package com.kodilla.good.patterns.Food2Door.Distributors;

import com.kodilla.good.patterns.Food2Door.*;

public class HealthyShop implements DistributorService {

    InformSupplier informSupplier;
    OrderRepository orderRepository;
    OrderService orderService;

    public HealthyShop(InformSupplier informSupplier, OrderRepository orderRepository, OrderService orderService) {
        this.informSupplier = informSupplier;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    @Override
    public String getProductName() {

        return informSupplier.getProductName();
    }

    @Override
    public double getProductAmount() {

        return informSupplier.getProductAmount();
    }

    @Override
    public String getDistributorName() {

        return informSupplier.getDistributorName();
    }

    public void process() {
        System.out.println("This is the HealthyShop order realisation ");
    }
}
