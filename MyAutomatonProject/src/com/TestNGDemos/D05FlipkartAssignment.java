package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05FlipkartAssignment {
	@Test(priority = 1)
	public void mobileTest() {
	}

	@BeforeMethod
	public void launchingFlipkart() {
	}

	@AfterMethod
	public void printTitle() {
	}

	@BeforeTest
	public void launchingBrowser() {
	}

	@AfterTest
	public void closeBrower() {
	}

}