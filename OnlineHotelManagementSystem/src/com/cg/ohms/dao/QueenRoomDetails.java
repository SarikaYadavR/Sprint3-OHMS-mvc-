package com.cg.ohms.dao;

public class QueenRoomDetails {
	int numberofqueenrooms;
	Boolean status;
	double price;
	int numberofperson;
	public QueenRoomDetails(int numberofqueenrooms, Boolean status, double price, int numberofperson) {
		super();
		this.numberofqueenrooms = numberofqueenrooms;
		this.status = status;
		this.price = price;
		this.numberofperson = numberofperson;
	}
	public int getNumberofqueenrooms() {
		return numberofqueenrooms;
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
