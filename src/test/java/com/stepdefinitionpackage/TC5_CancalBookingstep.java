package com.stepdefinitionpackage;

import org.openqa.selenium.WebElement;

import com.baseclasspackage.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC5_CancalBookingstep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
/**
 * @see User should cancel generated order ID
 */
	@Then("User should cancel generated order ID")
	public void user_should_cancel_generated_order_id() {
		WebElement orderid = pom.getBookingConformPage().getOrderID();
		pom.getCancelBookingPage().cancelOrderId(getAttributes(orderid));
	}
	/**
	 * @see User verifying after cancel order ID success message
	 * @param expcancelBookingSucessMsg
	 */

	@Then("User should need to verify after cancel order ID success message {string}")
	public void user_should_need_to_verify_after_cancel_order_id_success_message(String expcancelBookingSucessMsg) {
		org.junit.Assert.assertEquals("User should need to verify after cancel order ID success message",
				expcancelBookingSucessMsg, pom.getCancelBookingPage().getBookingCanceledSucessMessage().getText());
		Hooks.sc.log("Verify after cancel order ID success message "+" exp value: "+expcancelBookingSucessMsg+" act value: "+pom.getCancelBookingPage().getBookingCanceledSucessMessage().getText());
	}
	/**
	 * @see User cancelling existing  order ID
	 * @param orderid
	 */

	@Then("User should cancel existing  order ID {string}")
	public void user_should_cancel_existing_order_id(String orderid) {
		pom.getCancelBookingPage().cancelOrderId(orderid);

	}

}
