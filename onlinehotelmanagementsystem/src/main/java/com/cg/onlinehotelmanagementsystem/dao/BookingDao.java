/**
 * 
 */
package com.cg.onlinehotelmanagementsystem.dao;

import com.cg.onlinehotelmanagementsystem.dto.BookingdetailsDTO;
import com.cg.onlinehotelmanagementsystem.dto.HoteldetailsDTO;
import com.cg.onlinehotelmanagementsystem.exception.ExceptionHandler;


/**
 * @author sarika
 *
 */
public interface BookingDao {


	public BookingdetailsDTO getBookingdetails(int bookingid) throws ExceptionHandler;

	boolean modifyCheckin(BookingdetailsDTO book) throws ExceptionHandler;

	boolean modifyCheckout(BookingdetailsDTO book) throws ExceptionHandler;
	
	public HoteldetailsDTO getHoteldetails(int hotelid) throws ExceptionHandler;


}
