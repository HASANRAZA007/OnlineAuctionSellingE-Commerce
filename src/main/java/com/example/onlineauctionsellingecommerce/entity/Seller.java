package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "seller")
@Data
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller_id")
    private long sellerId;
    @Column(name = "seller_user_name")
    private String sellerUserName;
    @Column(name = "seller_password")
    private String sellerPassword;
    @Column(name = "seller_address")
    private String sellerAddress;
    @Column(name = "seller_email")
    private String sellerEmail;
    @Column(name = "seller_number")
    private int sellerNumber;
    @OneToMany(mappedBy = "seller")
    private List<Item> items=new ArrayList<>();
    @OneToMany(mappedBy = "seller")
    private List<BidItem> bidOnSellerItems=new ArrayList<>();
}
