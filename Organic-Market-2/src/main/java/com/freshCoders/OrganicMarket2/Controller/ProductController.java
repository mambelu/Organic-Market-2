package com.freshCoders.OrganicMarket2.Controller;

import com.freshCoders.OrganicMarket2.Entity.Product;
import com.freshCoders.OrganicMarket2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Product")
public class ProductController {

    final ProductRepository productRepository;
    public ProductController(@Autowired ProductRepository productRepository ){
        this.productRepository=productRepository;

    }
//    public ProductController(){
//
//    }

    @GetMapping
    public Iterable<Product>getAllProduct(){
        return productRepository.findAll();
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
