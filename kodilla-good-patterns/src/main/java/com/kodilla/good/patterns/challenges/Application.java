package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(new User("rafal", "rafal.kalata.itservice@gmail.com"));
        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new ProductService(), new ProductOrderRepository());
        productOrderService.process(orderRequest);
    }
}
