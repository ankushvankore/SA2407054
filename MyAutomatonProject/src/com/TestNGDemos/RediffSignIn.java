package com.TestNGDemos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffSignIn {
	WebDriver driver;
	
	//Object Repository
	@FindBy (partialLinkText = "Sign") WebElement signInLink;
	@FindBy (id = "login1") WebElement userNameTextBox;
	
	/*public RediffSignIn(WebDriver d)
	{
		driver = d;
	}*/
	public RediffSignIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //Will initilize objects created using @FindBy
	}
	

	public void clickOnSignInLink() {
		//driver.findElement(By.partialLinkText("Sign")).click();
		signInLink.click();
	}

	public void enterUserName(String un) {
		//driver.findElement(By.id("login1")).sendKeys(un);
		userNameTextBox.sendKeys(un);
	}

	public void submit() {
		driver.findElement(By.name("proceed")).click();
	}

	public void handleAlert()
	{
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
}
