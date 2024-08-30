package com.example.watchstore.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "Invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "invoice_id", nullable = false)
	private int invoiceId;
	
	@Column(name = "total_amount", nullable = false)
	private Double totalAmount;
	
	
	@Column(name = "create_at")
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createAt;
	
	@ManyToOne
	@JoinColumn(name = "custumer_id")
	@JsonBackReference
	private Custumer_details custumer_details;
	
	@ManyToOne
	@JoinColumn(name = "staff_id")
	@JsonBackReference
	private Staff_details staff_details;
	
	@OneToOne(mappedBy = "invoice",fetch = FetchType.LAZY)
	@JsonManagedReference
	private Orders orders;
}
