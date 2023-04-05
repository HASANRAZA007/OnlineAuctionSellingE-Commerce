package com.example.onlineauctionsellingecommerce.model;
import com.example.onlineauctionsellingecommerce.entity.Category;
import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import lombok.Data;

@Data
public class ItemModel {
    private Long id;
    private String name;
    private String code;
    private String description;
    private Float price;
    private Category category;
    private UserRole userRole;
    private String email;
    private String role;

    public Item disassemble(){
        Item item=new Item();
        item.setName((name));
        item.setCode(code);
        item.setDescription(description);
        item.setPrice(price);
        item.setCategory(category);
        item.setUserRole(userRole);
        return item;
    }
    public ItemModel assemble(Item item){
        ItemModel itemModel=new ItemModel();
        itemModel.setId(item.getId());
        itemModel.setName(item.getName());
        itemModel.setCode(item.getCode());
        itemModel.setDescription(item.getDescription());
        itemModel.setCategory(item.getCategory());
        itemModel.setUserRole(item.getUserRole());
        return itemModel;

    }
}
