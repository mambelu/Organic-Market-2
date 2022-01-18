package com.freshCoders.OrganicMarket2.Repository;

import com.freshCoders.OrganicMarket2.Entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
