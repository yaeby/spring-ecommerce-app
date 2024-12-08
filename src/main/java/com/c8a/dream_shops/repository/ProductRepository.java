package com.c8a.dream_shops.repository;

import com.c8a.dream_shops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryName(String categoryName);
    List<Product> findByBrand(String brand);
    List<Product> findByCategoryNameAndBrand(String categoryName, String brand);
    List<Product> findByName(String productName);
    List<Product> findByBrandAndName(String brand, String productName);
    Long countByBrandAndName(String brand, String productName);
    boolean existsByNameAndBrand(String name, String brand);
}
