package com.kodilla.good.patterns.Food2Door.Distributors;

import com.kodilla.good.patterns.Food2Door.DistributorDto;
import com.kodilla.good.patterns.Food2Door.DistributorService;

public class GlutenFreeShop implements DistributorService {
    String productName;
    double productAmount;
    String distributorName;

    public GlutenFreeShop(String productName, double productAmount, String distributorName) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.distributorName = distributorName;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public double getProductAmount() {
        return productAmount;
    }

    @Override
    public String getDistributorName() {
        return distributorName;
    }

    public DistributorDto process(DistributorService distributorService){
        return new DistributorDto(distributorService);
    }
}
