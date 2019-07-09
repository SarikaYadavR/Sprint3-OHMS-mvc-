package com.cg.ohms.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


	@Entity
	@Table(name = "roomdetails")
	public class RoomDetails implements Serializable  {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		private int roomid;
		private int number_of_persons;
		private String roomtype;
		private double price;
	    private int hotelid; 
	    
		public RoomDetails() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getRoom_id() {
			return roomid;
		}
		public void setRoom_id(int room_id) {
			this.roomid = roomid;
		}
		public int getNumber_of_persons() {
			return number_of_persons;
		}
		public void setNumber_of_persons(int number_of_persons) {
			this.number_of_persons = number_of_persons;
		}
		public String getRoomtype() {
			return roomtype;
		}
		public void setRoomtype(String roomtype) {
			this.roomtype = roomtype;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getHotel_id() {
			return hotelid;
		}
		public void setHotel_id(int hotel_id) {
			this.hotelid = hotelid;
		}
		@Override
		public String toString() {
			return "RoomDetails [room_id=" + roomid + ", number_of_persons=" + number_of_persons + ", roomtype=" + roomtype
					+ ", price=" + price + ", hotel_id=" + hotelid + "]";
		}
}
