package com.freshCoders.OrganicMarket2.Controller;

import com.freshCoders.OrganicMarket2.Entity.Product;
import com.freshCoders.OrganicMarket2.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Product")
public class ProductController {

     final ProductService productService;

    public ProductController(@Autowired ProductService productService ){
        this.productService=productService;

    }


    @GetMapping("/listProduct")
    public List<Product> getAllProduct(){

        return productService.all();
    }
    @PostMapping("/createProduct")
    public Product addProduct(@RequestBody Product product){

        return productService.save(product);
    }

    @GetMapping("/listProduct/{id}")
    public Optional<Product> getProductById(@PathVariable ("id") Integer id){
        return productService.getById(id);
    }


}
