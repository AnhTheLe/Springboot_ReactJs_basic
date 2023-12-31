package com.example.integratedchatgpt_backend.service;

import com.example.integratedchatgpt_backend.dto.ProductQuantityDTO;
import com.example.integratedchatgpt_backend.entity.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {

    List<CategoryEntity> getAllCategories();
    Page<CategoryEntity> getAllCategoriesByName(String name, Pageable pageable);
    Optional<CategoryEntity> getCategoryById(Long id);
    CategoryEntity createNewCategory(CategoryEntity category);
    void updateCategory(CategoryEntity category);
    void deleteCategory(Long id);
    List<ProductQuantityDTO> sortByQuantityOfProduct();
}
