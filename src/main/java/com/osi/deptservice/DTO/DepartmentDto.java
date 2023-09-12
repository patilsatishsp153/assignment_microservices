package com.osi.deptservice.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
	private long deptId;
	private String deptName;
	private String deptDescription;
	private String code;
}
