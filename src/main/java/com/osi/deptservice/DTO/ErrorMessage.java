package com.osi.deptservice.DTO;

import java.util.Date;

public class ErrorMessage {
	private Date timeStamp;
	  private String message;
	  private String Details;
	public ErrorMessage(Date timeStamp, String message, String details) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
		Details = details;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return Details;
	}
	  

}
