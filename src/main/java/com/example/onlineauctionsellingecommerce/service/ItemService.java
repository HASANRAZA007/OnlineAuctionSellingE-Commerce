package com.example.onlineauctionsellingecommerce.service;
import com.example.onlineauctionsellingecommerce.entity.Item;
import com.example.onlineauctionsellingecommerce.model.ItemModel;
import com.example.onlineauctionsellingecommerce.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class ItemService {
    @Autowired
    private ItemRepository itemRepository;

    public ItemModel saveItem(ItemModel itemModel) {
        Item item = null;
        if (!ObjectUtils.isEmpty(itemModel))
            item = findbyCode(itemModel);
        if (ObjectUtils.isEmpty(item)) {
            item = itemModel.disassemble();
        } else {
            item.setCode(itemModel.getCode());
        }
        return itemModel.assemble(itemRepository.save(item));
    }

    public Item findbyCode(ItemModel itemModel) {
        Item item = null;
        if (!ObjectUtils.isEmpty(itemModel.getCode())) {
            item = itemRepository.findByCode(item.getCode());
        }
        return item;
    }
}
