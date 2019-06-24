package com.cg.ohms.dao;



public class HotelDetails {
	int hotelid;
	String hotelname;
	String hoteladdress;
	int numberofrooms;
    
	public HotelDetails(int hotelid, String hotelname, String hoteladdress, int numberofrooms) {
		super();
		this.hotelid = hotelid;
		this.hotelname = hotelname;
		this.hoteladdress = hoteladdress;
		this.numberofrooms = numberofrooms;
		
		
		
	}
	public int getHotelid() {
		return hotelid;
	}
	public String getHotelname() {
		return hotelname;
	}
	public String getHoteladdress() {
		return hoteladdress;
	}
	public int getNumberofrooms() {
		return numberofrooms;
	}
	
	
	@Override
	public String toString() {
		return "Hotel Id=" + hotelid + ", Hotel Address=" + hoteladdress
				+ ", Number of rooms=" + numberofrooms;
	}
	
	}
	
    
    
    
	


