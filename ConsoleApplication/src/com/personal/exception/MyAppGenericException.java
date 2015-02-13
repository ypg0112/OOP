package com.personal.exception;

public abstract class MyAppGenericException extends Exception {

	public MyAppGenericException(String message, Throwable cause) {
		super(message,cause);	
	}
	
	public MyAppGenericException(String message) {
		super(message);	
	}
	
	//template design pattern
}
