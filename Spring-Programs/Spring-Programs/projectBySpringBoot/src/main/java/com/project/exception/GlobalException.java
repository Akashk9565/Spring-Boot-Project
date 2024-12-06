package com.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public Response resourceNotFoundException(ResourceNotFoundException ex){
		return new Response(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

}
