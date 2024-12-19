package com.example.ems.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
	@Id
	private Long id;
	@Column(name = "project_name", length = 50)
	private String projectName;
	@CreationTimestamp
	@Column(name = "start_date")
	private Date startDate;
	@UpdateTimestamp
	@Column(name = "end_date")
	private Date endDate;
	@Column(name = "employee_id")
	@ManyToOne(targetEntity = Employee.class )
	private Employee employee;
}
