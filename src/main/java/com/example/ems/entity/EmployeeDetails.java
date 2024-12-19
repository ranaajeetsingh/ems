package com.example.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails {
	@Id
	private Long id;
	@Column(name = "phone_number", length = 12)
	private Long phoneNumber;
	@Column(name = "address", length = 255)
	private String address;
	@Column(name = "salary")
	private double salary;
	@Column(name = "employee_id")
	@OneToOne(targetEntity = Employee.class)
	private Employee employee;
}
