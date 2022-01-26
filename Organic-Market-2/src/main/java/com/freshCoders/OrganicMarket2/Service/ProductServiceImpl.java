package com.freshCoders.OrganicMarket2.Service;

import com.freshCoders.OrganicMarket2.Entity.Product;
import com.freshCoders.OrganicMarket2.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    final ProductRepository productRepository;


    public ProductServiceImpl(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> all() {
        return null;
    }

    @Override
    public Product save(Product product) {
        return null;
    }
}
