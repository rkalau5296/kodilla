package com.kodilla.good.patterns.f2d;


public class OrderRequestRetriever {

    public OrderRequest retrieve(User user, Product product){

        return new OrderRequest(user, product);
    }
}
