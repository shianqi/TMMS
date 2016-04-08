package com.TMMS.Main.bean;

/**
 * AbstractBo entity provides the base persistence definition of the Bo entity. @author
 * MyEclipse Persistence Tools
 */

public abstract class AbstractBo implements java.io.Serializable {

	// Fields

	private BoId id;

	// Constructors

	/** default constructor */
	public AbstractBo() {
	}

	/** full constructor */
	public AbstractBo(BoId id) {
		this.id = id;
	}

	// Property accessors

	public BoId getId() {
		return this.id;
	}

	public void setId(BoId id) {
		this.id = id;
	}

}