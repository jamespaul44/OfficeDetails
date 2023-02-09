package com.SeatBookingProject.OfficeDetails.exception;

public class AddOfficeException extends RuntimeException {
	
	public AddOfficeException() {
		super("missing some details");
	}

	@Override
	public String toString() {
		return "missing some details";
	}
	
	
	

}
