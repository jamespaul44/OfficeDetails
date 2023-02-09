package com.SeatBookingProject.OfficeDetails.exception;

public class AddCredentialsException extends RuntimeException{
	
	public AddCredentialsException() {
		super("missing some credentials");
	}

	@Override
	public String toString() {
		return "AddCredentialsException";
	}
	

}
