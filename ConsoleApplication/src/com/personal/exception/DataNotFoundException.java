package com.personal.exception;

public class DataNotFoundException extends MyAppGenericException {

	public DataNotFoundException(String message, Throwable cause) {
		super(message,cause);	
	}
	
	public DataNotFoundException(String message) {
		super(message);	
	}
}
