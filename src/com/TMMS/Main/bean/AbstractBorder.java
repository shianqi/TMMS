package com.TMMS.Main.bean;

import java.util.Date;

/**
 * AbstractBorder entity provides the base persistence definition of the Border
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBorder implements java.io.Serializable {

	// Fields

	private Long borderId;
	private Users users;
	private Orders orders;
	private Date borderTime;
	private Byte borderType;
	private String borderReason;

	// Constructors

	/** default constructor */
	public AbstractBorder() {
	}

	/** minimal constructor */
	public AbstractBorder(Long borderId, Users users, Orders orders,
			Byte borderType) {
		this.borderId = borderId;
		this.users = users;
		this.orders = orders;
		this.borderType = borderType;
	}

	/** full constructor */
	public AbstractBorder(Long borderId, Users users, Orders orders,
			Date borderTime, Byte borderType, String borderReason) {
		this.borderId = borderId;
		this.users = users;
		this.orders = orders;
		this.borderTime = borderTime;
		this.borderType = borderType;
		this.borderReason = borderReason;
	}

	// Property accessors

	public Long getBorderId() {
		return this.borderId;
	}

	public void setBorderId(Long borderId) {
		this.borderId = borderId;
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

	public Date getBorderTime() {
		return this.borderTime;
	}

	public void setBorderTime(Date borderTime) {
		this.borderTime = borderTime;
	}

	public Byte getBorderType() {
		return this.borderType;
	}

	public void setBorderType(Byte borderType) {
		this.borderType = borderType;
	}

	public String getBorderReason() {
		return this.borderReason;
	}

	public void setBorderReason(String borderReason) {
		this.borderReason = borderReason;
	}

}