package com.TMMS.Main.bean;

import java.util.Date;

/**
 * AbstractUl entity provides the base persistence definition of the Ul entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractUl implements java.io.Serializable {

	// Fields

	private Long ulId;
	private Users users;
	private Date ulTime;
	private String ulIp;
	private String ulLocation;

	// Constructors

	/** default constructor */
	public AbstractUl() {
	}

	/** minimal constructor */
	public AbstractUl(Long ulId, Users users, Date ulTime, String ulIp) {
		this.ulId = ulId;
		this.users = users;
		this.ulTime = ulTime;
		this.ulIp = ulIp;
	}

	/** full constructor */
	public AbstractUl(Long ulId, Users users, Date ulTime, String ulIp,
			String ulLocation) {
		this.ulId = ulId;
		this.users = users;
		this.ulTime = ulTime;
		this.ulIp = ulIp;
		this.ulLocation = ulLocation;
	}

	// Property accessors

	public Long getUlId() {
		return this.ulId;
	}

	public void setUlId(Long ulId) {
		this.ulId = ulId;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Date getUlTime() {
		return this.ulTime;
	}

	public void setUlTime(Date ulTime) {
		this.ulTime = ulTime;
	}

	public String getUlIp() {
		return this.ulIp;
	}

	public void setUlIp(String ulIp) {
		this.ulIp = ulIp;
	}

	public String getUlLocation() {
		return this.ulLocation;
	}

	public void setUlLocation(String ulLocation) {
		this.ulLocation = ulLocation;
	}

}