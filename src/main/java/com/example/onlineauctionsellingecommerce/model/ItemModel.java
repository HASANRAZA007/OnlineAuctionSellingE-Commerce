package com.example.onlineauctionsellingecommerce.model;
import com.example.onlineauctionsellingecommerce.entity.Category;
import com.example.onlineauctionsellingecommerce.entity.Item;
import lombok.Data;

@Data
public class ItemModel {
    private Long id;
    private String name;
    private Long code;
    private String description;
    private String price;
    private Category category;

    public Item disassemble(){
        Item item=new Item();
        item.setName((name));
        item.setCode(code);
        item.setDescription(description);
        item.setPrice(price);
        item.setCategory(category);
        return item;
    }
    public ItemModel assemble(Item item){
        ItemModel itemModel=new ItemModel();
        itemModel.setId(item.getId());
        itemModel.setName(item.getName());
        itemModel.setCode(item.getCode());
        itemModel.setDescription(item.getDescription());
        itemModel.setCategory(item.getCategory());
        return itemModel;
    }
}
