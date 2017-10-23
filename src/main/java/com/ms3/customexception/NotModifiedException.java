package com.ms3.customexception;

/**
 * 
 * @author anuja
 * Custom exception class for 304  code
 */

public class NotModifiedException extends Exception{

	
	private static final long serialVersionUID = 1L;

	 public NotModifiedException(String message) {
	        super(message);
	    }
	
}
