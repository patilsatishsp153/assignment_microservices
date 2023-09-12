package com.osi.deptservice.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.osi.deptservice.DTO.ErrorMessage;
@ControllerAdvice
public class ApplicationException {

	public ResponseEntity<ErrorMessage> handleResourceNotFoundException(DepartmentNotFoundException resourceNotFoundException,WebRequest webRequest){
		 ErrorMessage ErrorMessage = new ErrorMessage(new Date(), resourceNotFoundException.getMessage(), webRequest.getDescription(false));
		 return new ResponseEntity<>(ErrorMessage,HttpStatus.NOT_FOUND);
	}
         
        //general exception 
        	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> handleAnyException(Exception exception,WebRequest webRequest){
		 ErrorMessage ErrorMessage = new ErrorMessage(new Date(), exception.getMessage(), webRequest.getDescription(false));
		 return new ResponseEntity<>(ErrorMessage,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
