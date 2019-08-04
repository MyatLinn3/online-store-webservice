package com.babystore.controller;

import com.babystore.model.Product;
import com.babystore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;



    @PostMapping(value="/add")
    public Product addBookPost(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping(value="/{productName}")
    public List<Product> searchByName(@PathVariable String productName) {
        return  productService.blurrySearch(productName);
    }
    @RequestMapping("/productList")
    public List<Product> getBookList() {
        return productService.findAll();
    }

    @RequestMapping(value="/update", method= RequestMethod.POST)
    public Product updateBookPost(@RequestBody Product book) {
        return productService.save(book);
    }


    @RequestMapping(value="/remove", method=RequestMethod.POST)
    public ResponseEntity remove(
            @RequestBody String id
    ) throws IOException {
        productService.removeOne(Integer.parseInt(id));
        return new ResponseEntity("Remove Success!", HttpStatus.OK);
    }

    @RequestMapping("/{id}")
    public Optional<Product> getBook(@PathVariable("id") int id){
        Optional<Product> book = productService.findById(id);
        return book;
    }
}
