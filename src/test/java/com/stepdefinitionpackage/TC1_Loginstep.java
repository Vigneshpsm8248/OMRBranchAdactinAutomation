package com.stepdefinitionpackage;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclasspackage.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.*;


public class TC1_Loginstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see Initiation of Adactin page
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Given("User is on the Adactin page")
	public void user_is_on_the_adactin_page() throws FileNotFoundException, IOException {

	}
	/**
	 * @see User Enters the Username and Password and Click the Login Button
	 * @param username
	 * @param password
	 */

	@When("User should perform login {string},{string}")
	public void user_should_perform_login(String username, String password) {
		pom.getLoginPage().login(username, password);
	}
	
/**
 * @see User Enters the Username and Password and Click the Enter Key 
 * @param username
 * @param password
 * @throws AWTException
 */
	@When("User should perform login {string},{string} with Enterkey")
	public void user_should_perform_login_with_enterkey(String username, String password) throws AWTException {
		pom.getLoginPage().loginWithEnterKey(username, password);

	}
	
/**
 * @see User verifying after login with invalid credential error message
 * @param exptLoginErrorMessag
 */
	
	@Then("User should verify after login with invalid credential error message {string}")
	public void user_should_verify_after_login_with_invalid_credential_error_message(String exptLoginErrorMessag) {
		WebElement textErrorLogin = pom.getLoginPage().getActLoginErrorMessage();
		String elementGetText = getText(textErrorLogin);
		boolean actloginErrorMesage = elementGetText.contains(exptLoginErrorMessag);

		Assert.assertTrue("User should verify after login with invalid credential error message", actloginErrorMesage);
		Hooks.sc.log("Verify after login with invalid credential error message "+ " exp value: " + exptLoginErrorMessag + " act value: " + elementGetText);
	}

}
