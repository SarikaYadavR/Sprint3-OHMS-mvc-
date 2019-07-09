package com.cg.ohms.dao.Impl;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.cg.ohms.bookingdao.Bookingdao;
import com.cg.ohms.entity.Booking;
import com.cg.ohms.util.Connect;

public class BookingdaoImpl implements Bookingdao {
	
	public void addBooking()
	{
		EntityManager entityManager=Connect.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		//Booking booking = new Booking(344,234,433,234);
		//entityManager.persist(booking);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
		
	
	public Booking getBookingDetails()
	{
		EntityManager entityManager=Connect.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Booking booking = entityManager.find(Booking.class,678568);
		
		
		System.out.println("Bookingid is : " + booking.getBookingid());
		System.out.println("Hotelid is : " + booking.getHotelid());
		System.out.println("Roomid is : " + booking.getRoomid());
		System.out.println("Customerid is : " + booking.getCustomerid());
		System.out.println("Checkin Date is : " + booking.getCheckin());
		System.out.println("Checkout Date is : " + booking.getCheckout());
		System.out.println("Roomdetails are : " + booking.getRoomdetails());
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		return booking;
	}


	@SuppressWarnings("null")
	public  void changehotelid(Integer bookingid, LocalDate checkin)
	{
		
		EntityManager entityManager=Connect.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		@SuppressWarnings("unused")
		Booking booking = entityManager.find(Booking.class,bookingid);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateInstance();

		String formattedDate = dateFormat.format(date);

		
		
		//if()
		
		
		

//		Booking book=null;
		try
		{
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
////			Integer hotelid = null;
//			book.setHotelid(hotelid);
//			System.out.println(""+hotelid);
			entityManager.persist(checkin);
			entityTransaction.commit();
		}catch(Exception ex) {
			if(entityTransaction!=null)
			{
				entityTransaction.rollback();
		}ex.printStackTrace();
		}finally {
			entityManager.close();
	}
	}

//
//	@Override
//	public void changehotelid(Integer bookingid, LocalDate checkin) {
//		// TODO Auto-generated method stub
//		
//	}
}






//if(booking!=null) {
//	
//	booking.setBookingid(123456);
//}
//
//
//Query query= entityManager.createQuery("Select b from Bookingdetail b");
//List<Bookingdetail> list=new Arraylist<>();




	
	


