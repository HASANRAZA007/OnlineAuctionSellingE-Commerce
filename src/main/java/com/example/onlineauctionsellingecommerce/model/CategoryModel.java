package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.Category;
import lombok.Data;

@Data
public class CategoryModel {
    private Long id;
    private String name;
    public Category disassemble(){
        Category category =new Category();
        category.setName(name);
        return category;
    }
    public CategoryModel assemble(Category category){
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setId(category.getId());
        categoryModel.setName(category.getName());
        return categoryModel;
    }
}
