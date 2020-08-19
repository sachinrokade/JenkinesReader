package com.jenkiens.exception;

import java.util.Date;

import lombok.Data;


@Data
public class CustomeExceptionResponse {

	int status;
	Date timestamp;
	String detalis;
	
}
