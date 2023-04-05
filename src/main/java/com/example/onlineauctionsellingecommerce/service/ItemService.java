package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import com.example.onlineauctionsellingecommerce.model.ItemModel;
import com.example.onlineauctionsellingecommerce.repository.ItemRepository;
import com.example.onlineauctionsellingecommerce.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ItemService {
    @Autowired
    private  ItemRepository itemRepository;
    @Autowired
    private  UserRoleRepository userRoleRepository;

    public String saveItem(ItemModel itemModel) {
        String status;
        String modelEmail = itemModel.getEmail();
        UserRole userRole = userRoleRepository.findUserRoleByUser_Email(modelEmail);
        String itemModelCode = itemModel.getCode();
        Item isCodeExist = itemRepository.findByCode(itemModelCode);
        if (userRole != null && userRole.getRole().getRoleName().equalsIgnoreCase("seller")) {
            if (isCodeExist != null) {
                status = "Item is already Exist.";
            } else {
                itemModel.assemble(itemRepository.save(itemModel.disassemble()));
                status = "Item Successfully Saved.";
            }
        } else {
            status = "You have not Permission to List Item";
        }
        return status;
    }
}
