package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02GoogleSearch {
	WebDriver driver;
	@Given("I Open google")
	public void i_open_google() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.google.com");
	}

	@When("I enter valid text in search box")
	public void i_enter_valid_text_in_search_box() {
	    driver.findElement(By.name("q")).sendKeys("Nana Patekar");
	}

	@When("I hit enter")
	public void i_hit_enter() {
	    driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	}

	@Then("A valid search result should display")
	public void a_valid_search_result_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Nana"));
	}
}
