package com.example.onlineauctionsellingecommerce.controller;

import com.example.onlineauctionsellingecommerce.model.OrderModel;
import com.example.onlineauctionsellingecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderService orderService;
    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping(path = "/order")
    public OrderModel addOrder(@RequestBody OrderModel orderModel){
        return orderService.addOrder(orderModel);
    }
}
