package com.cg.ohms.serviceimpl;

import com.cg.ohms.exception.NoRoomAvailable;
import com.cg.ohms.exception.PersonExceedException;
import com.cg.ohms.exception.RoomAlreadyBookedException;
import com.cg.ohms.service.IViewRoom;
import com.cg.ohms.staticdb.ListData;

public class ViewRoomImpl implements IViewRoom {
	public double viewRoom(int roomtype, ListData listdata, int numberperson)
			throws PersonExceedException, RoomAlreadyBookedException, NoRoomAvailable {
				return numberperson;
		

}

	@Override
	public double viewRoomBooked(int roomtype, ListData listdata, int numberperson)
			throws PersonExceedException, RoomAlreadyBookedException, NoRoomAvailable {
		// TODO Auto-generated method stub
		return 0;
	}
}
