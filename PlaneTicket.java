package com.travellbooking.domain;

public class PlaneTicket extends TravellTicket {
	private int bookingCode;
	private String boardingtime;
	
	public PlaneTicket() {
	super();
	}

	public PlaneTicket(long bookingRef, String origin, String destination, int price, String departureTime,
			String arrivalTime, int bookingCode, String boardingtime) {
		super(bookingRef, origin, destination, price, departureTime, arrivalTime);
		this.bookingCode = bookingCode;
		this.boardingtime = boardingtime;
	}

	public int getBookingCode() {
		return bookingCode;
	}

	public void setBookingCode(int bookingCode) {
		this.bookingCode = bookingCode;
	}

	public String getBoardingtime() {
		return boardingtime;
	}

	public void setBoardingtime(String boardingtime) {
		this.boardingtime = boardingtime;
	}
	
	
	public void detailsOfPlanetkt() {
		System.out.println("getBookingCode:"+getBookingCode());
		System.out.println("getBoardingtime:"+getBoardingtime() );
	}
	
}
