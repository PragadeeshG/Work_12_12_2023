package com.test1;

public class Address {
	private Integer id;
	private String version;
	private String adressLine1;
	private String adressLine2;
	private String adressLine3;
	private String adressLine4;
	private String adressLine5;
	private String zipCode;
	private String city;
	private String state;
	private String country;

	public Address() {

	}

	public Address(Integer id, String version, String adressLine1, String adressLine2, String adressLine3,
			String adressLine4, String adressLine5, String zipCode, String city, String state, String country) {
		super();
		this.id = id;
		this.version = version;
		this.adressLine1 = adressLine1;
		this.adressLine2 = adressLine2;
		this.adressLine3 = adressLine3;
		this.adressLine4 = adressLine4;
		this.adressLine5 = adressLine5;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public String getAdressLine2() {
		return adressLine2;
	}

	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	public String getAdressLine3() {
		return adressLine3;
	}

	public void setAdressLine3(String adressLine3) {
		this.adressLine3 = adressLine3;
	}

	public String getAdressLine4() {
		return adressLine4;
	}

	public void setAdressLine4(String adressLine4) {
		this.adressLine4 = adressLine4;
	}

	public String getAdressLine5() {
		return adressLine5;
	}

	public void setAdressLine5(String adressLine5) {
		this.adressLine5 = adressLine5;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
