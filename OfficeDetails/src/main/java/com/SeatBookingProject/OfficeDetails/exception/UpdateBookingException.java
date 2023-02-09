package com.SeatBookingProject.OfficeDetails.exception;

import java.util.Arrays;

public class UpdateBookingException extends RuntimeException{
	
	public UpdateBookingException() {
		super("tickets updated");
	}

	@Override
	public String toString() {
		return "UpdateBookingException ";
	}
	

}
