package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03Before_After_Test {
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Before Test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("After Test");
		driver.close();
	}
	
	@Test (priority = 4)
	public void testMeesho()
	{
		driver.get("https://www.meesho.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 2)
	public void testAjio()
	{
		driver.get("https://www.ajio.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 1)
	public void testNykaa()
	{
		driver.get("https://www.nykaa.com/sp/main-sale-page/mega-sale?utm_content=ads&utm_source=GooglePaid&utm_medium=search&utm_campaign=Search_Nykaa_NCA&hlp=hlpa&gad_source=1&gclid=Cj0KCQjwsoe5BhDiARIsAOXVoUs_66Y2SfIK3waDfnWtoZhXUjtJD5ukS1c2enG5LmeEw2tB1dtLP44aAnglEALw_wcB");
		System.out.println("Title: " + driver.getTitle());
	}
	@Test (priority = 3)
	public void testBewakoof()
	{
		driver.get("https://www.bewakoof.com/");
		System.out.println("Title: " + driver.getTitle());
	}
	
	
}
