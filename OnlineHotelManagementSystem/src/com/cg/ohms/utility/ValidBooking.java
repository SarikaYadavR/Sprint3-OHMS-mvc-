package com.cg.ohms.utility;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.ohms.dao.Bookingdetails;
import com.cg.ohms.exception.BookingIdException;
import com.cg.ohms.staticdb.ListData;

public class ValidBooking {
	Bookingdetails bookingid;
	
	public boolean validBooking(int Bookingid )throws BookingIdException
	{
				    Pattern pattern = Pattern.compile("[0-9]");
				    Matcher matcher = pattern.matcher("678568");
				    if(!bookingid.matches())
				    {
				    	 throw new BookingIdException("Enter the valid BookingId");
				    }
				    else
				    {
				    	return true;
				    }
	}
	public int validBooking(int bookingid2, ListData listdata) {
		// TODO Auto-generated method stub
		return 0;
	}

}
	
				    	
				    		

