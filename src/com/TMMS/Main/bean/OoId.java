package com.TMMS.Main.bean;

/**
 * OoId entity. @author MyEclipse Persistence Tools
 */
public class OoId extends AbstractOoId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public OoId() {
	}

	/** full constructor */
	public OoId(Orders orders, Users users) {
		super(orders, users);
	}

}
