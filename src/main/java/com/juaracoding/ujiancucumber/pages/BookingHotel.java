package com.juaracoding.ujiancucumber.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.ujiancucumber.drivers.DriverSingleton;

public class BookingHotel {
private WebDriver driver;
	
	public BookingHotel() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#fadein > header > div.header-menu-wrapper.padding-right-100px.padding-left-100px > div > div > div > div > div.main-menu-content > nav > ul > li:nth-child(2) > a")
	WebElement menuHotel;
	
	@FindBy(id = "select2-hotels_city-container")
	WebElement dropDown_city;
	
	@FindBy(css = "#fadein > span > span > span.select2-search.select2-search--dropdown > input")
	WebElement input_city;
	
	@FindBy(id = "checkin")
	WebElement checkin;
	
	@FindBy(id = "checkout")
	WebElement checkout;
	
	@FindBy(css = "#hotels-search > div > div > div:nth-child(3) > div > div > div > a")
	WebElement listTraveller;
	
	@FindBy(id = "nationality")
	WebElement listNationality;
	
	@FindBy(id = "submit")
	WebElement btnSearch;
	
	@FindBy(css = "#rendezvous\\ hotels > div > div.card-body.p-0 > div > div.col-4.p-3 > div > a")
	WebElement listHotel;
	
	@FindBy(css = "#availability > div.single-content-item.padding-top-40px.padding-bottom-30px.rooms > div:nth-child(1) > div.card-body > div > div.col-md-9 > form > div > div.col-md-3.booked_53 > div > div > button")
	WebElement btnBookNow;
	
	@FindBy(name = "title_1")
	WebElement listTitle1;
	
	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div.form-box.payment-received-wrap.mb-2 > div.card-body > div:nth-child(2) > div.card-body > div > div.col-md-2 > select")
	WebElement listTitle2;
	
	@FindBy(name = "firstname_1")
	WebElement firstName1;
	
	@FindBy(name = "lastname_1")
	WebElement lastName1;
	
	@FindBy(name = "firstname_2")
	WebElement firstName2;
	
	@FindBy(name = "lastname_2")
	WebElement lastName2;
	
	@FindBy(css = "#myTab > div.col-md-4.mb-1.gateway_bank-transfer")
	WebElement paymentBank;
	
	@FindBy(css = "#fadein > div.booking_data > form > section > div > div > div.col-lg-8 > div:nth-child(4) > div > div > div > label")
	WebElement checkBox_Agree;
	
	@FindBy(id = "booking")
	WebElement btnConfirmBooking;
	
	@FindBy(id = "cookie_stop")
	WebElement btnCookie;
	
	@FindBy(css = "#fadein > section.payment-area.section-bg.section-padding.pt-4 > div > div > div > div > div.form-box.payment-received-wrap.mb-0 > div.form-title-wrap > h3 > span > strong")
	WebElement txtReservationNumber;
	
	public void goToMenuHotel() {
		menuHotel.click();
		tunggu();
		btnCookie.click();
	}
	
	public void findHotel(String city) {
		dropDown_city.click();
		tunggu();
		input_city.sendKeys(city);
		tunggu();
		input_city.sendKeys(Keys.RETURN);
		
		checkin.sendKeys(Keys.TAB);
		checkout.sendKeys(Keys.TAB);

		
		listTraveller.click();
		listNationality.click();
		
		btnSearch.click();
	}
	
	
	public void pilihHotel() {
		
		listHotel.click();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		tunggu();
		btnBookNow.click();
	}
	
	public void dataDiri (String addFirstName1, String addFirstName2, String addLastName1, String addLastName2, int pilih) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		tunggu();
		
		listTitle1.click();
		List<Keys> listTitle1 = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			listTitle1.add(Keys.DOWN);
		}
		listTitle1.add(Keys.ENTER);
		CharSequence[] cs = listTitle1.toArray(new CharSequence[listTitle1.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
		
		firstName1.sendKeys(addFirstName1);
		lastName1.sendKeys(addLastName1);
		
		listTitle2.click();
		List<Keys> listTitle2 = new ArrayList<Keys>();
		for(int i=0; i<pilih; i++) {
			listTitle2.add(Keys.DOWN);
		}
		listTitle2.add(Keys.ENTER);
		CharSequence[] cs1 = listTitle1.toArray(new CharSequence[listTitle2.size()]);
		Actions keyDown1 = new Actions(driver); keyDown1.sendKeys(Keys.chord(cs1)).perform();
		
		firstName2.sendKeys(addFirstName2);
		lastName2.sendKeys(addLastName2);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		
		tunggu();
		
		paymentBank.click();
		
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("window.scrollBy(0, 500)");
		
		tunggu();
		
		checkBox_Agree.click();
		
		tunggu();
		
		btnConfirmBooking.click();
	}
	
	public String getTxtTitleBookingHotelPage() {
		return driver.getTitle();
	}
	
	public String getTxtReservationNumber() {
		tunggu();
		return txtReservationNumber.getText();
	}
	
	public void tunggu() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
