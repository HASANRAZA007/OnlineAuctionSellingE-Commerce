package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bid_item")
@Data
public class BidItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid_id")
    private long bidId;
    @Column(name = "bid_time")
    private String bidTime;
    @Column(name = "max_bid_price")
    private float maxBidPrice;
    @Column(name = "bid_count")
    private int bidCount;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
}
