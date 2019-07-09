package com.cg.ohms.service;

import com.cg.ohms.entity.Booking;

public interface IBookingService {
	
	 //public abstract void getBooking();
	public abstract Booking getBookingDetails();
		
	public abstract void updateBookingDetails(Booking booking);

	//Booking getBookingDetails(Integer bookingid);

}
