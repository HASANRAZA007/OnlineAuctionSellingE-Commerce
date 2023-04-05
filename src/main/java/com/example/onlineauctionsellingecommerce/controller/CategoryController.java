package com.example.onlineauctionsellingecommerce.controller;
import com.example.onlineauctionsellingecommerce.model.CategoryModel;
import com.example.onlineauctionsellingecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("add-category")
    public String addCategory(@RequestBody CategoryModel categoryModel){
         return categoryService.addCategory(categoryModel);
    }
    @DeleteMapping("delete-category")
    public void delete(@RequestParam String name){
        categoryService.deleteCategory();
    }
    @GetMapping("category-list")
    public List<CategoryModel> getAll(){
        return categoryService.findAllCategories();
    }
}
