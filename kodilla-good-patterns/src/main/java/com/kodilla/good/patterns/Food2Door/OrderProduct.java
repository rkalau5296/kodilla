package com.kodilla.good.patterns.Food2Door;

public class OrderProduct {
    DistributorService distributorService;

    public OrderProduct(DistributorService distributorService) {

        this.distributorService = distributorService;
    }
    public void order (final DistributorService distributorService) {
        distributorService.getProductName();
        distributorService.getProductAmount();
        distributorService.getDistributorName();
        distributorService.process();

    }
}
