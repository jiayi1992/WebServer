package com.webtechnology.moviereview.domain;

import java.math.BigDecimal;

public class Moviegoer {
	


	private String mname;
	private String street;
	private String city;
	private String state;
	private BigDecimal zip;
	private String phone;
	private String email;
	private String password;
	
	public Moviegoer(){
		this.mname = "";
		this.street = "";
		this.city = "";
		this.state = "";
		this.zip = new BigDecimal(0);
		this.phone = "";
		this.email = "";
		this.password = "";
	}
	
	public Moviegoer(String mname, String street, String city, String state, BigDecimal zip, String phone, String email,
			String password) {
		super();
		this.mname = mname;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}
	
	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getZip() {
		return zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	@Override
	public String toString() {
		return "Moviegoer [mname=" + mname + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", phone=" + phone + ", email=" + email + ", password=" + password + "]";
	}

}
