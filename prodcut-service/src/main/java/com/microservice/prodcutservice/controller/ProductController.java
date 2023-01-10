package com.microservice.prodcutservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.prodcutservice.model.Product;
import com.microservice.prodcutservice.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	// post request
	// curl -H "Content-Type: application/json" -X POST http://localhost:8080/api/expense -d "{\"id\":\"id1\", \"name\":\"nam1\", \"category\":\"FOOD\", \"amount\":\"222\"}"
	// curl -H "Content-Type: application/json" -X PUT http://localhost:8080/api/expense -d "{\"id\":\"id1\", \"name\":\"new-nam1\", \"category\":\"FOOD\", \"amount\":\"222\"}"
	// curl -H "Content-Type: application/json" -X DELETE http://localhost:8080/api/expense/id1

	
	@PostMapping
	public ResponseEntity<Product> addProduct(@RequestBody Product product) {
		this.service.addProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
	
	@PutMapping
	public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
		this.service.updateProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(product);
	}
	
	@DeleteMapping("/{id}")
	public void delteProduct(@PathVariable String id) {
		this.service.delteProduct(id);
	}
	
	
	@GetMapping("/{name}")
	public ResponseEntity<List<Product>> findByName(@PathVariable String name) {
		return ResponseEntity.ok(this.service.findByName(name));
	}
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		return ResponseEntity.ok(this.service.findAll());
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hello wolrd";
	}
}
