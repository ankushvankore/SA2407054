package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D10RediffSignIn_Client {
	public static WebDriver Rdriver;
	RediffSignIn r1;
	
	@Test
	public void rediffSignIn() {
		r1.clickOnSignInLink();
		r1.enterUserName("Aarti");
		r1.submit();
		r1.handleAlert();
	}

	@BeforeTest
	public void beforeTest() {
		Rdriver = new ChromeDriver();
		Rdriver.manage().window().maximize();
		Rdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Rdriver.get("https://www.rediff.com/");
		
		r1 = new RediffSignIn(Rdriver);
	}

	@AfterTest
	public void afterTest() {
		Rdriver.close();
	}

}