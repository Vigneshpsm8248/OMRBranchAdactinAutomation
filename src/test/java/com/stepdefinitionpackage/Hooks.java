package com.stepdefinitionpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclasspackage.BaseClass;

import io.cucumber.java.*;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	static Scenario sc;
	@Before
	public void beforeSenario(Scenario scenario) throws FileNotFoundException, IOException {
		getdriver(getPropertyFileValue("browser"));
		launchUrl(getPropertyFileValue("url"));
		implicitWait();
    sc = scenario;
	}

	@After
	public void afterSenario(Scenario scenerio) throws InterruptedException {
		Thread.sleep(2000);
	
		scenerio.attach(takeScreenShot(),"images/png", "Every Scenerio");

		driver.quit();

	}

}
