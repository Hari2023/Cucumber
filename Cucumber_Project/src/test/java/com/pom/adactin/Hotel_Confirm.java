package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Confirm {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement iternity;

	public Hotel_Confirm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im Hotel Confirm Page");

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getIternity() {
		return iternity;
	}

}
