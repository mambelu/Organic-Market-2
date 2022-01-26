package com.freshCoders.OrganicMarket2.Controller;

import com.freshCoders.OrganicMarket2.Entity.Product;
import com.freshCoders.OrganicMarket2.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Product")
public class ProductController {

     final ProductService productService;

    public ProductController(@Autowired ProductService productService ){
        this.productService=productService;

    }


    @GetMapping
    public List<Product> getAllProduct(){

        return productService.all();
    }
//    @PostMapping
//    public Product addProduct(@RequestBody Product product){
//
//        return productRepository.save(product);// need to be replace with productService
//    }
}
