package com.c8a.dream_shops.repository;

import com.c8a.dream_shops.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
    Boolean existsByName(String name);
}
