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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Gender")
public class Gender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "GenderID", nullable = false)
	private int GenderID;
	
	@Column(name = "GenderName",nullable = false, length = 50)
	private String GenderName;
}
