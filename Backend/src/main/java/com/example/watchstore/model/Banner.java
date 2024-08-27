package com.example.watchstore.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Banner")
public class Banner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "banner_id", nullable = false)
	private int bannerId;
	
	@Column(name = "created_at")
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdAt;
	
	@Column(name = "subject", length = 100)
	private String subject;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "product_id",
			joinColumns = @JoinColumn(name = "banner_id"),
			inverseJoinColumns = @JoinColumn(name = "productId")
	)
	@JsonManagedReference
	private List<Product> products;
	
	@ManyToOne
	@JoinColumn(name = "user")
	@JsonBackReference
	private User user;
	
	
}
