package com.test1;

public class CountryData {
	private Integer countryCode;
	private String countryName;
	private String desc;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public CountryData() {

	}

	public CountryData(Integer countryCode, String countryName, String desc, String creationDate, String modifiedDate,
			String entityState) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.desc = desc;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
