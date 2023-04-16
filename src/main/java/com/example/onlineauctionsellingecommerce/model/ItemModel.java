package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.Category;
import com.example.onlineauctionsellingecommerce.entity.Item;
import lombok.Data;

@Data
public class ItemModel {
    private String name;
    private String code;
    private String description;
    private Float price;
    private Category category;
    private String email;

    public Item disassemble() {
        Item item = new Item();
        item.setName((name));
        item.setCode(code);
        item.setDescription(description);
        item.setPrice(price);
        item.setCategory(category);
        return item;
    }

    public ItemModel assemble(Item item) {
        ItemModel itemModel = new ItemModel();
        itemModel.setName(item.getName());
        itemModel.setCode(item.getCode());
        itemModel.setDescription(item.getDescription());
        itemModel.setPrice(item.getPrice());
        itemModel.setCategory(item.getCategory());
        return itemModel;

    }
}
