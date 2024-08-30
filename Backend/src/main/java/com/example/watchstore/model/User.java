package com.example.watchstore.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;

import com.example.watchstore.enums.Role;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Getter
@Setter
@Entity
@Table(name = "Users")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id",nullable = false)
	private int userId;
	
	@Column(name = "username", nullable = false, length = 50)
	private String userName;
	
	@Column(name = "password",nullable = false, length = 255)
	private String passWord;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "role",nullable = false, length = 20)
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@Column(name = "created_at")
	@CreatedDate
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdAt;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	@JsonManagedReference
	private List<Banner> banners;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
	private Custumer_details custumer_details;
	
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
	private Staff_details employee_details;
	
}
