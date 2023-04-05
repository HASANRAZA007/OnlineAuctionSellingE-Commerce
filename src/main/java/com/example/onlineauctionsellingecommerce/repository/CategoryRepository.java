package com.example.onlineauctionsellingecommerce.repository;
import com.example.onlineauctionsellingecommerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
    Category deleteByName(String name);
}
