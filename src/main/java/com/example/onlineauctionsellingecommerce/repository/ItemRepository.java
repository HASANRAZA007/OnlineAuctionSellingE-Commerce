package com.example.onlineauctionsellingecommerce.repository;

import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findByCode(String code);
}
