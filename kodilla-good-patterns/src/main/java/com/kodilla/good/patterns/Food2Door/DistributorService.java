package com.kodilla.good.patterns.Food2Door;

public interface DistributorService {
    String getProductName();
    double getProductAmount();
    String getDistributorName();
    DistributorDto process(DistributorService distributorService);

}
