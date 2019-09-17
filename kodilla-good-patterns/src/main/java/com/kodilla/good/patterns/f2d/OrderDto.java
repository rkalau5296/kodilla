package com.kodilla.good.patterns.f2d;

public class OrderDto {
    public User user;
    public boolean isOrdered;
    public Product product;

    public OrderDto(User user, boolean isOrdered, Product product) {
        this.user = user;
        this.isOrdered = isOrdered;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public Product getProduct() {
        return product;
    }
}
