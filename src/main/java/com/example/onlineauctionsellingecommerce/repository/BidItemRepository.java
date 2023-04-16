package com.example.onlineauctionsellingecommerce.repository;
import com.example.onlineauctionsellingecommerce.entity.BidItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BidItemRepository extends JpaRepository<BidItem, Long> {
    BidItem findBidItemByUser_EmailAndItem_Id(String email, Long id);
    BidItem findTopByItemIdOrderByBidPriceDescTimeAsc(Long Id);

}