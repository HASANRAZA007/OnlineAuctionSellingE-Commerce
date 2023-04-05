package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.BidItem;
import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import jakarta.annotation.Nullable;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;

@Component
@Data
public class BidItemModel {
    private  Long id;
    @Nullable
    private LocalDateTime time;
    private Float bidPrice;
    private UserRole userRole;
    private String email;
    private Item item;

    public BidItem disassemble(){
        BidItem bidItem=new BidItem();
        bidItem.setTime(LocalDateTime.now());
        bidItem.setBidPrice(bidPrice);
        bidItem.setItem(item);
        bidItem.setUserRole(userRole);
        return bidItem;
    }
    public BidItemModel assemble(BidItem bidItem){
        BidItemModel bidItemModel=new BidItemModel();
        bidItemModel.setTime(bidItem.getTime());
        bidItemModel.setBidPrice(bidItem.getBidPrice());
        bidItemModel.setItem(bidItem.getItem());
        bidItemModel.setUserRole(bidItem.getUserRole());
        return bidItemModel;
    }
}
