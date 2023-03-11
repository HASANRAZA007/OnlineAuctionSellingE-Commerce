package com.example.onlineauctionsellingecommerce.controller;

import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
   private ItemService itemService;
    @PostMapping("ListItems")
    public void saveitem(@RequestBody Item item){
        itemService.ListItem(item);
    }
}
