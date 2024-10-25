package com.WebDriverDemos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropdownList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drpList = driver.findElement(By.id("country"));
		Select countries = new Select(drpList);
		//The object countries contains actual drop down list
		
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		List<WebElement>countryList = countries.getOptions();
		//The object countryList just contains the list of all the options
		System.out.println("Total countries: " + countryList.size());
		
		/*int i = 0;
		for(WebElement c : countryList)
		{
			System.out.println(i + c.getText());
			i++;
		}*/
		
		//countries.selectByVisibleText("Ireland");
		//countries.selectByValue("103");
		countries.selectByIndex(100);
		System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
		//WebElement bDay = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		//Select dayDD = new Select(bDay);
		Select dayDD = new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")));
		dayDD.selectByVisibleText("29");
		
		new Select(driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"))).selectByVisibleText("JAN");
	}

}
