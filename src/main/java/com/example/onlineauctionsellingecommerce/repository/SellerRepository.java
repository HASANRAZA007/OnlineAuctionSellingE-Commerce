package com.example.onlineauctionsellingecommerce.repository;

import com.example.onlineauctionsellingecommerce.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {
}
