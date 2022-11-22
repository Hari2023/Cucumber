package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "//input[@type='radio']")
	private WebElement radio_Btn;

	@FindBy(xpath = "//input[@name='continue']")
	private WebElement contiune_Btn;

	public Select_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im Select Page");

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadio_Btn() {
		return radio_Btn;
	}

	public WebElement getContiune_Btn() {
		return contiune_Btn;
	}

}
