package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ems.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
