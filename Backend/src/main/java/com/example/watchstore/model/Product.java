package com.example.watchstore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ProductID", nullable = false)
	private int productId;
	
	@Column(name = "ProductName", nullable = false, length = 200)
	private String productName;
	
	@Column(name = "Price",nullable = false)
	private Double price;
	
	@Column(name = "Color",nullable = false, length = 50)
	private String color;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "ImagePath", length = 500)
	private String imagePath;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "BranchID")
	private Brand branch;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "GenderID")
	private Gender gender;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "TypeID")
	private WatchType watchType;
	
	@ManyToMany(mappedBy = "products")
	@JsonBackReference
	private List<Banner> banners;
	
	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<ProductImage> productImages;
	
	@OneToMany(mappedBy = "product", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Order_details> order_details;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "MaterialID")
	private Material material;
}
