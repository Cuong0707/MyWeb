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
@Table(name = "WatchType")
public class WatchType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TypeID", nullable = false)
	private int TypeID;
	
	@Column(name = "TypeName",nullable = false, length = 100)
	private String TypeName;
}
