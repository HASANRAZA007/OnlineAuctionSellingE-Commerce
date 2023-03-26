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
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "category")
    private List<Item> itemList;
    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private UserRole userRole;
}
