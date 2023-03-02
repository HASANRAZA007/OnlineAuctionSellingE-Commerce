package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity(name="buyer")
@Data
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyer_id")
    private long buyer_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "password")
    private String password;
    @Column(name = "buyer_address")
    private String buyer_address;
    @Column(name = "buyer_email")
    private String buyer_email;
    @Column(name = "buyer_number")
    private int buyer_number;
}
