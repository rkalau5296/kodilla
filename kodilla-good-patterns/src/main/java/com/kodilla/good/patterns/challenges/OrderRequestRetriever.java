package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        User user = new User("Rafal", "rafal.kalata.itservice@gmail.com");
        return new OrderRequest(user);
    }

}
