package com.cg.ohms.ui;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.ohms.dao.BookRoomDetails;
import com.cg.ohms.dao.Bookingdetails;
import com.cg.ohms.dao.HotelDetails;
import com.cg.ohms.exception.AreaNameException;
import com.cg.ohms.exception.BookingIdException;
import com.cg.ohms.exception.CityNameException;
import com.cg.ohms.exception.DateCheckInException;
import com.cg.ohms.exception.DateCheckOutException;
import com.cg.ohms.exception.HotelNameException;
import com.cg.ohms.exception.NoRoomAvailable;
import com.cg.ohms.exception.PersonExceedException;
import com.cg.ohms.exception.RoomAlreadyBookedException;
import com.cg.ohms.exception.RoomNameException;
import com.cg.ohms.service.IBookRoom;
import com.cg.ohms.staticdb.ListData;
import com.cg.ohms.utility.ValidBooking;
import com.cg.ohms.utility.ValidCity;
import com.cg.ohms.utility.ValidHotel;
import com.cg.ohms.utility.ValidRoom;


public class HmsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListData listdata = new ListData();
		//ValidCity validcity = new ValidCity();
		//HotelDetails h;
		//ValidHotel validhotel=new ValidHotel();
		ValidBooking validid=new ValidBooking();
		ValidRoom validroom=new ValidRoom();
		BookRoomDetails bookroomdetails=new BookRoomDetails();
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.println("WELCOME TO ONLINE HOTEL BOOKING SYSTEM");
//		System.out.println("Press 1 for Booking");
		System.out.println("Press 1 to View Booking");
    	System.out.println("Press 2 to Modify Booking"); 
	//	System.out.println("Press 2 to Cancel Booking");
		try
		{
		n = sc.nextInt();
		switch (n) {
		case 1:
		    System.out.println("View the Bookings");
		    System.out.println("Enter the BookingID:");
		    int bookingid=sc.nextInt();
			for(int i=0;i<listdata.bookingId().size();i++)
			{
			if(listdata.bookingId().get(i).equals(Integer.valueOf(bookingid)))
				{
				
				System.out.println("OKAY!");
				int bookedid =sc.nextInt();
				com.cg.ohms.dao.Bookingdetails bd=(com.cg.ohms.dao.Bookingdetails)listdata.bookingDetailList().get(0);
				
				System.out.println(bd.getBookingid());
				System.out.println(bd.getCheckinbook());
				System.out.println(bd.getCheckoutbook());
				System.out.println(bd.getPrice());
		 
				}}
		 case 2:
	    System.out.println("Modify the Bookings");
	    System.out.println("Enter the BookingID:");
	    int bookedid =sc.nextInt();
		for(int i=0;i<listdata.bookingId().size();i++)
			System.out.println(listdata.bookingId().get(i));
		System.out.println("Enter the BookingID:");
		sc.nextLine(); 
		}
		}
		
			
//		case 1:
//			System.out.println("List Of City");
//			for (int i = 0; i < listdata.cityList().size(); i++)
//				System.out.println(listdata.cityList().get(i));
//			System.out.println("Enter the Location");
//			sc.nextLine();
//			String cityname = sc.next();
//			int j = validcity.validCityName(cityname);
//			if (j != 0) {
//				System.out.println("List Of Area in " + cityname.toUpperCase());
//				if (j == 1) {
//					for (int i = 0; i < listdata.areaListPune().size(); i++)
//						System.out.println(listdata.areaListPune().get(i));
//					System.out.println("Enter the Area");
//					sc.nextLine();
//					String areaname = sc.next();
//					int area = validcity.validAreaName(areaname, j);
//					
//				}
//				if (j == 2) {
//					for (int i = 0; i < listdata.areaListJaipur().size(); i++)
//						System.out.println(listdata.areaListJaipur().get(i));
//					System.out.println("Enter the Area");
//					sc.nextLine();
//					String areaname = sc.next();
//					int area = validcity.validAreaName(areaname, j);
//					
//				}
//				if (j == 3) {
//					for (int i = 0; i < listdata.areaListMumbai().size(); i++)
//						System.out.println(listdata.areaListMumbai().get(i));
//					System.out.println("Enter the Area");
//					sc.nextLine();
//					String areaname = sc.next();
//					int area = validcity.validAreaName(areaname, j);
//				}
//				if (j == 4) {
//					for (int i = 0; i < listdata.areaListDelhi().size(); i++)
//						System.out.println(listdata.areaListDelhi().get(i));
//					System.out.println("Enter the Area");
//					sc.nextLine();
//					String areaname = sc.next();
//					int area = validcity.validAreaName(areaname, j);
//				}
//				System.out.println("Enter the Hotel");
//				for (int i = 0; i < listdata.hotelList().size(); i++) {
//					h=(HotelDetails)listdata.hotelList().get(i);
//					System.out.println(h.getHotelname());
//				}
			//System.out.println("Enter the Hotel Name");
			//sc.nextLine();
			//String hotelname = sc.next();
//			int bookingidnum = validid.validBooking(bookingid,listdata);
//	        if(bookingidnum==1)
//	        {
//		      System.out.println(listdata.hotelList().get(1));
//	        }

//			System.out.println("List of Room Available");
//				for (int i = 0; i < listdata.typeOfRoom().size(); i++)
//					System.out.println(listdata.typeOfRoom().get(i));
//				System.out.println("Enter Room type you want");
//				sc.nextLine();
//				String room=sc.next();
//				int roomtype=validroom.validRoomType(room,listdata);
//				if(roomtype!=0) {
//					System.out.println("Enter Check In Date");
//					String datecheckin=sc.next();
//					if(BookingInput.dateCheckIn(datecheckin,bookroomdetails))
//					{
//						
//						System.out.println(bookroomdetails.getCheckin());
//					}
//					System.out.println("Enter Check Out Date");
//					if(BookingInput.dateCheckout(sc.next(), bookroomdetails.getCheckin(),bookroomdetails))
//					{
//						System.out.println(bookroomdetails.getCheckout());
//					}
//					System.out.println("Enter Number of Persons");
//					int numberperson=sc.nextInt();
//					IBookRoom bookroom=new BookRoomImpl();
//					
//					double bookingid=bookroom.bookRoom(roomtype,listdata,numberperson);
//					double id=bookingid*1000000;
//					System.out.println("Your BookingId is:"+
//					bookingid);
//				}
//					
//				

			
//		
//		
//		
//			
//		
//
//			break;
//
//		default:
//			break;
//		}
		
//		catch (CityNameException cne) {
//			// TODO: handle exception
//			System.out.println(cne.getMessage());
//		}
//		catch (AreaNameException ane) {
//			// TODO: handle exception
//			System.out.println(ane.getMessage());
//		}
//		catch (HotelNameException hne) {
//			// TODO: handle exception
//			System.out.println(hne.getMessage());
//		}
//		catch (RoomNameException rne) {
//			// TODO: handle exception
//			System.out.println(rne.getMessage());
//		}
//		catch (DateCheckInException dce) {
//			// TODO: handle exception
//			System.out.println(dce.getMessage());
//		}
//		catch (DateCheckOutException dcoe) {
//			// TODO: handle exception
//			System.out.println(dcoe.getMessage());
//		}
//		catch (PersonExceedException pee) {
//			// TODO: handle exception
//			System.out.println(pee.getMessage());
//		}
//		catch (RoomAlreadyBookedException rabe) {
//			// TODO: handle exception
//			System.out.println(rabe.getMessage());
//		}
//		catch (NoRoomAvailable nre) {
//			// TODO: handle exception
//			System.out.println(nre.getMessage());
//		}
//		catch (BookingIdException bie) {
//			// TODO: handle exception
//		System.out.println(bie.getMessage());
//		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Enter Data in proper format");
		}

	}

	
}




