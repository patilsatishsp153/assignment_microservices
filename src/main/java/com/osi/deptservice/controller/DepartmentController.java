package com.osi.deptservice.controller;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.osi.deptservice.DTO.DepartmentDto;
import com.osi.deptservice.entity.Department;
import com.osi.deptservice.services.DepartmentServices;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentServices departmentServices;
	@PostMapping("/add")
	public ResponseEntity<DepartmentDto> addBook(@RequestBody Department department) {
		return new ResponseEntity<>(departmentServices.saveDepattment(department), HttpStatus.CREATED);
    }
}
