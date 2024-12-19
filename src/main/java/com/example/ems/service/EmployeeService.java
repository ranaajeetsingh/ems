package com.example.ems.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.dto.EmployeePojectCountDto;
import com.example.ems.dto.ProjectDto;

@Service
public class EmployeeService {

	public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<EmployeeDto> getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<List<EmployeePojectCountDto>> getEmployeeWithPojectCount() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResponseEntity<List<ProjectDto>> getProjectByEmployeeId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
