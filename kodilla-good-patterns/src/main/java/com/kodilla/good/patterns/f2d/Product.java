package com.kodilla.good.patterns.f2d;

public class Product {
    String productName;
    double productAmount;
    String distributorName;

    public Product(String productName, double productAmount, String distributorName) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.distributorName = distributorName;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductAmount() {
        return productAmount;
    }

    public String getDistributorName() {
        return distributorName;
    }
}
