package com.cg.ohms.service.impl;

import com.cg.ohms.bookingdao.Bookingdao;
import com.cg.ohms.dao.Impl.BookingdaoImpl;
import com.cg.ohms.entity.Booking;
import com.cg.ohms.service.IBookingService;

public class BookingServiceImpl implements IBookingService {

private Bookingdao dao;

public BookingServiceImpl() {
	dao = new BookingdaoImpl();
}

	@Override
	public Booking getBookingDetails() {
		// TODO Auto-generated method stub
		Booking booking  = dao.getBookingDetails();
		return booking;
		
		
	}

	@Override
	public void updateBookingDetails(Booking booking) {
		// TODO Auto-generated method stub
		
	}
	
	

}
