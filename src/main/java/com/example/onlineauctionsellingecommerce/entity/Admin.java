package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;
@Entity(name="admin")
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private int admin_id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "password")
    private String password;
    @Column(name = "user_type")
    private String user_type;
}
