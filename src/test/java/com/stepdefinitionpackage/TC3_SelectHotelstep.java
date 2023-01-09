package com.stepdefinitionpackage;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC3_SelectHotelstep {
	PageObjectManager pom = new PageObjectManager();
	
/**
 * @see User Selecting the Hotel Name by clicking radio Button
 * @throws InterruptedException
 */
	@Then("User should Select Hotel Name")
	public void user_should_select_hotel_name() throws InterruptedException {
		pom.getSelectHotelPage().selectHotelName();
	}
/**
 * @see User verifying after click Continue success message
 * @param expsucessMsgAfterSelect
 */
	@Then("User should need to verify after click Continue success message {string}")
	public void user_should_need_to_verify_after_click_continue_success_message(String expsucessMsgAfterSelect) {
		Assert.assertEquals("User should need to verify after click Continue success message", expsucessMsgAfterSelect,
				pom.getBookHotelPage().getSucessMessageAfterContinue().getText());
		Hooks.sc.log("Verify after click Continue success message "+" exp value: "+expsucessMsgAfterSelect+" act value: "+pom.getBookHotelPage().getSucessMessageAfterContinue().getText());
	}
/**
 * @see User should not click Select Hotel radioButton and click Continue
 * @throws InterruptedException
 */
	@Then("User should not Select Hotel Name")
	public void user_should_not_select_hotel_name() throws InterruptedException {
		pom.getSelectHotelPage().withoutSelectHotelName();
	}
/**
 * @see User verifying after click Continue error message
 * @param expselectHotelErrorMsg
 */
	@Then("User should need to verify after click Continue error message {string}")
	public void user_should_need_to_verify_after_click_continue_error_message(String expselectHotelErrorMsg) {
		Assert.assertEquals("User should need to verify after click Continue error messagee",expselectHotelErrorMsg,
				pom.getSelectHotelPage().getRadioErrorMessage().getText());
		Hooks.sc.log("Verify after click Continue error message "+" exp value: "+expselectHotelErrorMsg+" act value: "+pom.getSelectHotelPage().getRadioErrorMessage().getText());
	}

}
