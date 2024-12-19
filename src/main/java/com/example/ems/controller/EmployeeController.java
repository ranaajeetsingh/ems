package com.example.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.dto.EmployeePojectCountDto;
import com.example.ems.dto.ProjectDto;
import com.example.ems.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("employees/{id}")
	public ResponseEntity<EmployeeDto> getEmployeeById(Long id) {
		return employeeService.getEmployeeById(id);
	}

	@GetMapping("/employees/projects")
	public ResponseEntity<List<EmployeePojectCountDto>> getEmployeeWithPojectCount() {
		return employeeService.getEmployeeWithPojectCount();
	}

	@GetMapping("/employees/{id}/projects")
	public ResponseEntity<List<ProjectDto>> getProjectByEmployeeId(Long id) {
		return employeeService.getProjectByEmployeeId(id);
	}
}
