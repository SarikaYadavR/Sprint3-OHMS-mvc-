package com.cg.ohms.utility;

import com.cg.ohms.exception.RoomNameException;
import com.cg.ohms.staticdb.ListData;

public class ValidRoom {
	public int validRoomType(String typename, ListData listdata)throws RoomNameException
	{
		 for(int i=0;i<listdata.typeOfRoom().size();i++)
		 {
			 String check=(String) listdata.typeOfRoom().get(i);
			// System.out.println(name.toUpperCase());
			 if(typename.toUpperCase().equals(check.toUpperCase()))
				 return ++i;
		 }
		 
		throw new RoomNameException("Enter Room Type Properly");
	}

}
