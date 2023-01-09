package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConformPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {

	/**
	 * @see Creating Object For All PageClasses with Condition of Singleton
	 */
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConformPage bookingConformPage;
	private CancelBookingPage cancelBookingPage;
   
	public LoginPage getLoginPage() {
		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage == null) ? searchHotelPage = new SearchHotelPage() : searchHotelPage;
	}

	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage == null) ? selectHotelPage = new SelectHotelPage() : selectHotelPage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage == null) ? bookHotelPage = new BookHotelPage() : bookHotelPage;
	}

	public BookingConformPage getBookingConformPage() {
		return (bookingConformPage == null) ? bookingConformPage = new BookingConformPage() : bookingConformPage;
	}

	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage == null) ? cancelBookingPage = new CancelBookingPage() : cancelBookingPage;
	}

}
