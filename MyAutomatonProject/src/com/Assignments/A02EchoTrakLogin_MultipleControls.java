package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02EchoTrakLogin_MultipleControls {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		//List<WebElement>un_ps = driver.findElements(By.className("form-control"));
		//un_ps.get(0).sendKeys("akhila");
		//un_ps.get(1).sendKeys("akhila123");
		
		driver.findElements(By.className("form-control")).get(0).sendKeys("Aarti");
		driver.findElements(By.className("form-control")).get(1).sendKeys("aarti123");
		
	}

}
