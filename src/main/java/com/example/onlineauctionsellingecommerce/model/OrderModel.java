package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.Order;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class OrderModel {
    private int quantity;
    private Date date;
    private String shippingAddress;
    private String paymentMethod;

    public Order disassemble(){
        Order order=new Order();
        order.setQuantity(quantity);
        order.setDate(date);
        order.setShippingAddress(shippingAddress);
        order.setPaymentMethod(paymentMethod);
        return order;
    }
    public  OrderModel assemble(Order order){
        OrderModel orderModel=new OrderModel();
        orderModel.setQuantity(order.getQuantity());
        orderModel.setDate(order.getDate());
        orderModel.setShippingAddress(order.getShippingAddress());
        orderModel.setPaymentMethod(order.getPaymentMethod());
        return orderModel;
    }
}
