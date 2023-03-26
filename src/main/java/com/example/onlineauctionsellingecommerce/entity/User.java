package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "E_mail", unique = true)
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "mobile_number", unique = true)
    private Long mobileNumber;
    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoleList;
}
