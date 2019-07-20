/**
 * 
 */
package com.cg.onlinehotelmanagementsystem.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author sarika
 *
 */
@Entity
@Table(name = "hoteldetails")
public class HoteldetailsDTO implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		@Id
		@Column(name = "hotelid")
		private int hotelId;
		@Column(name = "hotelname")
		private String hotelName;
		@Column(name = "hoteladdress")
		private String hotelAddress;
		@Column(name = "number_of_rooms")
		private int numOfRooms;
        @Column(name="guestRating")
		private String guestRating;

		public HoteldetailsDTO() {

		}

		public HoteldetailsDTO(int hotelId, String hotelName, String hotelAddress, int numOfRooms,String guestRating) {
			super();
			this.hotelId = hotelId;
			this.hotelName = hotelName;
			this.hotelAddress = hotelAddress;
			this.numOfRooms = numOfRooms;
			this.guestRating = guestRating;
		}

		public int getHotelId() {
			return hotelId;
		}

		public void setHotelId(int hotelId) {
			this.hotelId = hotelId;
		}

		public String getHotelName() {
			return hotelName;
		}

		public void setHotelName(String hotelName) {
			this.hotelName = hotelName;
		}

		public String getHotelAddress() {
			return hotelAddress;
		}

		public void setHotelAddress(String hotelAddress) {
			this.hotelAddress = hotelAddress;
		}

		public int getNumOfRooms() {
			return numOfRooms;
		}

		public void setNumOfRooms(int numOfRooms) {
			this.numOfRooms = numOfRooms;
		}
		public void setGuestRating(String guestRating) {
			this.guestRating=guestRating;
		}

		public String getGuestRating() {
			return guestRating;
		}

		@Override
		public String toString() {
			return " hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddress=" + hotelAddress + ", numOfRooms="
					+ numOfRooms+", guestRating=" + guestRating;
		}

	}


