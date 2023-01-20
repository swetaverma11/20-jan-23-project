package com.travellbooking.domain;

public class BusTicket extends TravellTicket {
	private long bookingCode;
	private int ticketNumber;
	
	
	public BusTicket() {
		super();
		
	}


	public BusTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime, long bookingCode, int ticketNumber) {
		super(bookingRef, origin, destination, price, departureTime, arrivalTime);
		this.bookingCode = bookingCode;
		this.ticketNumber = ticketNumber;
	}


	public long getBookingCode() {
		return bookingCode;
	}


	public void setBookingCode(long bookingCode) {
		this.bookingCode = bookingCode;
	}


	public int getTicketNumber() {
		return ticketNumber;
	}


	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	
	public void BusTicketDetails() {
		System.out.println("Bus Ticket Details");
		//System.out.println("bookingRef:" +getBookingRef( ));
		//System.out.println("origin:" +getOrigin());
		//System.out.println("destination:" +getDestination());
		//System.out.println(" price:" +getPrice());
		//System.out.println("departureTime:" +getDepartureTime());
		System.out.println("bookingCode:" +getBookingCode());
		System.out.println("ticketNumber:" +getTicketNumber());
		
	}
	

}

