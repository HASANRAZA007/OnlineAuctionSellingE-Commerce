package com.example.onlineauctionsellingecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "payments")
@Data
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private long paymentId;
    @Column(name = "payment_status")
    private boolean paymentStatus;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller sellers;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
}
