package com.cg.hotel.service1;

import com.cg.hotel.dto.BookingdetailsDTO;
import com.cg.hotel.dto.HoteldetailsDTO;
import com.cg.hotel.exceptions.Exceptionhandler;

/**
 * @author sarika
 *
 */
public interface IBookingService {
	
    public boolean modifyCheckin(BookingdetailsDTO book) throws Exceptionhandler;

	public boolean modifyCheckout(BookingdetailsDTO book) throws Exceptionhandler;

	public BookingdetailsDTO getBookingdetails(int bookingid) throws Exceptionhandler;

	public HoteldetailsDTO getHoteldetails(int hotelid) throws Exceptionhandler;

}
