package com.example.watchstore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "Material")
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MaterialID", nullable = false)
	private int MaterialID;
	
	@Column(name = "MaterialName", nullable = false, length = 100)
	private String MaterialName;
	
	@OneToMany(mappedBy = "material")
	@JsonBackReference
	private List<Product> products;
	
	@OneToMany(mappedBy = "material")
	@JsonBackReference
	private List<Accessory> accessorys;
}
