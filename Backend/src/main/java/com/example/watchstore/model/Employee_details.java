package com.example.watchstore.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "employee_details")
public class Employee_details implements Serializable{
	@Id
	@Column(name = "employee_id")
	private int employeeId;
	
	@Column(name = "fullname", nullable = false, length = 100)
	private String fullName;
	
	@Column(name = "department", length = 100)
	private String department;
	
	@Column(name = "position", length = 100)
	private String position;
	
	@OneToOne
	@JoinColumn(name = "employee_id", referencedColumnName = "user_id")
	private User user;
}
