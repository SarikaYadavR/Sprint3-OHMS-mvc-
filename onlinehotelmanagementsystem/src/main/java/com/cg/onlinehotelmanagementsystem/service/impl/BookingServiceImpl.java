package com.cg.onlinehotelmanagementsystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlinehotelmanagementsystem.dao.BookingDao;
import com.cg.onlinehotelmanagementsystem.dto.BookingdetailsDTO;
import com.cg.onlinehotelmanagementsystem.dto.HoteldetailsDTO;
import com.cg.onlinehotelmanagementsystem.exception.ExceptionHandler;
import com.cg.onlinehotelmanagementsystem.service.IBookingService;

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
	public BookingdetailsDTO getBookingdetails(int bookingid) throws ExceptionHandler {

		return bookingDao.getBookingdetails(bookingid);
	}

	/**
	 * method to modify checkinDate
	 * @param BookingdetailsDTO
	 * return boolean
	 */

	public boolean modifyCheckin(BookingdetailsDTO book) throws ExceptionHandler {
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

	public boolean modifyCheckout(BookingdetailsDTO book) throws ExceptionHandler {
		// TODO Auto-generated method stub
		boolean flag;
		flag = false;
		if (bookingDao.modifyCheckout(book)) {
			flag = true;
		}
		return flag;
	}
	@Override
	public HoteldetailsDTO getHoteldetails(int hotelid) throws ExceptionHandler {
		// TODO Auto-generated method stub
		return bookingDao.getHoteldetails(hotelid);
	}


}
