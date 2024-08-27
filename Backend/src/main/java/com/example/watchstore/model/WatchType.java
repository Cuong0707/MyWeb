package com.example.watchstore.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "WatchType")
public class WatchType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TypeID", nullable = false)
	private int typeID;
	
	@Column(name = "TypeName",nullable = false, length = 100)
	private String typeName;
	
	@OneToMany(mappedBy = "WatchType",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Product> products;
}
