package com.cg.ohms.dao;

public class NonACRoomDetails {
	int numberofnonacrooms;
	Boolean status;
	double price;
	int numberofperson;
	public NonACRoomDetails(int numberofnonacrooms, Boolean status, double price, int numberofperson) {
		super();
		this.numberofnonacrooms = numberofnonacrooms;
		this.status = status;
		this.price = price;
		this.numberofperson = numberofperson;
	}
	public int getNumberofnonacrooms() {
		return numberofnonacrooms;
	}
	public Boolean getStatus() {
		return status;
	}
	public double getPrice() {
		return price;
	}
	public int getNumberofperson() {
		return numberofperson;
	}
	
}
