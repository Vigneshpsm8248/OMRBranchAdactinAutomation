package com.stepdefinitionpackage;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclasspackage.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC2_SearchHotelstep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
/**
 * @see User entering allfields in SearchHotel and click search button
 * @param location
 * @param hotels
 * @param roomtype
 * @param noofrooms
 * @param checkin
 * @param checkout
 * @param adultsperroom
 * @param childperroom
 */
	@Then("User should enter allfields in SearchHotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_allfields_in_search_hotel_and(String location, String hotels, String roomtype,
			String noofrooms, String checkin, String checkout, String adultsperroom, String childperroom) {
		pom.getSearchHotelPage().searchHotelAllfield(location, hotels, roomtype, noofrooms, checkin, checkout,
				adultsperroom, childperroom);

	}
	
/**
 * @see User verifying after Scearch Hotel success message
 * @param expsearchSucessMessag
 */
	@Then("User should need to verify after Scearch Hotel success message {string}")
	public void user_should_need_to_verify_after_scearch_hotel_success_message(String expsearchSucessMessag) {
		WebElement scearchSucessMsg = pom.getSelectHotelPage().getSearchSucessMessage();
		String text = getText(scearchSucessMsg);
		boolean actsearchSucessMessg = text.contains(expsearchSucessMessag);
		Assert.assertTrue("User should need to verify after Scearch Hotel success message", actsearchSucessMessg);
		Hooks.sc.log("Verify after Scearch Hotel success message "+" exp value: "+expsearchSucessMessag+" act value: "+text);
	}
	
/**
 * @see User entering mandattoryfields in SearchHotel and click search button
 * @param location
 * @param noofrooms
 * @param checkin
 * @param checkout
 * @param adultsperroom
 */
	@Then("User should enter only mandattoryfields in SearchHotel {string},{string},{string},{string} and {string}")
	public void user_should_enter_only_mandattoryfields_in_search_hotel_and(String location, String noofrooms,
			String checkin, String checkout, String adultsperroom) {
		pom.getSearchHotelPage().searchHotelMandatryfield(location, noofrooms, checkin, checkout, adultsperroom);
	}
	
/**
 * @see User entering allfields with wrong data in SearchHotel and click search button
 * @param location
 * @param hotels
 * @param roomtype
 * @param noofrooms
 * @param checkin
 * @param checkout
 * @param adultsperroom
 * @param childperroom
 */
	@Then("User should enter allfields with wrong data in SearchHotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_enter_allfields_with_wrong_data_in_search_hotel_and(String location, String hotels,
			String roomtype, String noofrooms, String checkin, String checkout, String adultsperroom,
			String childperroom) {
		pom.getSearchHotelPage().searchHotelAllfield(location, hotels, roomtype, noofrooms, checkin, checkout,
				adultsperroom, childperroom);
	}
	/**
	 * @see User verifying after Scearch Hotel date checkin,checkout error message
	 * @param expcheckinErrorMessage
	 * @param expcheckoutErrorMessage
	 */

	@Then("User should need to verify after Scearch Hotel date  error message {string},{string}")
	public void user_should_need_to_verify_after_scearch_hotel_date_error_message(String expcheckinErrorMessage,
			String expcheckoutErrorMessage) {
		Assert.assertEquals("User should need to verify after Scearch Hotel date  error message", expcheckinErrorMessage,
				pom.getSearchHotelPage().getCheckinErrorMessage().getText());
		Assert.assertEquals("User should need to verify after Scearch Hotel date  error message", expcheckoutErrorMessage,
				pom.getSearchHotelPage().getCheckoutErrorMessage().getText());
		Hooks.sc.log("Verify after Scearch Hotel date  error message "+" exp value: "+expcheckinErrorMessage+" act value: "+pom.getSearchHotelPage().getCheckinErrorMessage().getText());
		Hooks.sc.log("Verify after Scearch Hotel date  error message "+" exp value: "+expcheckoutErrorMessage+" act value: "+pom.getSearchHotelPage().getCheckoutErrorMessage().getText());
	}

	/**
	 * @see User should not enter anyfields in SearchHotel and click scearch button
	 */
	@Then("User should not enter anyfields in SearchHotel")
	public void user_should_not_enter_anyfields_in_search_hotel() {
		pom.getSearchHotelPage().searchHotelss();
	}

	/**
	 * @see  User verifying after Scearch Hotel error message
	 * @param explocationErrorMessage
	 */
	@Then("User should need to verify after Scearch Hotel error message {string}")
	public void user_should_need_to_verify_after_scearch_hotel_error_message(String explocationErrorMessage) {

		Assert.assertEquals("User should need to verify after Scearch Hotel error message", explocationErrorMessage,
				pom.getSearchHotelPage().getLocationErrorMessage().getText());
		Hooks.sc.log("Verify after Scearch Hotel error message "+" exp value: "+explocationErrorMessage+" act value: "+pom.getSearchHotelPage().getLocationErrorMessage().getText());
	}

}
