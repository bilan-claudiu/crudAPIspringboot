package com.springapi.springbootcrud.repository;

import com.springapi.springbootcrud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

    Product findByName(String name);
}
