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
	public Oo(OoId id, Long ooId, Boolean ooType) {
		super(id, ooId, ooType);
	}

	/** full constructor */
	public Oo(OoId id, Long ooId, Date ooTime, Boolean ooType, String ooReason) {
		super(id, ooId, ooTime, ooType, ooReason);
	}

}
