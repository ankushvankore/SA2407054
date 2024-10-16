package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A01EchotrakLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement userName = driver.findElement(By.className("form-control"));
		userName.sendKeys("ankush");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("ankush123");
		WebElement loginBtn = driver.findElement(By.className("btn"));
		loginBtn.click();
		
		WebElement errMsg = driver.findElement(By.id("lblMsg"));
		String msg = errMsg.getText();
		System.out.println("Error Message: " + msg);
		
		if(msg.contains("Invalid"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();
	}

}
