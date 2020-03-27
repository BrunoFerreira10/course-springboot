package com.mun.course.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mun.course.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFoundException(ResourceNotFoundException resourceNotFoundException, HttpServletRequest httpServletRequest){
		String error = "Resource not found";
		HttpStatus httpStatus = HttpStatus.NOT_FOUND;
		StandardError standardError = new StandardError(
												Instant.now(), 
												httpStatus.value(), 
												error, 
												resourceNotFoundException.getMessage(), 
												httpServletRequest.getRequestURI());
		return ResponseEntity.status(httpStatus).body(standardError);
	}
}	
