package com.cg.ohms.dao;

public class ACRoomDetails {
	int numberofacrooms;
	Boolean status;
	double price;
	int numberofperson;
	public ACRoomDetails(int numberofacrooms, Boolean status, double price, int numberofperson) {
		super();
		this.numberofacrooms = numberofacrooms;
		this.status = status;
		this.price = price;
		this.numberofperson = numberofperson;
	}
	public int getNumberofacrooms() {
		return numberofacrooms;
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
