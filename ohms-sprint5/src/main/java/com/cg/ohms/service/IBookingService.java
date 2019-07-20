package com.cg.ohms.service;

import com.cg.ohms.dto.BookingdetailsDTO;
import com.cg.ohms.dto.HoteldetailsDTO;
import com.cg.ohms.service.impl.BookingServiceException;

/**
 * @author sarika
 *
 */
public interface IBookingService {
	
    public boolean modifyCheckin(BookingdetailsDTO book) throws BookingServiceException;

	public boolean modifyCheckout(BookingdetailsDTO book) throws BookingServiceException;

	public BookingdetailsDTO getBookingdetails(int bookingid) throws BookingServiceException;

	public HoteldetailsDTO getHoteldetails(int hotelid) throws BookingServiceException;

}
