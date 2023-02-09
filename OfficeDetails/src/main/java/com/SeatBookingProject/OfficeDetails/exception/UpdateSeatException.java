package com.SeatBookingProject.OfficeDetails.exception;

public class UpdateSeatException  extends RuntimeException{
public UpdateSeatException() {
	super("Seat is not available to Update");	
	}

	@Override
	public String toString() {
		return "Seat is not available  to update";
	}


}
