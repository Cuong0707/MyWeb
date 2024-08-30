package com.example.watchstore.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "custumer_details")
public class Custumer_details implements Serializable{
	@Id
	@Column(name = "custumer_id")
	private int custumerId;
	
	@Column(name = "fullname", nullable = false, length = 100)
	private String fullName;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "phone_number", length = 15)
	private String phoneNumber;
	
	@Column(name = "address",length = 255)
	private String address;
	
	@OneToOne
	@JoinColumn(name = "custumer_id", referencedColumnName = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "custumer_details",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Invoice> invoices;
	
	
}
