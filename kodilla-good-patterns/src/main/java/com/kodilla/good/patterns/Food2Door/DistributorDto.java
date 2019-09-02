package com.kodilla.good.patterns.Food2Door;

public class DistributorDto {
    DistributorService distributorService;

    public DistributorDto(DistributorService distributorService) {
        this.distributorService = distributorService;
    }

    public DistributorDto process(DistributorService distributorService) {
        distributorService.getDistributorName();
        distributorService.getProductAmount();
        distributorService.getProductName();

    }
}
