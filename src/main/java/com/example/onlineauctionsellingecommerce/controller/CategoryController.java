package com.example.onlineauctionsellingecommerce.controller;
import com.example.onlineauctionsellingecommerce.model.CategoryModel;
import com.example.onlineauctionsellingecommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/category")
public class CategoryController {
    private final CategoryService categoryService;
    @Autowired
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping(path="/addCategory")
    public CategoryModel addCategory(@RequestBody CategoryModel categoryModel){
         return categoryService.addCategory(categoryModel);
    }
    @GetMapping(path = "/getCategories")
    public List<CategoryModel> getCategories(){
        return categoryService.getCategories();
    }
    @GetMapping(path = "/getCategoryByName/{categoryName}")
    public CategoryModel getByName(@PathVariable(name = "categoryName") String name){
        return categoryService.getCategoryByName(name);
    }
    @PutMapping(path = "/updateCategory/{name}")
    public CategoryModel update(@RequestBody CategoryModel categoryModel, @PathVariable(name = "name") String name){
        return  categoryService.updateCategory(categoryModel,name);
    }

}
