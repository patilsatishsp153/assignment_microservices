package com.osi.deptservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.osi.deptservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
