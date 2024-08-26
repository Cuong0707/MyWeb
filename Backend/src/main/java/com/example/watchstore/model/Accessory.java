package com.example.watchstore.model;



import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
	private int AccessoryID;
	
	@Column(name = "AccessoryName",nullable = false , length = 200 )
	private String AccessoryName;
	
	@ManyToOne
	@JoinColumn(name = "MaterialID")
	@JsonBackReference
	Material material;
	
	@Column(name = "Price", nullable = false)
	private Double Price;
	
	@Column(name = "Color", nullable = false, length = 50)
	private String Color;
	
	@Column(name = "Description")
	private String Description;
	
	@Column(name = "ImagePath", length = 500)
	private String ImagePath;
	
}
