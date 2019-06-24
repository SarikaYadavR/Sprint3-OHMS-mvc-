package com.cg.ohms.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cg.ohms.dao.BookRoomDetails;
import com.cg.ohms.exception.DateCheckInException;
import com.cg.ohms.exception.DateCheckOutException;

public class  BookingInput {
	
	public static boolean dateCheckIn(String checkin,BookRoomDetails bookroomdetails)throws DateCheckInException
	{
		try {
		Date checkindate=new SimpleDateFormat("dd-MM-yyyy").parse(checkin); 
		DateFormat newPattern = new SimpleDateFormat("dd-MM-yyyy");
	    String currentdatestring=newPattern.format(new Date());
	    Date currentdate=new SimpleDateFormat("dd-MM-yyyy").parse(currentdatestring);
	    if(currentdate.compareTo(checkindate)<0||currentdate.compareTo(checkindate)==0)
	    {
	    	
  	System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(checkindate));
	    	System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(currentdate));
	    	
	    	String s=new SimpleDateFormat("dd-MM-yyyy").format(checkindate);
	    	bookroomdetails.setCheckin(checkindate);
	    	return true;
	    }
	    throw new DateCheckInException("This Date is not valid");
	    }
		catch (ParseException e) {
			// TODO: handle exception
			System.out.println("This Date is not valid");
			
		}
		
	return false;

}
	public static boolean dateCheckout(String checkout,Date checkindate,BookRoomDetails bookroomdetails)throws DateCheckOutException
	{
		try {
			Date checkoutdate=new SimpleDateFormat("dd-MM-yyyy").parse(checkout); 
			
		if(checkoutdate.compareTo(checkindate)>0||checkoutdate.compareTo(checkindate)==0)
	    {
			
	    	bookroomdetails.setCheckout(checkoutdate);
	    	return true;
	    }
		throw new DateCheckOutException("This Date is not valid");
	    }
		catch (ParseException e) {
			// TODO: handle exception
			System.out.println("This Date is not valid");
		}
		return false;
	

}
	}
