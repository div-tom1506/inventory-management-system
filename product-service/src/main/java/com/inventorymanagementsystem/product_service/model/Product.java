package com.inventorymanagementsystem.product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Product {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String description;
	private int quantityInStock;
	private int lowStockThreshold;
	private double price;
	
	@ManyToOne
	private Category category;
}
