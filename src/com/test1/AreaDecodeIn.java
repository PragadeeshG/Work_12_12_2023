package com.test1;

public class AreaDecodeIn {
	private Integer id;
	private String areaCode;
	private String areaDecode;
	private String areaDetails;
	private String modifiedDate;
	private String entityState;

	public AreaDecodeIn() {

	}

	public AreaDecodeIn(Integer id, String areaCode, String areaDecode, String areaDetails, String modifiedDate,
			String entityState) {
		super();
		this.id = id;
		this.areaCode = areaCode;
		this.areaDecode = areaDecode;
		this.areaDetails = areaDetails;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaDecode() {
		return areaDecode;
	}

	public void setAreaDecode(String areaDecode) {
		this.areaDecode = areaDecode;
	}

	public String getAreaDetails() {
		return areaDetails;
	}

	public void setAreaDetails(String areaDetails) {
		this.areaDetails = areaDetails;
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
