package com.example.onlineauctionsellingecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;

@Entity(name = "order_product")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int order_id;
    @Column(name = "auction_id")
    private long auction_id;
    @Column(name = "seller-id")
    private long seller_id;
    @Column(name = "buyer_id")
    private long buyer_id;
    @Column(name = "product_id")
    private long product_id;
    @Column(name = "order_date")
    private Date order_date;
    @Column(name = "o_quantity")
    private int Order_quantity;
    @Column(name = "toatal_amount")
    private float total_amount;
    @Column(name = "payment_method")
    private String payment_method;
}
