package com.osi.deptservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class DepartmentNotFoundException extends RuntimeException {
	private String resourseName;
	private String resourseField;
	private int  fieldValue;
	public DepartmentNotFoundException(String resourseName, String resourseField, int fieldValue) {
		super(String.format("%s is not found with '%s' : %s",resourseName,resourseField,fieldValue));
		this.resourseName = resourseName;
		this.resourseField = resourseField;
		this.fieldValue = fieldValue;
	}
	public String getResourseName() {
		return resourseName;
	}
	public void setResourseName(String resourseName) {
		this.resourseName = resourseName;
	}
	public String getResourseField() {
		return resourseField;
	}
	public void setResourseField(String resourseField) {
		this.resourseField = resourseField;
	}
	public long getFieldValue() {
		return fieldValue;
	}
	public void setFieldValue(int fieldValue) {
		this.fieldValue = fieldValue;
	}
	

}
