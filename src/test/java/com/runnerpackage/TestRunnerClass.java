package com.runnerpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.baseclasspackage.BaseClass;
import com.reportpackage.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = ("@BookHotel"), dryRun = false, plugin = { "pretty",
		"json:target\\output.json" }, features = "src\\test\\resources\\Features", glue = "com.stepdefinitionpackage")

public class TestRunnerClass extends BaseClass {
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJVMReport(getProjectpath() + getPropertyFileValue("json"));
	}

}
