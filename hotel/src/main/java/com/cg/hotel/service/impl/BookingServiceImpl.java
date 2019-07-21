package com.cg.hotel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hotel.dao.BookingDao;
import com.cg.hotel.dto.BookingdetailsDTO;
import com.cg.hotel.dto.HoteldetailsDTO;
import com.cg.hotel.exceptions.Exceptionhandler;
import com.cg.hotel.service1.IBookingService;




/**
 * @author sarika
 *
 */
@Service
public class BookingServiceImpl implements IBookingService {
	@Autowired
	BookingDao bookingDao;
    

	public void setBookingDao(BookingDao bookingDao) {
		this.bookingDao = bookingDao;
	}
	/**
	 * method to view BookingdetailsDTO
	 * @param bookingid
	 * return BookingdetailsDTO
	 */

	@Override
	public BookingdetailsDTO getBookingdetails(int bookingid) throws Exceptionhandler {

		return bookingDao.getBookingdetails(bookingid);
	}

	/**
	 * method to modify checkinDate
	 * @param BookingdetailsDTO
	 * return boolean
	 */

	public boolean modifyCheckin(BookingdetailsDTO book) throws Exceptionhandler {
		// TODO Auto-generated method stub
		boolean flag;
		flag = false;
		if (bookingDao.modifyCheckin(book)) {
			flag = true;
		}
		return flag;
	}
	/**
	 * method to modify checkoutDate
	 * @param BookingdetailsDTO
	 * return boolean 
	 */

	public boolean modifyCheckout(BookingdetailsDTO book) throws Exceptionhandler {
		// TODO Auto-generated method stub
		boolean flag;
		flag = false;
		if (bookingDao.modifyCheckout(book)) {
			flag = true;
		}
		return flag;
	}
	@Override
	public HoteldetailsDTO getHoteldetails(int hotelid) throws Exceptionhandler {
		// TODO Auto-generated method stub
		return bookingDao.getHoteldetails(hotelid);
	}


}
