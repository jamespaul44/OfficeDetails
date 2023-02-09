package com.SeatBookingProject.OfficeDetails.exception;

import java.util.Arrays;

public class UpdateCredentialsException extends RuntimeException{
	public UpdateCredentialsException() {
		super("updated credentials");
	}

	@Override
	public String toString() {
		return "updated credentials";
	}
	
	
	

}
