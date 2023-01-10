package com.microservice.prodcutservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Expense {

	@Id
	private String id;
	private String name;
	private Category category;
	private BigDecimal amount;
	
	public Expense() {
		// TODO Auto-generated constructor stub
	}

	public Expense(String id, String name, Category category, BigDecimal amount) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
