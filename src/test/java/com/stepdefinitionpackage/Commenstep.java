package com.stepdefinitionpackage;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclasspackage.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class Commenstep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
/**
 * @see User verifying after login success message
 * @param exploginSucessMsg
 */
	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String exploginSucessMsg) {
		WebElement getSucessMsg = pom.getSearchHotelPage().getLoginSucessMessage();
		String actLoginSuccessMsg = getAttributes(getSucessMsg);
		Assert.assertEquals("Verify after Login Sucess message", exploginSucessMsg, actLoginSuccessMsg);
		Hooks.sc.log("Verify after login success message "+" exp value: "+exploginSucessMsg+" act value: "+actLoginSuccessMsg);
	}

}
