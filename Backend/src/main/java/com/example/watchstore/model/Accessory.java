package com.example.watchstore.model;



import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Accessory")
public class Accessory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AccessoryID", nullable = false)
	private int accessoryID;
	
	@Column(name = "AccessoryName",nullable = false , length = 200 )
	private String accessoryName;
	
	@ManyToOne
	@JoinColumn(name = "MaterialID")
	@JsonBackReference
	private Material material;
	
	@Column(name = "Price", nullable = false)
	private Double price;
	
	@Column(name = "Color", nullable = false, length = 50)
	private String color;
	
	@Column(name = "Description")
	private String description;
	
	@Column(name = "ImagePath", length = 500)
	private String imagePath;
	
	@OneToMany(mappedBy = "accessory", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<AccessoryImage> accessoryImages;
	
	
}
