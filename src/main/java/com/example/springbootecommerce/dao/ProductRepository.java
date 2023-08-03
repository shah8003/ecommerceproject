package com.example.springbootecommerce.dao;

import com.example.springbootecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category" )
public interface ProductRepository extends JpaRepository<Product, Long> {
}
