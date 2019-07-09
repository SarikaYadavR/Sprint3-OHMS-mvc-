package com.cg.ohms.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BookingDetail")
public class Booking implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  
	@Id
	@Column(name = "Booking_ID", unique = true)
	private Integer bookingid;

	@Column(name = "Hotelid")
	private Integer hotelid;

	@Column(name = "Roomid")
	private Integer roomid;
	
	@Column(name="Customerid")
	private Integer customerid;
	
	@Column(name="Checkin")
	private LocalDate checkin;
	
	@Column(name="Checkout")
	private LocalDate checkout;
	
	//@Column(name="Roomdetails")
    @JoinColumn(name="roomid")
	@OneToMany( targetEntity=RoomDetails.class )
	private List<RoomDetails> roomdetails=new ArrayList<RoomDetails>();
	
	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
  
   public Booking(Integer bookingid, Integer hotelid, Integer roomid, Integer customerid, LocalDate checkin,
			LocalDate checkout, RoomDetails roomdetails) {
		super();
		this.bookingid = bookingid;
		this.hotelid = hotelid;
		this.roomid = roomid;
		this.customerid = customerid;
		this.checkin = checkin;
		this.checkout = checkout;
		this.roomdetails = (List<RoomDetails>) roomdetails;
	}
public Integer getBookingid() {
		return bookingid;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}

	public Integer getHotelid() {
		return hotelid;
	}

	public void setHotelid(Integer hotelid) {
		this.hotelid = hotelid;
	}

	public Integer getRoomid() {
		return roomid;
	}

	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}
	
	public Integer getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}
	
	public LocalDate getCheckin() {
		return checkin;
	}

	public void setCheckin(LocalDate checkin) {
		this.checkin = checkin;
	}
	
	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}
	
	public List<RoomDetails> getRoomdetails() {
		return roomdetails;
	}
	
	public void setRoomdetails(List<RoomDetails> roomdetails) {
		this.roomdetails = roomdetails;
	}
	@Override
		public String toString() {
			return "Booking [bookingid=" + bookingid + ", hotelid=" + hotelid + ", roomid=" + roomid + ", customerid="
					+ customerid + ", checkin=" + checkin + ", checkout=" + checkout + "]";
		}
}