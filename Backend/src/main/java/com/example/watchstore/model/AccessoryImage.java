package com.example.watchstore.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table(name = "AccessoryImage")
public class AccessoryImage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ImageID", nullable = false )
	private int imageID;
	
	@Column(name = "ImagePath", nullable = false, length = 500)
	private String imagePath;
	
	@Column(name = "IsPrimary", nullable = false)
	private boolean isPrimary;
	
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "AccessoryID")
	private Accessory accessory;
}
