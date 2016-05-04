package com.TMMS.Main.bean;

import java.util.Date;

/**
 * AbstractOo entity provides the base persistence definition of the Oo entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractOo implements java.io.Serializable {

	// Fields

	private Long ooId;
	private Users users;
	private Orders orders;
	private Date ooTime;
	private Boolean ooType;
	private String ooReason;

	// Constructors

	/** default constructor */
	public AbstractOo() {
	}

	/** minimal constructor */
	public AbstractOo(Long ooId, Users users, Orders orders, Boolean ooType) {
		this.ooId = ooId;
		this.users = users;
		this.orders = orders;
		this.ooType = ooType;
	}

	/** full constructor */
	public AbstractOo(Long ooId, Users users, Orders orders, Date ooTime,
			Boolean ooType, String ooReason) {
		this.ooId = ooId;
		this.users = users;
		this.orders = orders;
		this.ooTime = ooTime;
		this.ooType = ooType;
		this.ooReason = ooReason;
	}

	// Property accessors

	public Long getOoId() {
		return this.ooId;
	}

	public void setOoId(Long ooId) {
		this.ooId = ooId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Date getOoTime() {
		return this.ooTime;
	}

	public void setOoTime(Date ooTime) {
		this.ooTime = ooTime;
	}

	public Boolean getOoType() {
		return this.ooType;
	}

	public void setOoType(Boolean ooType) {
		this.ooType = ooType;
	}

	public String getOoReason() {
		return this.ooReason;
	}

	public void setOoReason(String ooReason) {
		this.ooReason = ooReason;
	}

}