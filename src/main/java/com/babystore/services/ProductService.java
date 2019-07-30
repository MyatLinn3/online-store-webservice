package com.babystore.services;

import com.babystore.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAll();
    Optional<Product> findById(int id);
    Product save(Product product);
    List<Product> blurrySearch(String keywory);
    void removeOne(int id);


}
