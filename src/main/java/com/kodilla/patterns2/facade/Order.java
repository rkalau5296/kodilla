package com.kodilla.patterns2.facade;

import com.kodilla.patterns2.facade.Item;
import com.kodilla.patterns2.facade.ProductService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items = new ArrayList<>();
    private Long orderId;
    private Long userId;
    private boolean isPaid;
    private boolean isVerified;
    private boolean isSubmitted;
    private ProductService productService;

    public Order(Long orderId, Long userId, ProductService productService) {
        this.orderId = orderId;
        this.userId = userId;
        this.productService = productService;
    }
    public BigDecimal calculateValue(){
        BigDecimal sum = BigDecimal.ZERO;
        for(Item item: items){
            sum = sum.add(productService.getPrice(item.getProductId())
            .multiply(new BigDecimal(item.getQty())));
        }
        return sum;
    }

    public List<Item> getItems() {
        return items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public void setSubmitted(boolean submitted) {
        isSubmitted = submitted;
    }
}
