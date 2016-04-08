package com.TMMS.Main.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOrders entity provides the base persistence definition of the Orders
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOrders implements java.io.Serializable {

	// Fields

	private Long OId;
	private Ordercycle ordercycle;
	private Users users;
	private String OClass;
	private Boolean OState;
	private Set oos = new HashSet(0);
	private Set bos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrders() {
	}

	/** minimal constructor */
	public AbstractOrders(Long OId, Ordercycle ordercycle, Users users) {
		this.OId = OId;
		this.ordercycle = ordercycle;
		this.users = users;
	}

	/** full constructor */
	public AbstractOrders(Long OId, Ordercycle ordercycle, Users users,
			String OClass, Boolean OState, Set oos, Set bos) {
		this.OId = OId;
		this.ordercycle = ordercycle;
		this.users = users;
		this.OClass = OClass;
		this.OState = OState;
		this.oos = oos;
		this.bos = bos;
	}

	// Property accessors

	public Long getOId() {
		return this.OId;
	}

	public void setOId(Long OId) {
		this.OId = OId;
	}

	public Ordercycle getOrdercycle() {
		return this.ordercycle;
	}

	public void setOrdercycle(Ordercycle ordercycle) {
		this.ordercycle = ordercycle;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getOClass() {
		return this.OClass;
	}

	public void setOClass(String OClass) {
		this.OClass = OClass;
	}

	public Boolean getOState() {
		return this.OState;
	}

	public void setOState(Boolean OState) {
		this.OState = OState;
	}

	public Set getOos() {
		return this.oos;
	}

	public void setOos(Set oos) {
		this.oos = oos;
	}

	public Set getBos() {
		return this.bos;
	}

	public void setBos(Set bos) {
		this.bos = bos;
	}

}