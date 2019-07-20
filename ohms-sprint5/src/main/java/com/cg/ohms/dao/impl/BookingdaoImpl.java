package com.cg.ohms.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ohms.dao.BookingDao;
import com.cg.ohms.dto.BookingdetailsDTO;
import com.cg.ohms.dto.HoteldetailsDTO;
import com.cg.ohms.service.impl.BookingServiceException;


/**
 * @author sarika
 *
 */
@Repository
@Transactional
public class BookingdaoImpl implements BookingDao {

	@PersistenceContext
	EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	BookingdetailsDTO book=new BookingdetailsDTO();

	/**
	 * method to view BookingdetailsDTO
	 * @param bookingid
	 * return BookingdetailsDTO
	 */

	public BookingdetailsDTO getBookingdetails(int bookingid) throws BookingServiceException
	{
		return entityManager.find(BookingdetailsDTO.class,bookingid);
	}

	/**
	 * method to modify checkinDate
	 * @param BookingdetailsDTO
	 * return boolean
	 */

	public boolean modifyCheckin(BookingdetailsDTO book) throws BookingServiceException {
		//entityManager.close();
		boolean flag = false;
		BookingdetailsDTO bookDto = entityManager.find(BookingdetailsDTO.class,book.getBookingid());
		System.out.println(bookDto.getBookingid());
		if (bookDto != null) {
			bookDto.setCheckin(book.getCheckin());

			flag = true;
		}
		//entityManager.merge(book);
		//flag = true;
		return flag;
	}

	/**
	 * method to modify checkoutDate
	 * @param BookingdetailsDTO
	 * return boolean 
	 */

	public boolean modifyCheckout(BookingdetailsDTO book) throws BookingServiceException {

		boolean flag = false;


		BookingdetailsDTO bookDto = entityManager.find(BookingdetailsDTO.class, book.getBookingid());
		System.out.println(bookDto.getBookingid());
		if (bookDto != null) {
			bookDto.setCheckout(book.getCheckout());
			flag = true;
		}
		return flag;
	}

	@Override
	public HoteldetailsDTO getHoteldetails(int hotelid) throws BookingServiceException {
		// TODO Auto-generated method stub
		 return entityManager.find(HoteldetailsDTO.class,hotelid);

	}



}
