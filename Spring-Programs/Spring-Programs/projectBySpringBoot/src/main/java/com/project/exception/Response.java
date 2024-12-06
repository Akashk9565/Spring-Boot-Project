package com.project.exception;

import org.springframework.http.HttpStatus; 

public class Response{

	private String message;
	
	private HttpStatus status;

	public Response(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	
	
	
}
