package com.cg.ohms.utility;

import com.cg.ohms.dao.HotelDetails;
import com.cg.ohms.exception.HotelNameException;
import com.cg.ohms.staticdb.ListData;

public class ValidHotel {
	HotelDetails hotel;

	public int validHotelName(String name, ListData listdata)throws HotelNameException{
		for (int i = 0; i < listdata.hotelList().size(); i++) {

			hotel = (HotelDetails) listdata.hotelList().get(i);
//System.out.println(name.toUpperCase());
			if (name.toUpperCase().equals(hotel.getHotelname().toUpperCase()))
				return ++i;
		}
		throw new HotelNameException("Enter Hotel Name Properly");
		

	}
}
