package com.example.onlineauctionsellingecommerce.repository;

import com.example.onlineauctionsellingecommerce.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
