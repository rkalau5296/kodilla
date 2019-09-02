package com.kodilla.good.patterns.Food2Door;

public class OrderProduct {
    DistributorService distributorService;

    public OrderProduct(DistributorService distributorService) {
        this.distributorService = distributorService;
    }
    public OrderDto order (final DistributorService distributorService) {

        distributorService.getDistributorName();
        distributorService.getProductAmount();
        distributorService.getProductName();
        return new OrderDto(distributorService, true);
    }
}
