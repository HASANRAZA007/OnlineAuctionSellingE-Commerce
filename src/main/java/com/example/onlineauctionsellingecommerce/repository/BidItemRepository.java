package com.example.onlineauctionsellingecommerce.repository;
import com.example.onlineauctionsellingecommerce.entity.BidItem;
import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BidItemRepository extends JpaRepository<BidItem, Long> {

    BidItem findByUserRoleAndItem(UserRole userRoleId, Item itemId);
}
