package com.microservice.prodcutservice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.prodcutservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	public List<Product> findByNameLike(String name);
}
