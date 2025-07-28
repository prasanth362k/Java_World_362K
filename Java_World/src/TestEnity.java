package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // mean 
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Products {
	// java persistence API provides  a POJO persistence model for object-relationla mapping.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="description")
    private String description;
	
	@Column(name ="img")
	private String img;
	
	@Column(name ="price")
	private double price;
	
	@Column(name ="rating")
	private int rating;
	
	@Column(name ="stock")
	private int stock;
	
// 28.44
}
