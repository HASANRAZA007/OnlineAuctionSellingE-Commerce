package com.example.onlineauctionsellingecommerce.model;

import com.example.onlineauctionsellingecommerce.entity.Category;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CategoryModel {
    private Long id;
    private String name;
    private UserRole userRole;
    public Category disassemble(){
        Category category =new Category();
        category.setName(name);
        category.setUserRole(userRole);
        return category;
    }
    public CategoryModel assemble(Category category){
        CategoryModel categoryModel=new CategoryModel();
        categoryModel.setId(category.getId());
        categoryModel.setName(category.getName());
        categoryModel.setUserRole(category.getUserRole());
        return categoryModel;
    }
}
