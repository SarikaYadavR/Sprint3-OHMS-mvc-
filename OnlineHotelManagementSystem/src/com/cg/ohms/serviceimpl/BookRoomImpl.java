package com.cg.ohms.serviceimpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import com.cg.ohms.dao.Bookingdetails;
import com.cg.ohms.dao.KingRoomDetails;
import com.cg.ohms.exception.NoRoomAvailable;
import com.cg.ohms.exception.PersonExceedException;
import com.cg.ohms.exception.RoomAlreadyBookedException;
import com.cg.ohms.service.IBookRoom;
import com.cg.ohms.staticdb.ListData;


import com.cg.ohms.staticdb.*;

public class BookRoomImpl implements IBookRoom {
	List<Bookingdetails> bookingdetails=Bookingdetails.

public boolean modify(int bookingId,Date checkin,Date checkout,double price)

{
	boolean flag;
	flag=false;
//	ListData.();
	if(!ListData.bookdetail.isEmpty()) 
	{
		for(Bookingdetails bd:ListData.bookdetail) {
			if(bd.getBookingid()==bookingId)
				
			{
				bd.setCheckinbook(checkout);
				bd.setCheckoutbook(checkin);
				bd.setPrice(price);
				flag=true;
				break;
			}
		}}
	return flag;
	}

@Override
public void view() {
	// TODO Auto-generated method stub
	
}

@Override
public void modify() {
	// TODO Auto-generated method stub
	
}
}
//public List<Bookingdetails> view()
//{
//	//ListData.add();
//	List <b>booklist=new
// List<Bookingdetails> bookdetail=new ArrayList<>();
//	bookdetail.addAll(ListData.bookingDetailList());
//	return bookdetail;
//	

//@Override
//public void view() {
//	// TODO Auto-generated method stub
//	
//}
//
//@Override
//public void modify() {
//	// TODO Auto-generated method stub
//	
//}
//	
//	
//}



