package com.microservice.prodcutservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.prodcutservice.model.Product;
import com.microservice.prodcutservice.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repo;
	
	public void addProduct(Product product) {
		this.repo.insert(product);
	}
	
	
	public void updateProduct(Product product) {
		Product dbProduct =  this.repo.findById(product.getId()).orElseThrow(() -> new RuntimeException("expense not found"));
		dbProduct.setPrice(product.getPrice());
		dbProduct.setName(product.getName());
		dbProduct.setCategory(product.getCategory());
		this.repo.save(dbProduct);
	}
	
	
	public void delteProduct(String id) {
		this.repo.deleteById(id);
	}
	
	
	public List<Product> findByName(String name) {
		return this.repo.findByNameLike(name);
	}
	
	public List<Product> findAll() {
		return this.repo.findAll();
	}
	
}
