package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity(name = "seller")
@Data
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seller-id")
    private long seller_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "password")
    private String password;
    @Column(name = "seller_address")
    private String seller_address;
    @Column(name = "seller_email")
    private String seller_email;
    @Column(name = "seller_number")
    private int seller_number;
}
