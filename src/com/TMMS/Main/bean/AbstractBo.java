package com.TMMS.Main.bean;

/**
 * AbstractBo entity provides the base persistence definition of the Bo entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractBo implements java.io.Serializable {

	// Fields

	private BoId id;
	private Long boNumber;

	// Constructors

	/** default constructor */
	public AbstractBo() {
	}

	/** full constructor */
	public AbstractBo(BoId id, Long boNumber) {
		this.id = id;
		this.boNumber = boNumber;
	}

	// Property accessors

	public BoId getId() {
		return this.id;
	}

	public void setId(BoId id) {
		this.id = id;
	}

	public Long getBoNumber() {
		return this.boNumber;
	}

	public void setBoNumber(Long boNumber) {
		this.boNumber = boNumber;
	}

}