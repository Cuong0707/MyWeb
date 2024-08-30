package com.example.watchstore.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "order_details")
public class Order_details {
	@Id
	@GeneratedValue
	@Column(name = "order_detail_id",nullable = false)
	private int orderdetailId;
	
	@Column(name = "quantity", nullable = false)
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	@JsonBackReference
	private Orders orders;
	
	@ManyToOne
	@JoinColumn(name = "ProductID")
	@JsonBackReference
	private Product product;
}
