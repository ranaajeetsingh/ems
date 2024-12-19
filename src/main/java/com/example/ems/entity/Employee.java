package com.example.ems.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	private Long id;
	@Column(name = "name", length = 50)
	private String name;
	@Column(name = "email", length = 255)
	private String email;
	@Column(name = "designation", length = 50)
	private String designation;
	@OneToOne(targetEntity = EmployeeDetails.class, fetch = FetchType.EAGER)
	private EmployeeDetails employeeDetails;
	@OneToMany(targetEntity = Project.class, fetch = FetchType.EAGER)
	private List<Project> projects;
}
