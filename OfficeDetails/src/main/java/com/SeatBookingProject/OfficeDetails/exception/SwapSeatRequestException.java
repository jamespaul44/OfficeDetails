package com.SeatBookingProject.OfficeDetails.exception;
public class SwapSeatRequestException  extends RuntimeException{
	
	public SwapSeatRequestException() {
		super("Swap Request Cannot be sent");	
		}

		@Override
		public String toString() {
			return "Swap Request Cannot  be sent";
		}

}
