package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ItemService")
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;
    public void ListItem(Item item){
       itemRepository.save(item);
    }
}
