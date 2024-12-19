package com.example.ems.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	private String name;
	private String email;
	private String designation;
	private EmployeeDetailsDto employeeDetails;
	private List<ProjectDto> projects;
}
