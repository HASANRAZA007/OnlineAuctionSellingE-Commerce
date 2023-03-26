package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.BidItem;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class BidItemModel {
    private java.time.LocalDateTime time;
    private Long maxBidPrice;

    public BidItem disassemble(){
        BidItem bidItem=new BidItem();
        bidItem.setTime(time);
        bidItem.setMaxBidPrice(maxBidPrice);
        return bidItem;
    }
    public BidItemModel assemble(BidItem bidItem){
        BidItemModel bidItemModel=new BidItemModel();
        bidItemModel.setTime(bidItem.getTime());
        bidItemModel.setMaxBidPrice(bidItem.getMaxBidPrice());
        return bidItemModel;
    }
}
