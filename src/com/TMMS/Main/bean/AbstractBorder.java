package com.TMMS.Main.bean;

import java.util.Date;

/**
 * AbstractBorder entity provides the base persistence definition of the Border
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBorder implements java.io.Serializable {

	// Fields

	private Long borderId;
	private Books books;
	private Users users;
	private Date borderTime;
	private Byte borderType;
	private String borderReason;

	// Constructors

	/** default constructor */
	public AbstractBorder() {
	}

	/** minimal constructor */
	public AbstractBorder(Long borderId, Books books, Users users,
			Byte borderType) {
		this.borderId = borderId;
		this.books = books;
		this.users = users;
		this.borderType = borderType;
	}

	/** full constructor */
	public AbstractBorder(Long borderId, Books books, Users users,
			Date borderTime, Byte borderType, String borderReason) {
		this.borderId = borderId;
		this.books = books;
		this.users = users;
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

	public Books getBooks() {
		return this.books;
	}

	public void setBooks(Books books) {
		this.books = books;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
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