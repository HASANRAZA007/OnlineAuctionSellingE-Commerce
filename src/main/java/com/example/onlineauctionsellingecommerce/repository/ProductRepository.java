package com.example.onlineauctionsellingecommerce.repository;

import com.example.onlineauctionsellingecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
