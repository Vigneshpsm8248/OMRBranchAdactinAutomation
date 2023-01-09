package com.stepdefinitionpackage;

import org.junit.Assert;

import com.baseclasspackage.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC4_BookHotelstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see User entering allfields in BookHotel
	 * @param firstname
	 * @param lastname
	 * @param billingaddress
	 * @param dataTable
	 */
	@Then("User should enter allfields in BookHotel {string},{string} and {string}")
	public void user_should_enter_allfields_in_book_hotel_and(String firstname, String lastname, String billingaddress,
			io.cucumber.datatable.DataTable dataTable) {

		pom.getBookHotelPage().bookHotelWithAllfields(firstname, lastname, billingaddress, dataTable);

	}
/**
 * @see User verifying after click BookNow success message 
 * @param expBookingConfirmSuccessMessage
 */
	@Then("User should verify after click BookNow success message {string} and save the generated order ID")
	public void user_should_verify_after_click_book_now_success_message_and_save_the_generated_order_id(
			String expBookingConfirmSuccessMessage) {
		implicitWait();
		Assert.assertEquals("User should verify after click BookNow success message", expBookingConfirmSuccessMessage,
				pom.getBookHotelPage().getBookingConfirmsuccessMessage().getText());
		Hooks.sc.log("Verify after click BookNow success message "+" exp value: "+expBookingConfirmSuccessMessage+" act value: "+pom.getBookHotelPage().getBookingConfirmsuccessMessage().getText());
	
	}
/**
 * @see User not entered anyfields in BookHotel
 */
	@Then("User should not enter anyfields in BookHotel")
	public void user_should_not_enter_anyfields_in_book_hotel() {
		pom.getBookHotelPage().bookHotelWithoutAnyfields();
	}
/**
 * @see User verifying after click BookNow error message
 * @param expfirstnameErrorMessage
 * @param explastnameErrorMessage
 * @param expaddressErrorMessage
 * @param expcardNumErrorMessage
 * @param expcardTypErrorMessage
 * @param expcardMnthErrorMessage
 * @param expcardcvvErrorMessage
 */
	@Then("User should verify after click BookNow error message {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_click_book_now_error_message_and(String expfirstnameErrorMessage,
			String explastnameErrorMessage, String expaddressErrorMessage, String expcardNumErrorMessage, String expcardTypErrorMessage,
			String expcardMnthErrorMessage, String expcardcvvErrorMessage) {
		Assert.assertEquals("User should verify after click BookNow error message", expfirstnameErrorMessage,
				pom.getBookHotelPage().getFirstnameErrorMessage().getText());
		Assert.assertEquals("User should verify after click BookNow error message", explastnameErrorMessage,
				pom.getBookHotelPage().getLastnameErrorMessage().getText());
		Assert.assertEquals("User should verify after click BookNow error message", expaddressErrorMessage,
				pom.getBookHotelPage().getAddressErrorMessage().getText());
		Assert.assertEquals("User should verify after click BookNow error message", expcardNumErrorMessage,
				pom.getBookHotelPage().getCardNumErrorMessage().getText());
		Assert.assertEquals("User should verify after click BookNow error message", expcardTypErrorMessage,
				pom.getBookHotelPage().getCardTypErrorMessage().getText());
		Assert.assertEquals("User should verify after click BookNow error message", expcardMnthErrorMessage,
				pom.getBookHotelPage().getCardMnthErrorMessage().getText());
		Assert.assertEquals("User should verify after click BookNow error message", expcardcvvErrorMessage,
				pom.getBookHotelPage().getCardcvvErrorMessage().getText());
		Hooks.sc.log("Verify after click BookNow Firstname error message "+" exp value: "+expfirstnameErrorMessage+" act value: "+pom.getBookHotelPage().getFirstnameErrorMessage().getText());
		Hooks.sc.log("Verify after click BookNow Lastname error message "+" exp value: "+explastnameErrorMessage+" act value: "+pom.getBookHotelPage().getLastnameErrorMessage().getText());
		Hooks.sc.log("Verify after click BookNow Address error message"+" exp value: "+expaddressErrorMessage+" act value: "+pom.getBookHotelPage().getAddressErrorMessage().getText());
		Hooks.sc.log("Verify after click BookNow CardNumber error message "+" exp value: "+expcardNumErrorMessage+" act value: "+pom.getBookHotelPage().getCardNumErrorMessage().getText());
		Hooks.sc.log("Verify after click BookNow CardType error message "+" exp value: "+expcardTypErrorMessage+" act value: "+	pom.getBookHotelPage().getCardTypErrorMessage().getText());
		Hooks.sc.log("Verify after click BookNow CardMonth error message "+" exp value: "+expcardMnthErrorMessage+" act value: "+pom.getBookHotelPage().getCardMnthErrorMessage().getText());
		Hooks.sc.log("Verify after click BookNow CardCvvnumber error message "+" exp value: "+expcardcvvErrorMessage+" act value: "+pom.getBookHotelPage().getCardcvvErrorMessage().getText());
	
	}

}
