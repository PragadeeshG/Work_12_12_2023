package com.test1;

public class City {
	private Integer city;
	private String name;
	private String desc;
	private boolean isMetro;
	private boolean isActive;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public City() {

	}

	public City(Integer city, String name, String desc, boolean isMetro, boolean isActive, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.city = city;
		this.name = name;
		this.desc = desc;
		this.isMetro = isMetro;
		this.isActive = isActive;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public boolean isMetro() {
		return isMetro;
	}

	public void setMetro(boolean isMetro) {
		this.isMetro = isMetro;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
