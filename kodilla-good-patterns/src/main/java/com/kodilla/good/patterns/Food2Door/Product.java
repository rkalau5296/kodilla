package com.kodilla.good.patterns.Food2Door;

public class Product implements InformSupplier {
    String productName;
    double productAmount;
    String distributorName;

    public Product(String productName, double productAmount, String distributorName) {
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
}
