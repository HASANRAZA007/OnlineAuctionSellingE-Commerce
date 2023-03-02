package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Data
@Table(name = "auction_product")
public class AuctionProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_id")
    private long auction_id;
    @Column(name = "seller_id")
    private long seller_id;
    @Column(name = "buyer_id")
    private long buyer_id;
    @Column(name = "product_id")
    private long product_id;
    @Column(name = "auction_time")
    private String auction_time;
    @Column(name = "max_bid_price")
    private float max_bid_price;
    @Column(name = "bid_count")
    private int bid_count;
}
