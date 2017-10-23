package com.ms3.customexception;

/**
 * 
 * @author anuja
 *	Custom exception class for error code 412
 */
public class PreconditionFailedException extends Exception{

	private static final long serialVersionUID = 1L;

	 public  PreconditionFailedException(String message) {
	        super(message);
	    }
	
}
