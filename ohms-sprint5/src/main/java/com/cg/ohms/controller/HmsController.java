package com.cg.ohms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ohms.dto.BookingdetailsDTO;
import com.cg.ohms.dto.HoteldetailsDTO;
import com.cg.ohms.service.IBookingService;
import com.cg.ohms.service.impl.BookingServiceException;

@RestController
@Configuration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
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

		} catch (BookingServiceException e) {
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
		} catch (BookingServiceException e) {
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
		} catch (BookingServiceException e) {
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

		} catch (BookingServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hoteldetails;
	}
}   
