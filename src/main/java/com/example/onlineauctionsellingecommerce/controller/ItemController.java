package com.example.onlineauctionsellingecommerce.controller;

import com.example.onlineauctionsellingecommerce.model.ItemModel;
import com.example.onlineauctionsellingecommerce.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {
    private final ItemService itemService;
    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/saveItem")
    public String save(@RequestBody ItemModel itemModel) {
        return itemService.saveItem(itemModel);
    }
    @GetMapping(path = "/getItemByName/{name}")
    public List<ItemModel> getItemsByName(@PathVariable(name = "name") String itemName){
        return itemService.getItemByName(itemName);
    }
    @GetMapping(path = "/getItemByCategory/{categoryName}")
    public  List<ItemModel> getItemByCategory(@PathVariable(name = "categoryName") String categoryName){
        return itemService.getItemByCategory(categoryName);
    }
    @DeleteMapping(path = "/deleteItem/{code}")
    public String deleteItem(@PathVariable(name = "code") String itemCode){
        return itemService.deleteItem(itemCode);
    }
    @GetMapping(path = "/getItems")
    public List<ItemModel> getItems(){
        return itemService.getItems();
    }
}
