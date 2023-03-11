package com.example.onlineauctionsellingecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private int id;
    @Column(name = "name")
    private String categoryName;
    @OneToMany(mappedBy = "categories")
    private List<Item> categoryItem;
}
