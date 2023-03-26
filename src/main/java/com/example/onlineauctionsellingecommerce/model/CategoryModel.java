package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.Category;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CategoryModel {
    private Long id;
    private String name;
    private UserModel userModel;
    public Category disassemble(){
        Category category =new Category();
        category.setName(name);
        return category;
    }
    public CategoryModel assemble(Category category){
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setName(category.getName());
        categoryModel.setId(category.getId());
        return categoryModel;
    }
}
