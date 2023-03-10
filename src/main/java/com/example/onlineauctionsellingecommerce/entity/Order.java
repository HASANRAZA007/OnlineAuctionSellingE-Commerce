package com.example.onlineauctionsellingecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order_item")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;
    @Column(name = "bid_id")
    private long bidId;
    @Column(name = "seller_id")
    private long sellerId;
    @Column(name = "buyer_id")
    private long buyerId;
    @Column(name = "item_id")
    private long itemId;
    @Column(name = "order_date")
    private Date orderDate;
    @Column(name = "order_quantity")
    private int OrderQuantity;
    @Column(name = "total_amount")
    private float totalAmount;
    @Column(name = "payment_method")
    private String paymentMethod;
    @OneToMany(mappedBy = "order")
    private List<Payment> orderPayment=new ArrayList<>();
}
