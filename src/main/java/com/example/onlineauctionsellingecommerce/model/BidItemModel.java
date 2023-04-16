package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.BidItem;
import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.User;
import jakarta.annotation.Nullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
@NoArgsConstructor
public class BidItemModel {
    private  Long id;
    @Nullable
    private LocalDateTime time;
    private Float bidPrice;
    private String email;
    private User user;
    private String roleName;
    private Item item;

    public BidItem disassemble(){
        BidItem bidItem=new BidItem();
        bidItem.setTime(LocalDateTime.parse(LocalDateTime.now().toString()));
        bidItem.setBidPrice(bidPrice);
        bidItem.setItem(item);
        bidItem.setUser(user);
        return bidItem;
    }
    public BidItemModel assemble(BidItem bidItem){
        BidItemModel bidItemModel=new BidItemModel();
        bidItemModel.setTime(bidItem.getTime());
        bidItemModel.setBidPrice(bidItem.getBidPrice());
        bidItemModel.setItem(bidItem.getItem());
        return bidItemModel;
    }
}
