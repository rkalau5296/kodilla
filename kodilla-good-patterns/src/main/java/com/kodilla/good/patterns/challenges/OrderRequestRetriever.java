package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve(User user){
        return new OrderRequest(user);
    }
}
