package com.kodilla.good.patterns.Food2Door.Distributors;

import com.kodilla.good.patterns.Food2Door.DistributorService;
import com.kodilla.good.patterns.Food2Door.OrderProduct;

public class ExtraFoodShop implements DistributorService {

    String productName;
    double productAmount;
    String distributorName;

    public ExtraFoodShop(String productName, double productAmount, String distributorName) {
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

    public void process () {
    }
}
