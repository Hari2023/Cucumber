package com.pom.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name' and @class='reg_input']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement ccnum;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cctype;

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement cardexp;

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement ccexpyear;

	@FindBy(xpath = "//input[@name='cc_cvv' and @type='text' ]")
	private WebElement ccvnum;

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;
	
	
	
	public Book_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		System.out.println("Im Book Page");

	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCardexp() {
		return cardexp;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCcvnum() {
		return ccvnum;
	}

	public WebElement getBook() {
		return book;
	}

	

}
