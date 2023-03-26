package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.Category;
import com.example.onlineauctionsellingecommerce.model.CategoryModel;
import com.example.onlineauctionsellingecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryModel addCategory(CategoryModel categoryModel) {
        Category category = null;
        if (!ObjectUtils.isEmpty(categoryModel)) {
            category = findByName(categoryModel);
            if (ObjectUtils.isEmpty(category)) {
                category = categoryModel.disassemble();
            } else
            {
                category.setName(categoryModel.getName());
            }
        }
        return categoryModel.assemble(categoryRepository.save(category));
    }

    public Category findByName(CategoryModel categoryModel) {
        Category category = null;
        if (!ObjectUtils.isEmpty(categoryModel.getName())) {
            category = categoryRepository.findByName(category.getName());
        }
        return category;
    }
}
