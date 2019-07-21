package com.cg.hotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.hotel.dto.BookingdetailsDTO;
import com.cg.hotel.dto.HoteldetailsDTO;
import com.cg.hotel.exceptions.Exceptionhandler;
import com.cg.hotel.service1.IBookingService;


@RestController
public class HmsController {
	@Autowired
	private IBookingService bookingservice;

	public void setBookingservice(IBookingService bookingservice) {
		this.bookingservice = bookingservice;
	}
	/**
	 * @param bookingid
	 * @return BookingdetailsDTO
	 */

	@GetMapping(value = "/view/{id}", produces = "application/json")
	public BookingdetailsDTO getBookingDetails(@PathVariable("id") int bookingid) {
		BookingdetailsDTO bookingdetails = new BookingdetailsDTO();

		try {
			bookingdetails = bookingservice.getBookingdetails(bookingid);

		} catch (Exceptionhandler e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bookingdetails;
	}
	/** 
	 * @param bookingdetailsdto
	 * @return boolean
	 */

	@RequestMapping(value = "/modifyCheckin", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyCheckin(@RequestBody BookingdetailsDTO dto)  {
		boolean flag=false;
		try {
			flag = bookingservice.modifyCheckin(dto);
		} catch (Exceptionhandler e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;

	}
	/**
	 * @param bookingdetailsdto
	 * @return boolean
	 */

	@RequestMapping(value = "/modifyCheckout", method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
	public boolean modifyCheckout(@RequestBody BookingdetailsDTO dto)  {
		boolean flag=false;
		try {
			flag = bookingservice.modifyCheckout(dto);
		} catch (Exceptionhandler e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;

	}
	
	@GetMapping(value = "/view/{id}", produces = "application/json")
	public HoteldetailsDTO getHotelDetails(@PathVariable("id") int hotelid) {
		HoteldetailsDTO hoteldetails = new HoteldetailsDTO();

		try {
			hoteldetails = bookingservice.getHoteldetails(hotelid);

		} catch (Exceptionhandler e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hoteldetails;
	}
}   
