package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.model.ItemModel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IItem {
      String saveItem(ItemModel itemModel);
      List<ItemModel> getItems();
      List<ItemModel> getItemByName(String itemName);
      List<ItemModel> getItemByCategory(String categoryName);

      String deleteItem(String itemCode);
}
