package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="buyer")
@Data
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "buyer_id")
    private long buyerId;
    @Column(name = "buyer_uer_name")
    private String buyerUserName;
    @Column(name = "buyer_password")
    private String buyerPassword;
    @Column(name = "user_typer")
    private String userType;
    @Column(name = "buyer_address")
    private String buyerAddress;
    @Column(name = "buyer_email")
    private String buyerEmail;
    @Column(name = "buyer_number")
    private int buyerNumber;
    @OneToMany(mappedBy = "buyer")
    private List<BidItem> buyerBidOnItem=new ArrayList<>();
}
