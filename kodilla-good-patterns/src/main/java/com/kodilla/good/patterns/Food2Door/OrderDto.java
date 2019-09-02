package com.kodilla.good.patterns.Food2Door;

public class OrderDto {

    public DistributorService distributorService;
    public boolean isOrdered;

    public OrderDto(DistributorService distributorService, boolean isOrdered) {
        this.distributorService = distributorService;
        this.isOrdered = isOrdered;
    }

    public DistributorService getDistributorService() {
        return distributorService;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
