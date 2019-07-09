/**
 * 
 */
package com.cg.ohms.bookingdao;

import java.time.LocalDate;

import com.cg.ohms.entity.Booking;

/**
 * @author trainee
 *
 */
public interface Bookingdao {
	
public abstract Booking getBookingDetails();
	


public abstract void changehotelid(Integer bookingid,LocalDate checkin);

}
