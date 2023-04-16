package com.example.onlineauctionsellingecommerce.repository;

import com.example.onlineauctionsellingecommerce.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByCode(String code);
    List<Item> findItemByName(String name);
    List<Item> findItemByCategory_Name(String categoryName);
    void deleteItemByCode(String code);
    Item findItemById(Long modelId);
}
