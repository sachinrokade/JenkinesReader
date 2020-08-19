package com.jenkiens.advice;

import java.net.ConnectException;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jenkiens.exception.CustomeExceptionResponse;
import com.jenkiens.exception.NoConfigFoundException;
import com.jenkiens.exception.NoFailedJobException;
import com.jenkiens.service.NoPluginSpecifieException;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(HttpClientErrorException.class)
	public ResponseEntity<CustomeExceptionResponse> handelHttpClientErrorEx(Exception ex,WebRequest web){
		
		CustomeExceptionResponse cost=new CustomeExceptionResponse();
		cost.setDetalis(ex.getMessage());
		cost.setStatus(HttpStatus.NO_CONTENT.value());
		cost.setTimestamp(new Date());
		return new ResponseEntity<CustomeExceptionResponse>(cost,HttpStatus.SERVICE_UNAVAILABLE);
		
	}
	
	
	@ExceptionHandler(NoConfigFoundException.class)
	public ResponseEntity<CustomeExceptionResponse> handelNotConfigExp(Exception ex,WebRequest web){
		
		CustomeExceptionResponse cost=new CustomeExceptionResponse();
		cost.setDetalis(ex.getMessage());
		cost.setStatus(HttpStatus.SERVICE_UNAVAILABLE.value());
		cost.setTimestamp(new Date());
		return new ResponseEntity<CustomeExceptionResponse>(cost,HttpStatus.SERVICE_UNAVAILABLE);
		
	}
	
	@ExceptionHandler(NoFailedJobException.class)
	public ResponseEntity<CustomeExceptionResponse> handelNoFailedJobException(Exception ex,WebRequest web){
		
		CustomeExceptionResponse cost=new CustomeExceptionResponse();
		cost.setDetalis(ex.getMessage());
		cost.setStatus(HttpStatus.NOT_IMPLEMENTED.value());
		cost.setTimestamp(new Date());
		return new ResponseEntity<CustomeExceptionResponse>(cost,HttpStatus.NOT_IMPLEMENTED);
		
	}
	
	@ExceptionHandler(NoPluginSpecifieException.class)
	public ResponseEntity<CustomeExceptionResponse> handelAllException(Exception ex,WebRequest web){
		
		CustomeExceptionResponse cost=new CustomeExceptionResponse();
		cost.setDetalis(ex.getMessage());
		cost.setStatus(HttpStatus.NOT_IMPLEMENTED.value());
		cost.setTimestamp(new Date());
		return new ResponseEntity<CustomeExceptionResponse>(cost,HttpStatus.NOT_IMPLEMENTED);
		
	}
	@ExceptionHandler(ConnectException.class)
	public ResponseEntity<CustomeExceptionResponse> handelConnectException(Exception ex,WebRequest web){
		
		CustomeExceptionResponse cost=new CustomeExceptionResponse();
		cost.setDetalis(ex.getMessage());
		cost.setStatus(HttpStatus.SERVICE_UNAVAILABLE.value());
		cost.setTimestamp(new Date());
		return new ResponseEntity<CustomeExceptionResponse>(cost,HttpStatus.SERVICE_UNAVAILABLE);
		
	}

}
