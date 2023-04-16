package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.BidItem;
import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import com.example.onlineauctionsellingecommerce.model.BidItemModel;
import com.example.onlineauctionsellingecommerce.repository.BidItemRepository;
import com.example.onlineauctionsellingecommerce.repository.ItemRepository;
import com.example.onlineauctionsellingecommerce.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BidItemService {
    private final BidItemRepository bidItemRepository;
    private final UserRoleRepository userRoleRepository;
    private final ItemRepository itemRepository;
    String status;

    @Autowired
    public BidItemService(ItemRepository itemRepository,BidItemRepository bidItemRepository,UserRoleRepository userRoleRepository) {
        this.bidItemRepository = bidItemRepository;
        this.userRoleRepository = userRoleRepository;
        this.itemRepository=itemRepository;
    }

    public String saveBid(BidItemModel bidItemModel) {
        Long modelId=bidItemModel.getItem().getId();
        Item item=itemRepository.findItemById(modelId);
        Float modelBid=bidItemModel.getBidPrice();
        String modelEmail = bidItemModel.getEmail();
        UserRole userRole = userRoleRepository.findUserRoleByUser_Email(modelEmail);
        Long biddingItem = bidItemModel.getItem().getId();
        if (userRole != null && userRole.getRole().getRoleName().equalsIgnoreCase("buyer")) {
            BidItem bidItem = bidItemRepository.findBidItemByUser_EmailAndItem_Id(modelEmail, biddingItem);
            if (bidItem != null) {
               status="Your already bid on this item";
            } else if (modelBid>=item.getPrice()) {
                bidItemModel.assemble(bidItemRepository.save(bidItemModel.disassemble()));
                status="Bid on item is Successfully Submitted.";
            }
            else if(modelBid<item.getPrice()) {
              status= "Bid bride can not be less then item price.";
            }
    } else {
            status = "You have not Permission to Bid on any Item.";
        }
        return status;
    }

    public String getWinnerBuyer(Long itemId) {
        String status;
        BidItem highestBid = bidItemRepository.findTopByItemIdOrderByBidPriceDescTimeAsc(itemId);
        if (highestBid != null) {
            String user = highestBid.getUser().getEmail();
            String item = highestBid.getItem().getName();
            String bidPrice = highestBid.getBidPrice().toString();
            status = "Win bid Buyer is " + user + "\nAgainst Item " + item + "\nAnd Your Bid was " + bidPrice;
        }else {
            status="you can't win this item";
        }
        return status;
    }

}
