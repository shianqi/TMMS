package com.TMMS.Main.bean;

/**
 * AbstractUsers entity provides the base persistence definition of the Users
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsers implements java.io.Serializable {

	// Fields

	private Long UId;
	private String UPwd;
	private String UName;
	private Boolean UType;
	private String UEmail;
	private String UPhone;
	private Boolean UState;

	// Constructors

	/** default constructor */
	public AbstractUsers() {
	}

	/** minimal constructor */
	public AbstractUsers(Long UId, String UPwd, Boolean UType, String UEmail,
			Boolean UState) {
		this.UId = UId;
		this.UPwd = UPwd;
		this.UType = UType;
		this.UEmail = UEmail;
		this.UState = UState;
	}

	/** full constructor */
	public AbstractUsers(Long UId, String UPwd, String UName, Boolean UType,
			String UEmail, String UPhone, Boolean UState) {
		this.UId = UId;
		this.UPwd = UPwd;
		this.UName = UName;
		this.UType = UType;
		this.UEmail = UEmail;
		this.UPhone = UPhone;
		this.UState = UState;
	}

	// Property accessors

	public Long getUId() {
		return this.UId;
	}

	public void setUId(Long UId) {
		this.UId = UId;
	}

	public String getUPwd() {
		return this.UPwd;
	}

	public void setUPwd(String UPwd) {
		this.UPwd = UPwd;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public Boolean getUType() {
		return this.UType;
	}

	public void setUType(Boolean UType) {
		this.UType = UType;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	public String getUPhone() {
		return this.UPhone;
	}

	public void setUPhone(String UPhone) {
		this.UPhone = UPhone;
	}

	public Boolean getUState() {
		return this.UState;
	}

	public void setUState(Boolean UState) {
		this.UState = UState;
	}

}