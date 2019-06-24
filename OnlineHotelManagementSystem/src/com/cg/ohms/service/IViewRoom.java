package com.cg.ohms.service;

import com.cg.ohms.exception.NoRoomAvailable;
import com.cg.ohms.exception.PersonExceedException;
import com.cg.ohms.exception.RoomAlreadyBookedException;
import com.cg.ohms.staticdb.ListData;

public interface IViewRoom {
	double viewRoomBooked(int roomtype,ListData listdata,int numberperson)throws PersonExceedException,RoomAlreadyBookedException,NoRoomAvailable;

}
