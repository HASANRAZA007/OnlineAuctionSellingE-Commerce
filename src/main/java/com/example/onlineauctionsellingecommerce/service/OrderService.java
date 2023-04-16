package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.model.OrderModel;
import com.example.onlineauctionsellingecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderModel addOrder(OrderModel orderModel) {
        return orderModel.assemble(orderRepository.save(orderModel.disassemble()));
    }
}
