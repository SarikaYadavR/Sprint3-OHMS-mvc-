package com.cg.ohms.dao;

import java.util.Date;

public class Bookingdetails {
	
	

int bookingid;
Date checkinbook;
Date checkoutbook;
double price;

public Bookingdetails(int bookingid, Date checkinbook, Date checkoutbook, double price) {
	super();
	this.bookingid = bookingid;
	this.checkinbook = checkinbook;
	this.checkoutbook = checkoutbook;
	this.price = price;
}

public int getBookingid() {
	return bookingid;
}
public void setBookingid(int bookingid) {
	this.bookingid = bookingid;
}
public Date getCheckinbook() {
	return checkinbook;
}
public void setCheckinbook(Date checkinbook) {
	this.checkinbook = checkinbook;
}
public Date getCheckoutbook() {
	return checkoutbook;
}
public void setCheckoutbook(Date checkoutbook) {
	this.checkoutbook = checkoutbook;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}




}

	

	


