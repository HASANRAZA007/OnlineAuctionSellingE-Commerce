package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.Category;
import com.example.onlineauctionsellingecommerce.model.CategoryModel;
import com.example.onlineauctionsellingecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public String addCategory(CategoryModel categoryModel) {
        String status;
        String categoryModelName = categoryModel.getName();
        Category isExist = categoryRepository.findByName(categoryModelName);
        if (isExist != null) {
            status = "Category is already Exist";
        } else {
            categoryModel.assemble(categoryRepository.save(categoryModel.disassemble()));
            status = "Category is Successfully Saved.";
        }
        return status;
    }

    public void deleteCategory() {
        CategoryModel categoryModel = new CategoryModel();
        categoryRepository.deleteByName(categoryModel.getName());
    }

    public List<CategoryModel> findAllCategories() {
        List<CategoryModel> categoryModels = new ArrayList<>();
        List<Category> categories = categoryRepository.findAll();
        for (Category category : categories) {
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.assemble(category);
            categoryModels.add(categoryModel);
        }
        return categoryModels;
    }
}
