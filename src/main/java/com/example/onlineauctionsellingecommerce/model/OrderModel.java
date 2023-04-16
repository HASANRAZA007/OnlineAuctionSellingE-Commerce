package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.Order;
import com.example.onlineauctionsellingecommerce.entity.User;
import lombok.Data;
import lombok.NonNull;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class OrderModel {
    private LocalDateTime date;
    private String shippingAddress;
    private String paymentMethod;
    private User user;
    private Item item;

    public Order disassemble(){
        Order order=new Order();
        order.setDate(LocalDateTime.parse(LocalDateTime.now().toString()));
        order.setShippingAddress(shippingAddress);
        order.setPaymentMethod(paymentMethod);
        order.setUser(user);
        order.setItem(item);
        return order;
    }
    public  OrderModel assemble(Order order){
        OrderModel orderModel=new OrderModel();
        orderModel.setDate(order.getDate());
        orderModel.setShippingAddress(order.getShippingAddress());
        orderModel.setPaymentMethod(order.getPaymentMethod());
        orderModel.setUser(order.getUser());
        orderModel.setItem(order.getItem());
        return orderModel;
    }
}
