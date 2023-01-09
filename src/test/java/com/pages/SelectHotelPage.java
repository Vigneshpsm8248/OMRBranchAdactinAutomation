package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspackage.BaseClass;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;
	@FindBy(id = "continue")
	private WebElement continueButton;
	@FindBy(id = "radiobutton_span")
	private WebElement radioErrorMessage;
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement searchSucessMessage;

	public WebElement getRadioErrorMessage() {
		return radioErrorMessage;
	}

	public WebElement getSearchSucessMessage() {
		return searchSucessMessage;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
/**
 * @see Clicking radio button to select hotel and clicking continue button
 * @throws InterruptedException
 */
	public void selectHotelName() throws InterruptedException {
		Thread.sleep(5000);
		click(getRadioButton());
		click(getContinueButton());
	}
/**
 * @see Clicking continue button without selecting radio button
 * @throws InterruptedException
 */
	public void withoutSelectHotelName() throws InterruptedException {
		Thread.sleep(5000);
		click(getContinueButton());
	}

}
