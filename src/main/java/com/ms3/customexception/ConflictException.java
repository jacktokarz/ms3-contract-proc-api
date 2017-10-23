package com.ms3.customexception;

/**
 * 
 * @author anuja
 * Custom class for error code 409
 */

public class ConflictException extends Exception{
	
   public static final long serialVersionUID = 1L;
   public ConflictException(String errormsg)
   {
	   super(errormsg);
   }
}
