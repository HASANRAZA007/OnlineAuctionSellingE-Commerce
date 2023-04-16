package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bid_item")
@Data
public class BidItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "bid_time")
    private java.time.LocalDateTime time;
    @Column(name = "bid_price",nullable = false)
    private Float bidPrice;
    @ManyToOne
    @JoinColumn(name = "bidder")
    private User user;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
