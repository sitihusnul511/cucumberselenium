package com.juaracoding.ujiancucumber.glue;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.ujiancucumber.config.AutomationFrameworkConfig;
import com.juaracoding.ujiancucumber.drivers.DriverSingleton;
import com.juaracoding.ujiancucumber.pages.BookingFlight;
import com.juaracoding.ujiancucumber.pages.BookingHotel;
import com.juaracoding.ujiancucumber.pages.LoginPage;
import com.juaracoding.ujiancucumber.utils.ConfigurationProperties;
import com.juaracoding.ujiancucumber.utils.Constants;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {
	
	private WebDriver driver;
	private LoginPage loginPage;
	private BookingHotel bookingHotel;
	private BookingFlight bookingFlight;
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		bookingHotel = new BookingHotel();
		bookingFlight = new BookingFlight();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@Given("Customer mengakses url")
	public void customer_mengakses_url() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	@When("Customer klik login button")
	public void customer_klik_login_button() {
		loginPage.submitLogin(configurationProperties.getEmail(), configurationProperties.getPassword());
	}
	
	@Then("Customer berhasil login")
	public void customer_berhasil_login() {
		driver.navigate().refresh();
		tunggu();
		assertEquals(configurationProperties.getTxtWelcome(), loginPage.getTxtWelcome());
	}
	
	@When ("Customer klik menu Hotel")
	public void customer_klik_menu_hotel() {
		bookingHotel.goToMenuHotel();
	}
	
	@And ("Customer mencari hotel")
	public void customer_mencari_hotel() {
		bookingHotel.findHotel(configurationProperties.getCity());
	}
	
	@And ("Customer memilih hotel")
	public void customer_memilih_hotel() {
		bookingHotel.pilihHotel();
	}
	
	@And ("Customer mengisi data diri")
	public void customer_mengisi_data_diri() {
		bookingHotel.dataDiri(configurationProperties.getAddFirstName1(), configurationProperties.getAddFirstName2(), configurationProperties.getAddLastName1(), configurationProperties.getAddLastName2(), 1);
	}
	
	
	@Then ("Customer berhasil booking hotel")
	public void customer_berhasil_booking_hotel() {
		assertEquals(configurationProperties.getTxtPageTitleBookingHotel(), bookingHotel.getTxtTitleBookingHotelPage());
		assertEquals(configurationProperties.getReservationNumber(), bookingHotel.getTxtReservationNumber());
	}
	
	
	
	@When("Customer klik menu Flight")
	public void customer_klik_menu_flight() {
		bookingFlight.goToMenuFlight();
		
	}
	
	@And("Customer mencari flight")
	public void customer_mencari_flight() {
		bookingFlight.findFlight(configurationProperties.getBandara_from(), configurationProperties.getBandara_destination(), configurationProperties.getDate());
	}
	
	@And("Customer memilih flight")
	public void customer_memilih_flight() {
		bookingFlight.pickFlight();
	}
	
	@And("Customer mengisi data diri flight")
	public void customer_mengisi_data_diri_flight() {
		bookingFlight.dataDiri(1, configurationProperties.getFn(), configurationProperties.getLn(), configurationProperties.getPassID());
	}
	
	@Then("Customer berhasil booking flight")
	public void customer_berhasil_booking_flight() {
		assertEquals(configurationProperties.getTxtPageTitleBookingFlight(), bookingFlight.getTxtTitleBookingFlightPage());
		assertEquals(configurationProperties.getReservationNumberFlight(), configurationProperties.getReservationNumberFlight());
	}
	
	public void tunggu() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	

}
