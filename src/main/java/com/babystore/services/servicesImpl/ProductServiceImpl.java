package com.babystore.services.servicesImpl;

import com.babystore.model.Product;
import com.babystore.repository.ProductRepository;
import com.babystore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(int id) {
        return  productRepository.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> blurrySearch(String keywory) {
        return null;
    }

    @Override
    public void removeOne(int id) {

        productRepository.deleteById(id);

    }
}
