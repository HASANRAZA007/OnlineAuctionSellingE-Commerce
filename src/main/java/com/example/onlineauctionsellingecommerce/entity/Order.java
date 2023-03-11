package com.example.onlineauctionsellingecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "order_item")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int orderId;
    @Column(name = "order_amount")
    private Date orderAmount;
    @OneToMany(mappedBy = "order")
    private List<Payment> orderPayment;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller sellers;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetails;
}
