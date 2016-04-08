package com.TMMS.Main.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUsers entity provides the base persistence definition of the Users
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsers implements java.io.Serializable {

	// Fields

	private Long UId;
	private String UPwd;
	private String UName;
	private String UEmail;
	private String UPhone;
	private Boolean UPT;
	private Boolean UPC;
	private Boolean UPB;
	private Boolean UPF;
	private Boolean UPS;
	private Boolean UState;
	private Set uls = new HashSet(0);
	private Set orderses = new HashSet(0);
	private Set oos = new HashSet(0);
	private Set proclamations = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUsers() {
	}

	/** minimal constructor */
	public AbstractUsers(Long UId, String UPwd, String UEmail, Boolean UPT,
			Boolean UPC, Boolean UPB, Boolean UPF, Boolean UPS, Boolean UState) {
		this.UId = UId;
		this.UPwd = UPwd;
		this.UEmail = UEmail;
		this.UPT = UPT;
		this.UPC = UPC;
		this.UPB = UPB;
		this.UPF = UPF;
		this.UPS = UPS;
		this.UState = UState;
	}

	/** full constructor */
	public AbstractUsers(Long UId, String UPwd, String UName, String UEmail,
			String UPhone, Boolean UPT, Boolean UPC, Boolean UPB, Boolean UPF,
			Boolean UPS, Boolean UState, Set uls, Set orderses, Set oos,
			Set proclamations) {
		this.UId = UId;
		this.UPwd = UPwd;
		this.UName = UName;
		this.UEmail = UEmail;
		this.UPhone = UPhone;
		this.UPT = UPT;
		this.UPC = UPC;
		this.UPB = UPB;
		this.UPF = UPF;
		this.UPS = UPS;
		this.UState = UState;
		this.uls = uls;
		this.orderses = orderses;
		this.oos = oos;
		this.proclamations = proclamations;
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

	public Boolean getUPT() {
		return this.UPT;
	}

	public void setUPT(Boolean UPT) {
		this.UPT = UPT;
	}

	public Boolean getUPC() {
		return this.UPC;
	}

	public void setUPC(Boolean UPC) {
		this.UPC = UPC;
	}

	public Boolean getUPB() {
		return this.UPB;
	}

	public void setUPB(Boolean UPB) {
		this.UPB = UPB;
	}

	public Boolean getUPF() {
		return this.UPF;
	}

	public void setUPF(Boolean UPF) {
		this.UPF = UPF;
	}

	public Boolean getUPS() {
		return this.UPS;
	}

	public void setUPS(Boolean UPS) {
		this.UPS = UPS;
	}

	public Boolean getUState() {
		return this.UState;
	}

	public void setUState(Boolean UState) {
		this.UState = UState;
	}

	public Set getUls() {
		return this.uls;
	}

	public void setUls(Set uls) {
		this.uls = uls;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getOos() {
		return this.oos;
	}

	public void setOos(Set oos) {
		this.oos = oos;
	}

	public Set getProclamations() {
		return this.proclamations;
	}

	public void setProclamations(Set proclamations) {
		this.proclamations = proclamations;
	}

}