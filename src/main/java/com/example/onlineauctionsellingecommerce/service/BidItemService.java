package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.BidItem;
import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import com.example.onlineauctionsellingecommerce.model.BidItemModel;
import com.example.onlineauctionsellingecommerce.repository.BidItemRepository;
import com.example.onlineauctionsellingecommerce.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BidItemService {
    private final BidItemRepository bidItemRepository;
    private final UserRoleRepository userRoleRepository;
    @Autowired
    public BidItemService(BidItemRepository bidItemRepository, UserRoleRepository userRoleRepository){
        this.bidItemRepository=bidItemRepository;
        this.userRoleRepository=userRoleRepository;
    }
    public String saveBid(BidItemModel bidItemModel){
        String status;
        String modelEmail = bidItemModel.getEmail();
        UserRole userRole = userRoleRepository.findUserRoleByUser_Email(modelEmail);
        UserRole biddingBuyer=bidItemModel.getUserRole();
        Item biddingItem=bidItemModel.getItem();
        BidItem alreadyBid=bidItemRepository.findByUserRoleAndItem(biddingBuyer,biddingItem);
        if(alreadyBid!=null){
            status="You have already  bid on this item";
        }
        else {
            bidItemModel.assemble(bidItemRepository.save(bidItemModel.disassemble()));
            status="You have successfully bid on this item";
        }
        return  status;
    }

}
