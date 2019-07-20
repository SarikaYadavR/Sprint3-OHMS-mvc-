package com.cg.ohms.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * BookingdetailsDTO
 * 
 * @author sarika
 *
 */
@Entity
@Table(name = "BookingDetail")
@Configuration
@ConfigurationProperties("oracle")
public class BookingdetailsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "Booking_ID", updatable = false, nullable = false)
	private Integer bookingid;

	@OneToOne
	@JoinColumn(name = "Hotelid")
	private HoteldetailsDTO hoteldetailsDTO;

	@Column(name = "Roomid")
	private Integer roomid;

	@Column(name = "Customerid")
	private Integer customerid;

	@Column(name = "Checkin")
	private Date checkin;

	@Column(name = "Checkout")
	private Date checkout;

	public BookingdetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingdetailsDTO(Integer bookingid, HoteldetailsDTO hoteldetailsDTO, Integer roomid, Integer customerid,
			Date checkin, Date checkout) {
		super();
		this.bookingid = bookingid;
		this.hoteldetailsDTO = hoteldetailsDTO;
		this.roomid = roomid;
		this.customerid = customerid;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	
	public Integer getBookingid() {
		return bookingid;
	}

	public HoteldetailsDTO getHoteldetailsDTO() {
		return hoteldetailsDTO;
	}

	public Integer getRoomid() {
		return roomid;
	}

	public Integer getCustomerid() {
		return customerid;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setBookingid(Integer bookingid) {
		this.bookingid = bookingid;
	}

	public void setHoteldetailsDTO(HoteldetailsDTO hoteldetailsDTO) {
		this.hoteldetailsDTO = hoteldetailsDTO;
	}

	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}

}