package com.TMMS.Main.bean;

import java.util.Date;

/**
 * AbstractProclamation entity provides the base persistence definition of the
 * Proclamation entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProclamation implements java.io.Serializable {

	// Fields

	private Long PId;
	private Users users;
	private String PText;
	private Date PTime;
	private String PTitle;

	// Constructors

	/** default constructor */
	public AbstractProclamation() {
	}

	/** full constructor */
	public AbstractProclamation(Long PId, Users users, String PText,
			Date PTime, String PTitle) {
		this.PId = PId;
		this.users = users;
		this.PText = PText;
		this.PTime = PTime;
		this.PTitle = PTitle;
	}

	// Property accessors

	public Long getPId() {
		return this.PId;
	}

	public void setPId(Long PId) {
		this.PId = PId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getPText() {
		return this.PText;
	}

	public void setPText(String PText) {
		this.PText = PText;
	}

	public Date getPTime() {
		return this.PTime;
	}

	public void setPTime(Date PTime) {
		this.PTime = PTime;
	}

	public String getPTitle() {
		return this.PTitle;
	}

	public void setPTitle(String PTitle) {
		this.PTitle = PTitle;
	}

}