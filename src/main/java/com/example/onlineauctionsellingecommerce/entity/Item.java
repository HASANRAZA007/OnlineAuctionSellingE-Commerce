package com.example.onlineauctionsellingecommerce.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Entity
@Table(name = "item")
@Data
@NonNull
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Float price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "seller")
    private User user;
    @OneToMany(mappedBy = "item")
    private List<Order> orderItemList;
    @OneToMany(mappedBy = "item")
    private List<BidItem> bidItemList;
}
