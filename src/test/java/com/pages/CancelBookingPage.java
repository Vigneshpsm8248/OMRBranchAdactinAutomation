package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspackage.BaseClass;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Booked Itinerary')]")
	private WebElement bookedItinerary;
	@FindBy(id = "order_id_text")
	private WebElement searchOderID;
	@FindBy(id = "search_hotel_id")
	private WebElement clickGo;
	@FindBy(xpath = "//input[@type='button']")
	private WebElement cancelOderID;
	@FindBy(id = "search_result_error")
	private WebElement bookingCanceledSucessMessage;

	public WebElement getBookingCanceledSucessMessage() {
		return bookingCanceledSucessMessage;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getSearchOderID() {
		return searchOderID;
	}

	public WebElement getClickGo() {
		return clickGo;
	}

	public WebElement getCancelOderID() {
		return cancelOderID;
	}

	/**
	 * @see Getting and Cancelling The Generated OrderId and Existing OrderId 
	 * @param orderid
	 */

	public void cancelOrderId(String orderid) {

		click(getBookedItinerary());
		sendkeys(getSearchOderID(), orderid);
		click(getClickGo());
		click(getCancelOderID());
		alertsAccept();
	}

}
