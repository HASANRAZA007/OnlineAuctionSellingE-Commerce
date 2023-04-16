package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.model.CategoryModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ICategory {

    CategoryModel addCategory(CategoryModel categoryModel);
    List<CategoryModel> getCategories();
    CategoryModel getCategoryByName(String name);
    String deleteCategory(String name);
    CategoryModel updateCategory(CategoryModel  categoryModel, String name);
}
