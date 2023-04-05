package com.example.onlineauctionsellingecommerce.controller;

import com.example.onlineauctionsellingecommerce.model.BidItemModel;
import com.example.onlineauctionsellingecommerce.service.BidItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BidItemController {
    final
    BidItemService bidItemService;
    @Autowired
    public BidItemController(BidItemService bidItemService) {
        this.bidItemService = bidItemService;
    }
    @PostMapping("/bidItem")
    private String bidItem(@RequestBody BidItemModel bidItemModel)
    {
        return  bidItemService.saveBid(bidItemModel);
    }
}
