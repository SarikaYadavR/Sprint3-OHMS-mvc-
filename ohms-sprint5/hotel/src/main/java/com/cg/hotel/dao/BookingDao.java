/**
 * 
 */
package com.cg.hotel.dao;

import com.cg.hotel.dto.BookingdetailsDTO;
import com.cg.hotel.dto.HoteldetailsDTO;
import com.cg.hotel.exceptions.Exceptionhandler;

/**
 * @author sarika
 *
 */
public interface BookingDao {


	public BookingdetailsDTO getBookingdetails(int bookingid) throws Exceptionhandler;

	boolean modifyCheckin(BookingdetailsDTO book) throws Exceptionhandler;

	boolean modifyCheckout(BookingdetailsDTO book) throws Exceptionhandler;
	
	public HoteldetailsDTO getHoteldetails(int hotelid) throws Exceptionhandler;


}
