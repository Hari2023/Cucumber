package com.runnerclass.adactin;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.adactin.Page_Object_Manager;
import com.utilityfiles.Utility_Files;

public class Runner_Adacatin_Hotel extends Utility_Files {

	public static WebDriver driver = browser_Configure("chrome");

	public static Page_Object_Manager manager = new Page_Object_Manager(driver);

	public static void main(String[] args) {
		
		// Url Launch

		window_Commands("maximize");

		get_Url("https://adactinhotelapp.com/index.php");

		implicity_Wait(10);

		// Home Page

		send_Keys(manager.getHp().getUsername(), "Haribaskar1234");

		send_Keys(manager.getHp().getPassword(), "3x@HgypsH76zHb");

		click_On_Element(manager.getHp().getLogin());

		// search Hotel

		select_By_Value(manager.getSearch().getLocate(), "New York");

		select_By_Value(manager.getSearch().getHotel(), "Hotel Sunshine");

		select_By_Value(manager.getSearch().getType(), "Super Deluxe");

		select_Visible_Text(manager.getSearch().getNoofrooms(), "2 - Two");

		clear(manager.getSearch().getCheckin());

		send_Keys(manager.getSearch().getCheckin(), "08/11/2022");

		clear(manager.getSearch().getCheckout());

		send_Keys(manager.getSearch().getCheckout(), "11/11/2022");

		select_By_Value(manager.getSearch().getAdult(), "2");

		select_By_Value(manager.getSearch().getChildroom(), "0");

		click_On_Element(manager.getSearch().getSearch());

		// --select hotel

		click_On_Element(manager.getSelect().getRadio_Btn());

		click_On_Element(manager.getSelect().getContiune_Btn());

		// Book Hotel

		send_Keys(manager.getBook().getFirstname(), "NANDHU");

		send_Keys(manager.getBook().getLastname(), "G");

		send_Keys(manager.getBook().getAddress(), "TRICHY");

		send_Keys(manager.getBook().getCcnum(), "1234567891234567");

		select_By_Value(manager.getBook().getCctype(), "VISA");

		select_By_Value(manager.getBook().getCardexp(), "10");

		select_By_Value(manager.getBook().getCcexpyear(), "2022");

		send_Keys(manager.getBook().getCcvnum(), "123");

		click_On_Element(manager.getBook().getBook());

		// confirm

		click_On_Element(manager.getConfirm().getIternity());

		// ---Order List

		click_On_Element(manager.getOrder().getCheckall());

		screen_Shot(manager.getOrder().getCheckall());

		click_On_Element(manager.getOrder().getCancelall());

//		
//		Alert s = driver.switchTo().alert();
//		s.accept();
	}

}