package com.osi.deptservice.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osi.deptservice.DTO.DepartmentDto;
import com.osi.deptservice.entity.Department;
import com.osi.deptservice.repository.DepartmentRepository;

@Service
public class DepartmentServices {
      @Autowired
      private DepartmentRepository departmentRepository;
      
      @Autowired
      private ModelMapper mapper;
      
      public DepartmentDto saveDepattment(Department department ) {
    	  Department savedDepartment= new Department();
    	  savedDepartment.setDeptId(department.getDeptId());
    	  savedDepartment.setDeptName(department.getDeptName());
    	  savedDepartment.setDeptDescription(department.getDeptDescription());
    	  savedDepartment.setCode(department.getCode());
    	  departmentRepository.save(savedDepartment);
    	  DepartmentDto departmentDto= mapper.map(savedDepartment, DepartmentDto.class);
    	  return departmentDto;
      }
}
