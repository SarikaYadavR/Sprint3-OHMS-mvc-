package com.cg.ohms.main;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import com.cg.ohms.dao.Impl.BookingdaoImpl;

public class Main 
{
    
	private static final LocalDate LocalDate = null;

	public static void main( String[] args )
    {
    	//System.out.println( "Hello World!" );
    	
  		BookingdaoImpl hotelbookings=new BookingdaoImpl();
    	//hotelbookings.addBooking();
          //hotelbookings.getBooking();
//    		changehotelid(235,678);
    		
          Scanner scanner = new Scanner(System.in);
  		try
  		{
  			int input=0;
  			do
  			{
  				System.out.println("WELCOME TO ONLINE HOTEL BOOKING SYSTEM");
  				System.out.println("---------------------------------------");
  				System.out.println("Press 1 to View Booking");
  				System.out.println("Press 2 to Modify Booking"); 
  				try
  				{
  					input = scanner.nextInt();
  					switch (input) {                                                          //View the Hotel Bookings

  					case 1:
  						System.out.println("View the Bookings");
  						System.out.println("------------------");
  						System.out.println("Enter the BookingID:");
  						String booked=scanner.next();
  					    hotelbookings.getBookingDetails();

  						System.out.println();
//  						Bookingdetails bookingdetails=new Bookingdetails();
//  						bookingdetails.setBookingid(booked);
//  						Booking bookId=new BookRoomImpl();
//  						bookingdetails = bookId.viewBookingDetails(bookingdetails);
  						
  						break;
  						
  						
  					case 2:
  						System.out.println("Modify the Bookings");
						System.out.println("Enter the BookingID:");
						String bookedid =scanner.next();
						//Validation validate=new Validation();
						//validate.isBookingIdValid(bookedid);
						System.out.println("Press 1 to Modify Checkin Date");
						System.out.println("Press 2 to Modify Checkout Date");
				         
				        input = scanner.nextInt();
				        switch (input) {
				        case 1:                                                              //Modifying the Check-in date
				        System.out.println("Enter the New Checkin Date:");
				        String newcheckin=scanner.next();
				        
				        Date newdate=new SimpleDateFormat("dd-MM-yyyy").parse(newcheckin);
				        
				        SimpleDateFormat output = new SimpleDateFormat("dd-MM-yyyy");
				        String out = output.format(newdate);
				        System.out.println(out);
				        break;   	   
				        case 2:                                                               //Modifying the Check-out date
				        System.out.println("Enter the New Checkout Date");
				        String newcheckout=scanner.next();
				        Date newdatecheckout=new SimpleDateFormat("dd-MM-yyyy").parse(newcheckout);
				       
				        SimpleDateFormat outputs = new SimpleDateFormat("dd-MM-yyyy");
				        String date = outputs.format(newdatecheckout);
				        System.out.println(date);
				        System.out.println("Dates modified successfully :)");
				        
						
				    	hotelbookings.changehotelid(input,LocalDate);
				        }
						
				
  						
  						
  							

			        }while(true);
			       }catch(Exception e)
						{
							System.out.println(e.getMessage());
						}

//				break;
//			default:
			}while(true);  //end ofswitch
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
        }
}
    	
    	
    	
    
   
	