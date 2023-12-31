package com.example.integratedchatgpt_backend.service;

import com.example.integratedchatgpt_backend.dto.ProductSellTotalDTO;
import com.example.integratedchatgpt_backend.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
     List<ProductEntity> getAllProducts();
     Page<ProductEntity> getAllProducts(Pageable pageable);
     Optional<ProductEntity> getProductById(Long id);
     Page<ProductEntity> getAllProductsByName(String name, Pageable pageable);
     Page<ProductEntity> filterProduct(String name, Long category_id, Long inventory_id, Pageable pageable);
     ProductEntity createNewProduct(ProductEntity product);
     void updateProduct(ProductEntity product);
     List<ProductEntity> findByCategoryId(Long category_id);
     List<ProductEntity> findByInventoryId(Long inventory_id);

     void deleteProduct(Long id);
     List<ProductSellTotalDTO> getProductsListBestSellingEntity(Integer parameters);
}
