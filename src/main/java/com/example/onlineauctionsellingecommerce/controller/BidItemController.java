package com.example.onlineauctionsellingecommerce.controller;

import com.example.onlineauctionsellingecommerce.model.BidItemModel;
import com.example.onlineauctionsellingecommerce.service.BidItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class BidItemController {
    private final BidItemService bidItemService;
    @Autowired
    public BidItemController(BidItemService bidItemService) {
        this.bidItemService = bidItemService;
    }
    @PostMapping("/bidItem")
    private String bidItem(@RequestBody BidItemModel bidItemModel) throws Exception {
        return  bidItemService.saveBid(bidItemModel);
    }
    @GetMapping(path = "/winningBid/{itemId}")
    private String winningBid(@PathVariable(name = "itemId") Long itemId){
        return  bidItemService.getWinnerBuyer(itemId);
    }
}
