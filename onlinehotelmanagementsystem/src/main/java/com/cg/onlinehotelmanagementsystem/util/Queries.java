/**
 * 
 */
package com.cg.onlinehotelmanagementsystem.util;

/**
 * @author trainee
 *
 */
public class Queries {

	public static final String GETBOOKINGDETAILS="Select booking from BookingdetailsDTO booking where bookingid=?";

	public static final String MODIFYCHECKIN="Update FROM BOOKINGDETAILS WHERE BOOKINGID=?";

	public static final String MODIFYCHECKOUT="Update FROM BOOKINGDETAILS WHERE BOOKINGID=?";
	
	public static final String GETHOTELDETAILS="Select hotel from hoteldetailsDTO hotel where hotel.hotel_rating IN(8.5,8.0)";
	
	public static final String GETHOTELDETAILSLOW="Select hotel from hoteldetailsDTO hotel where hotel.hotel_rating IN(7.5,0)";
	}
