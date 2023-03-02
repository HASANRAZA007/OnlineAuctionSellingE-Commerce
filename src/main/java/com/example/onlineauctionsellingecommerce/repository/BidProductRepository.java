package com.example.onlineauctionsellingecommerce.repository;

import com.example.onlineauctionsellingecommerce.entity.BidProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidProductRepository extends JpaRepository<BidProduct, Long> {
}
