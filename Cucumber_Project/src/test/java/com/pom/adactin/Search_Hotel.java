package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "//select[@name='location']")
	private WebElement location;

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement type;

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement noofrooms;

	@FindBy(xpath = "//input[@type='text' and @id='datepick_in']")
	private WebElement checkin;

	@FindBy(xpath = "//input[@type='text' and @name='datepick_out']")
	private WebElement checkout;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement childroom;

	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;

	public Search_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im Search Page");

	}
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocate() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}

}
