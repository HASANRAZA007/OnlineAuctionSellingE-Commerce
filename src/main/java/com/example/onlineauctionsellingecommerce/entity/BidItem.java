package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "bid_item")
@Data
public class BidItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bid_id")
    private long bidId;
    @Column(name = "bid_time")
    private java.time.LocalDateTime bidTime;
    @Column(name = "max_bid_price")
    private float maxBidPrice;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller sellers;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
}
