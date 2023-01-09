package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclasspackage.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;
	@FindBy(id = "password")
	private WebElement txtPassWord;
	@FindBy(id = "login")
	private WebElement LoginButton;
	@FindBy(xpath = "//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
	private WebElement actLoginErrorMessage;

	public WebElement getActLoginErrorMessage() {
		return actLoginErrorMessage;
	}
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassWord() {
		return txtPassWord;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	/**
	 * @see Enter Username and Password and click login Button
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
	
		sendkeys(getTxtUserName(), username);
		sendkeys( getTxtPassWord(), password);
		click(getLoginButton());
		

	}

	/**
	 * @see Enter Username and Password and perform Enter key
	 * @param username
	 * @param password
	 * @throws AWTException
	 */
	// 2.Verifiying login with EnterKey
	public void loginWithEnterKey(String username, String password) throws AWTException {
		login(username, password);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
