package com.TMMS.Main.bean;

import java.util.Date;

/**
 * Oo entity. @author MyEclipse Persistence Tools
 */
public class Oo extends AbstractOo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Oo() {
	}

	/** minimal constructor */
	public Oo(Long ooId, Users users, Orders orders, Boolean ooType) {
		super(ooId, users, orders, ooType);
	}

	/** full constructor */
	public Oo(Long ooId, Users users, Orders orders, Date ooTime,
			Boolean ooType, String ooReason) {
		super(ooId, users, orders, ooTime, ooType, ooReason);
	}

}
