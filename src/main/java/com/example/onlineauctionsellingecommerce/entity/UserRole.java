package com.example.onlineauctionsellingecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "user_role")
@Data
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private  Role role;
    @OneToMany(mappedBy = "userRole")
    private List<Item> sellerItemList;
    @OneToMany(mappedBy = "userRole")
    private List<BidItem> bidItemList;
    @OneToMany(mappedBy = "userRole")
    private List<Category> categoryList;
    @OneToMany(mappedBy = "userRole")
    private List<Order> userOrderList;
    @OneToMany(mappedBy = "userRole")
    private List<Payment> paymentList;
}
