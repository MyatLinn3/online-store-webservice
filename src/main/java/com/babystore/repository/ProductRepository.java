package com.babystore.repository;

import com.babystore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    List<Product> findByProductName(String productName);
    List<Product> findByProductNameContains(String keyword);
}
