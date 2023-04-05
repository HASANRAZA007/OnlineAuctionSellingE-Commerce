package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Table(name = "role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "role_name")
    private String roleName;
    @OneToMany(mappedBy = "role")
    private Set<UserRole> userRoleList;
}