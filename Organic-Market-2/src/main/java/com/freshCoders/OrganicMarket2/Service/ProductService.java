package com.freshCoders.OrganicMarket2.Service;

import com.freshCoders.OrganicMarket2.Entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {


   List<Product> all();

    Product save(Product product);

    Optional<Product> getById(Integer id);
}
