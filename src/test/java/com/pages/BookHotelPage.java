package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspackage.BaseClass;

import io.cucumber.datatable.DataTable;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	@FindBy(id = "address")
	private WebElement txtBillingAddress;
	@FindBy(id = "cc_num")
	private WebElement txtCreditCardNo;
	@FindBy(id = "cc_type")
	private WebElement txtCreditCardType;
	@FindBy(id = "cc_exp_month")
	private WebElement txtExpiryMonth;
	@FindBy(id = "cc_exp_year")
	private WebElement txtExpiryYear;
	@FindBy(id = "cc_cvv")
	private WebElement txtCvvNumber;
	@FindBy(id = "book_now")
	private WebElement btnClick;
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement sucessMessageAfterContinue;
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmsuccessMessage;

	public WebElement getBookingConfirmsuccessMessage() {
		return bookingConfirmsuccessMessage;
	}

	@FindBy(id = "first_name_span")
	private WebElement firstnameErrorMessage;
	@FindBy(id = "last_name_span")
	private WebElement lastnameErrorMessage;
	@FindBy(id = "address_span")
	private WebElement addressErrorMessage;
	@FindBy(id = "cc_num_span")
	private WebElement cardNumErrorMessage;
	@FindBy(id = "cc_type_span")
	private WebElement cardTypErrorMessage;
	@FindBy(id = "cc_expiry_span")
	private WebElement cardMnthErrorMessage;
	@FindBy(id = "cc_cvv_span")
	private WebElement cardcvvErrorMessage;

	public WebElement getSucessMessageAfterContinue() {
		return sucessMessageAfterContinue;
	}

	public WebElement getFirstnameErrorMessage() {
		return firstnameErrorMessage;
	}

	public WebElement getLastnameErrorMessage() {
		return lastnameErrorMessage;
	}

	public WebElement getAddressErrorMessage() {
		return addressErrorMessage;
	}

	public WebElement getCardNumErrorMessage() {
		return cardNumErrorMessage;
	}

	public WebElement getCardTypErrorMessage() {
		return cardTypErrorMessage;
	}

	public WebElement getCardMnthErrorMessage() {
		return cardMnthErrorMessage;
	}

	public WebElement getCardcvvErrorMessage() {
		return cardcvvErrorMessage;
	}


	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtBillingAddress() {
		return txtBillingAddress;
	}

	public WebElement getTxtCreditCardNo() {
		return txtCreditCardNo;
	}

	public WebElement getTxtCreditCardType() {
		return txtCreditCardType;
	}

	public WebElement getTxtExpiryMonth() {
		return txtExpiryMonth;
	}

	public WebElement getTxtExpiryYear() {
		return txtExpiryYear;
	}

	public WebElement getTxtCvvNumber() {
		return txtCvvNumber;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
/**
 * 
 * @see Click BookNow with Entering All Fields in BookHotel Page
 * @param firstname
 * @param lastname
 * @param billingaddress
 * @param dataTable
 */
	public void bookHotelWithAllfields(String firstname, String lastname, String billingaddress, DataTable dataTable) {

		sendkeys(getTxtFirstName(), firstname);
		sendkeys(getTxtLastName(), lastname);
		sendkeys(getTxtBillingAddress(), billingaddress);

		List<Map<String, String>> maps = dataTable.asMaps();
		Map<String, String> map = maps.get(1);
		String cardNum = map.get("creditcardno");
		String cardtype = map.get("creditcardtype");
		String cardMonth = map.get("expirymonth");
		String cardyear = map.get("expiryyear");
		String cvvNum = map.get("cvvnumber");

		sendkeys(getTxtCreditCardNo(), cardNum);
		sendkeys(getTxtCreditCardType(), cardtype);
		sendkeys(getTxtExpiryMonth(), cardMonth);
		sendkeys(getTxtExpiryYear(), cardyear);
		sendkeys(getTxtCvvNumber(), cvvNum);

		click(getBtnClick());
	}
/**
 * @see Click BookNow Without Entering all fields in BookHotel page
 */
	public void bookHotelWithoutAnyfields() {
		click(getBtnClick());

	}

}
