package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import com.example.onlineauctionsellingecommerce.model.ItemModel;
import com.example.onlineauctionsellingecommerce.repository.ItemRepository;
import com.example.onlineauctionsellingecommerce.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService implements IItem {
    private final ItemRepository itemRepository;
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository, UserRoleRepository userRoleRepository) {
        this.itemRepository = itemRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public String saveItem(ItemModel itemModel) {
        String status;
        String modelEmail = itemModel.getEmail();
        UserRole userRole = userRoleRepository.findUserRoleByUser_Email(modelEmail);
        String itemModelCode = itemModel.getCode();
        if (userRole != null && userRole.getRole().getRoleName().equalsIgnoreCase("seller")) {
            Item isCodeExist = itemRepository.findByCode(itemModelCode);
            if (isCodeExist != null) {
                status = "Item is already Exist.";
            } else {
                Item item = itemRepository.save(itemModel.disassemble());
                item.setUser(userRole.getUser());
                itemRepository.save(item);
                status = "Item Successfully Saved.";
            }
        } else {
            status = "You have not Permission to List Item";
        }
        return status;
    }

    @Override
    public List<ItemModel> getItems() {
        List<Item> itemList = itemRepository.findAll();
        List<ItemModel> itemsModel = new ArrayList<>();
        for (Item item : itemList) {
            itemsModel.add(new ItemModel().assemble(item));
        }
        return itemsModel;
    }

    @Override
    public List<ItemModel> getItemByName(String itemName) {
        List<ItemModel> itemModel = new ArrayList<>();
        List<Item> listOfItems = itemRepository.findItemByName(itemName);
        for (Item item : listOfItems) {
            itemModel.add(new ItemModel().assemble(item));
        }
        return itemModel;
    }

    @Override
    public List<ItemModel> getItemByCategory(String categoryName) {
        List<ItemModel> itemModels = new ArrayList<>();
        List<Item> itemList = itemRepository.findItemByCategory_Name(categoryName);
        for (Item item : itemList) {
            itemModels.add(new ItemModel().assemble(item));
        }
        return itemModels;
    }

    @Override
    public String deleteItem(String itemCode) {
        itemRepository.deleteItemByCode(itemCode);
        return "Item is Deleted";
    }
}
