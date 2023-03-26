package com.example.onlineauctionsellingecommerce.controller;

import com.example.onlineauctionsellingecommerce.model.CategoryModel;
import com.example.onlineauctionsellingecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("add-category")
    public CategoryModel addCategory(@RequestBody CategoryModel categoryModel){
        return categoryService.addCategory(categoryModel);
    }
}
