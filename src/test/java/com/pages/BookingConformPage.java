package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspackage.BaseClass;

public class BookingConformPage extends BaseClass  {
	
	 public BookingConformPage() {
		 PageFactory.initElements(driver, this);
	}
	 @FindBy(name="order_no")
	 private WebElement orderID;


	public WebElement getOrderID() {
		return orderID;
	}

	
	


}
