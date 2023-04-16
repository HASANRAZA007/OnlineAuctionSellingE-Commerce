package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.entity.Category;
import com.example.onlineauctionsellingecommerce.entity.UserRole;
import com.example.onlineauctionsellingecommerce.model.CategoryModel;
import com.example.onlineauctionsellingecommerce.repository.CategoryRepository;
import com.example.onlineauctionsellingecommerce.repository.UserRoleRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CategoryService implements ICategory {
    private final CategoryRepository categoryRepository;
    private final UserRoleRepository userRoleRepository;
    @Autowired
    public CategoryService(CategoryRepository categoryRepository, UserRoleRepository userRoleRepository) {
        this.categoryRepository = categoryRepository;
        this.userRoleRepository = userRoleRepository;
    }
    @Override
    public CategoryModel addCategory(CategoryModel categoryModel) {
        String categoryModelName = categoryModel.getName();
        Category isExist = categoryRepository.findByName(categoryModelName);
        if (isExist != null) {
        }
          return   categoryModel.assemble(categoryRepository.save(categoryModel.disassemble()));
    }

    @Override
    public List<CategoryModel> getCategories() {
        List<CategoryModel> categoryModelList=new ArrayList<>();
        for(Category category:categoryRepository.findAll()){
            categoryModelList.add(new CategoryModel().assemble(category));
        }
        return categoryModelList;
    }

    @Override
    public CategoryModel getCategoryByName(String name) {
        CategoryModel categoryModels=new CategoryModel();
        Category Category=categoryRepository.findByName(name);
       return categoryModels.assemble(Category);
    }
    @Override
    public String deleteCategory(String name) {
        categoryRepository.deleteByName(name);
        return "Category is Deleted.";
    }

    @Override
    public CategoryModel updateCategory(CategoryModel categoryModel,String name) {
        Category categoryExist=categoryRepository.findByName(categoryModel.getName());
        if(categoryExist==null){
            throw new EntityNotFoundException("Category not Exist");
        }
        else {
            categoryExist.setName(categoryModel.getName());
            return categoryModel.assemble(categoryRepository.save(categoryModel.disassemble()));
        }
    }
}
