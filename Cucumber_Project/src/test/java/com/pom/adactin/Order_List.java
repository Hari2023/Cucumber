package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_List {

	public WebDriver driver;

	@FindBy(xpath = "//input[@name='check_all']")
	private WebElement checkall;

	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelall;

	public Order_List(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im Order List Page");

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckall() {
		return checkall;
	}

	public WebElement getCancelall() {
		return cancelall;
	}

}
