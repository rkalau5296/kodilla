package com.kodilla.good.patterns.f2d.shops;

import com.kodilla.good.patterns.f2d.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExtraFoodShop implements Supplier {
    MailInformationCenter mailInformationCenter;
    OrderRepository orderRepository;
    OrderService orderService;

    public ExtraFoodShop(MailInformationCenter mailInformationCenter, OrderRepository orderRepository, OrderService orderService) {
        this.mailInformationCenter = mailInformationCenter;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public boolean checkProductAvailability(OrderRequest orderRequest) {
        return true;
    }
    @Override
    public OrderDto process(OrderRequest orderRequest) {
        boolean isAvailable = checkProductAvailability(orderRequest);
        if(isAvailable) {
            orderService.order(orderRequest);
            mailInformationCenter.inform(orderRequest);
            orderRepository.saveData(orderRequest);
            System.out.println("The product will be deliver within 14 days.");
            return new OrderDto(orderRequest.getUser(), true, orderRequest.getProduct());
        }
        return new OrderDto(orderRequest.getUser(), false, orderRequest.getProduct());
    }


}
