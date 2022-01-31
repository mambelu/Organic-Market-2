package com.freshCoders.OrganicMarket2.Service;

import com.freshCoders.OrganicMarket2.Entity.Product;
import com.freshCoders.OrganicMarket2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{
    final ProductRepository productRepository;


    public ProductServiceImpl(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> all() {
        List<Product> result = new ArrayList<>();
        productRepository.findAll().forEach( result::add );
        return result;

    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Optional<Product> getById(Integer id) {
        Optional<Product> productById = this.productRepository.findById(id);
        if(!productById.isPresent()){
          return null;
        }
        return this.productRepository.findById(id);
    }
}
