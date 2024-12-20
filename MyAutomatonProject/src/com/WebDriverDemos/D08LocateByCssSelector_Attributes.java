package com.WebDriverDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocateByCssSelector_Attributes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId = driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy\"]"));
		emailId.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.cssSelector("input[type=\"password\"][id=\"pass\"]"));
		password.sendKeys("1234567890");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		loginBtn.click();
		
	}

}
