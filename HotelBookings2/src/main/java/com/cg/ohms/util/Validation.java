/**
 * 
 */
package com.cg.ohms.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cg.ohms.exception.DateCheckInException;
import com.cg.ohms.exception.DateCheckOutException;
import com.google.protobuf.TextFormat.ParseException;

/**
 * @author trainee
 *
 */
public class Validation {
	final static String DATE_FORMAT="dd-mm-yyyy";
	static DateFormat dateformat=new SimpleDateFormat(DATE_FORMAT);
	
	public boolean dateCheckin(Date checkin) throws Exception
	{
		try
		{
			dateformat.setLenient(false);
			dateformat.format(checkin);
			
			
			DateFormat newPattern=new SimpleDateFormat("dd-mm-yyyy");
			String currentdatestring= newPattern.format(new Date());
			Date currentdate=new SimpleDateFormat("dd-mm-yyyy").parse(currentdatestring);
			
			if(currentdate.compareTo(checkin) >0 || currentdate.compareTo(checkin)==0) {
				return true;
			}
			
		throw new DateCheckInException(ExceptionMessages.WRONG_DATE);
		}catch(Exception e) {
			throw new ParseException(ExceptionMessages.WRONG_DATE);
		}
	}

	public boolean dateCheckout(Date checkinDate,Date checkoutDate)throws DateCheckOutException {
		dateformat.format(checkinDate);
		dateformat.format(checkoutDate);
		dateformat.setLenient(false);
		if(checkoutDate.compareTo(checkinDate)>0 || checkoutDate.compareTo(checkinDate)==0)
		{
			return true;
		}	
			throw new DateCheckOutException(ExceptionMessages.WRONG_DATE);
		
		
		
	}
}
