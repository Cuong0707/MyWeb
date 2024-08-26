package com.example.watchstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	private int ImageID;
	
	@Column(name = "ImagePath", nullable = false, length = 500)
	private String ImagePath;
	
	@Column(name = "IsPrimary", nullable = false)
	private boolean IsPrimary;
}
