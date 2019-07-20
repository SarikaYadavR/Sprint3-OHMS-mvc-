package com.cg.onlinehotelmanagementsystem.service;

import com.cg.onlinehotelmanagementsystem.dto.BookingdetailsDTO;
import com.cg.onlinehotelmanagementsystem.dto.HoteldetailsDTO;
import com.cg.onlinehotelmanagementsystem.exception.ExceptionHandler;

/**
 * @author sarika
 *
 */
public interface IBookingService {
	
    public boolean modifyCheckin(BookingdetailsDTO book) throws ExceptionHandler;

	public boolean modifyCheckout(BookingdetailsDTO book) throws ExceptionHandler;

	public BookingdetailsDTO getBookingdetails(int bookingid) throws ExceptionHandler;

	public HoteldetailsDTO getHoteldetails(int hotelid) throws ExceptionHandler;

}
