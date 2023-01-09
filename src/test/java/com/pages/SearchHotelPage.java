package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspackage.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement txtLocation;
	@FindBy(id = "hotels")
	private WebElement txtHotels;
	@FindBy(id = "room_type")
	private WebElement txtRoomType;
	@FindBy(id = "room_nos")
	private WebElement txtNoOfRooms;
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement txtCheckIn;
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement txtCheckOut;
	@FindBy(id = "adult_room")
	private WebElement txtAdultsPerRoom;
	@FindBy(name = "child_room")
	private WebElement txtChildPerRoom;
	@FindBy(id = "Submit")
	private WebElement btnSubmit;
	@FindBy(xpath = "//input[@id='username_show']")
	private WebElement loginSucessMessage;
	@FindBy(xpath = "//span[@id='checkin_span']")
	private WebElement checkinErrorMessage;
	@FindBy(xpath = "//span[@id='checkout_span']")
	private WebElement checkoutErrorMessage;
	@FindBy(xpath = "//span[@id='location_span']")
	private WebElement locationErrorMessage;

	

	public WebElement getLoginSucessMessage() {
		return loginSucessMessage;
	}

	public WebElement getCheckinErrorMessage() {
		return checkinErrorMessage;
	}

	public WebElement getCheckoutErrorMessage() {
		return checkoutErrorMessage;
	}

	public WebElement getLocationErrorMessage() {
		return locationErrorMessage;
	}


	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtHotels() {
		return txtHotels;
	}

	public WebElement getTxtRoomType() {
		return txtRoomType;
	}

	public WebElement getTxtNoOfRooms() {
		return txtNoOfRooms;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getTxtAdultsPerRoom() {
		return txtAdultsPerRoom;
	}

	public WebElement getTxtChildPerRoom() {
		return txtChildPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	/**
	 * @see Commonsteps for Other Methods
	 * @param location
	 * @param noofrooms
	 * @param checkin
	 * @param checkout
	 * @param adultsperroom
	 */
	public void searchHotelCommonSteps(String location, String noofrooms, String checkin, String checkout,
			String adultsperroom) {

		selectbyVisibletext(getTxtLocation(), location);
		selectbyVisibletext(getTxtNoOfRooms(), noofrooms);
		WebElement chekin2 = getTxtCheckIn();
		clear(chekin2);
		sendkeys(chekin2, checkin);
		WebElement chekout2 = getTxtCheckOut();
		clear(chekout2);
		sendkeys(chekout2, checkout);
		selectbyVisibletext(getTxtAdultsPerRoom(), adultsperroom);

	}
 
	/**
	 * @see Entering allfields in scearchHotel
	 * @param location
	 * @param hotels
	 * @param roomtype
	 * @param noofrooms
	 * @param checkin
	 * @param checkout
	 * @param adultsperroom
	 * @param childperroom
	 */
	// 1.Allfields
	public void searchHotelAllfield(String location, String hotels, String roomtype, String noofrooms, String checkin,
			String checkout, String adultsperroom, String childperroom) {

		searchHotelCommonSteps(location, noofrooms, checkin, checkout, adultsperroom);
		selectbyVisibletext(getTxtHotels(), hotels);
		selectbyVisibletext(getTxtRoomType(), roomtype);
		selectbyVisibletext(getTxtChildPerRoom(), childperroom);
		searchButton();

	}
	/**
	 * @see Entering Mandatryfield in scearchHotel
	 * @param location
	 * @param noofrooms
	 * @param checkin
	 * @param checkout
	 * @param adultsperroom
	 */

	// 2.Mandatryfields
	public void searchHotelMandatryfield(String location, String noofrooms, String checkin, String checkout,
			String adultsperroom) {
		searchHotelCommonSteps(location, noofrooms, checkin, checkout, adultsperroom);
		searchButton();

	}
	/**
	 * @see Only Click Secearch Hotel Button Without Entering Any Field
	 */

	public void searchHotelss() {
		searchButton();

	}
/**
 * @see Common Steps (Search Button Click) for all methods 
 */
	public void searchButton() {
		WebElement submit2 = getBtnSubmit();
		click(submit2);
	}

}