/**
 * 
 */
package com.cg.ohms.dao;

import com.cg.ohms.dto.BookingdetailsDTO;
import com.cg.ohms.dto.HoteldetailsDTO;
import com.cg.ohms.service.impl.BookingServiceException;

/**
 * @author sarika
 *
 */
public interface BookingDao {


	public BookingdetailsDTO getBookingdetails(int bookingid) throws BookingServiceException;

	boolean modifyCheckin(BookingdetailsDTO book) throws BookingServiceException;

	boolean modifyCheckout(BookingdetailsDTO book) throws BookingServiceException;
	
	public HoteldetailsDTO getHoteldetails(int hotelid) throws BookingServiceException;


}
