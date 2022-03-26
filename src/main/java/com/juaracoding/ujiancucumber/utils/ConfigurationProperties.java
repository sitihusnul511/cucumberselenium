package com.juaracoding.ujiancucumber.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${email}")
	private String email;
	
	@Value("${password}")
	private String password;
	
	@Value("${user}")
	private String userName;
	
	@Value("${txtWelcome}")
	private String txtWelcome;
	
	@Value("${txtPageTitleBooking}")
	private String txtPageTitleBooking;
	
	@Value("${txtPageTitleBookingHotel}")
	private String txtPageTitleBookingHotel;
	
	@Value("${city}")
	private String city;
	
	@Value("${date_in}")
	private String date_in;
	
	@Value("${date_out}")
	private String date_out;
	
	@Value("${addFirstName1}")
	private String addFirstName1;
	
	@Value("${addFirstName2}")
	private String addFirstName2;
	
	@Value("${addLastName1}")
	private String addLastName1;
	
	@Value("${addLastName2}")
	private String addLastName2;
	
	@Value("${reservationNumber}")
	private String reservationNumber;
	
	@Value("${reservationNumberFlight}")
	private String reservationNumberFlight;
	
	@Value("${txtPageTitleBookingFlight}")
	private String txtPageTitleBookingFlight;
	
	@Value("${bandara_from}")
	private String bandara_from;
	
	@Value("${bandara_destination}")
	private String bandara_destination;
	
	@Value("${date}")
	private String date;
	
	@Value("${pilih}")
	private String pilih;
	
	@Value("${fn}")
	private String fn;
	
	@Value("${ln}")
	private String ln;
	
	@Value("${passID}")
	private String passID;
	

	

	public String getTxtPageTitleBooking() {
		return txtPageTitleBooking;
	}

	public void setTxtPageTitleBooking(String txtPageTitleBooking) {
		this.txtPageTitleBooking = txtPageTitleBooking;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTxtWelcome() {
		return txtWelcome;
	}

	public void setTxtWelcome(String txtWelcome) {
		this.txtWelcome = txtWelcome;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate_in() {
		return date_in;
	}

	public void setDate_in(String date_in) {
		this.date_in = date_in;
	}

	public String getDate_out() {
		return date_out;
	}

	public void setDate_out(String date_out) {
		this.date_out = date_out;
	}

	public String getAddFirstName1() {
		return addFirstName1;
	}

	public void setAddFirstName1(String addFirstName1) {
		this.addFirstName1 = addFirstName1;
	}

	public String getAddFirstName2() {
		return addFirstName2;
	}

	public void setAddFirstName2(String addFirstName2) {
		this.addFirstName2 = addFirstName2;
	}

	public String getAddLastName1() {
		return addLastName1;
	}

	public void setAddLastName1(String addLastName1) {
		this.addLastName1 = addLastName1;
	}

	public String getAddLastName2() {
		return addLastName2;
	}

	public void setAddLastName2(String addLastName2) {
		this.addLastName2 = addLastName2;
	}

	public String getTxtPageTitleBookingHotel() {
		return txtPageTitleBookingHotel;
	}

	public void setTxtPageTitleBookingHotel(String txtPageTitleBookingHotel) {
		this.txtPageTitleBookingHotel = txtPageTitleBookingHotel;
	}

	public String getReservationNumber() {
		return reservationNumber;
	}

	public void setReservationNumber(String reservationNumber) {
		this.reservationNumber = reservationNumber;
	}

	public String getReservationNumberFlight() {
		return reservationNumberFlight;
	}

	public void setReservationNumberFlight(String reservationNumberFlight) {
		this.reservationNumberFlight = reservationNumberFlight;
	}

	public String getTxtPageTitleBookingFlight() {
		return txtPageTitleBookingFlight;
	}

	public void setTxtPageTitleBookingFlight(String txtPageTitleBookingFlight) {
		this.txtPageTitleBookingFlight = txtPageTitleBookingFlight;
	}

	public String getBandara_from() {
		return bandara_from;
	}

	public void setBandara_from(String bandara_from) {
		this.bandara_from = bandara_from;
	}

	public String getBandara_destination() {
		return bandara_destination;
	}

	public void setBandara_destination(String bandara_destination) {
		this.bandara_destination = bandara_destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPilih() {
		return pilih;
	}

	public void setPilih(String pilih) {
		this.pilih = pilih;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getPassID() {
		return passID;
	}

	public void setPassID(String passID) {
		this.passID = passID;
	}
	
	
	
}
