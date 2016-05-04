package com.TMMS.Main.bean;

import java.util.Date;

/**
 * Border entity. @author MyEclipse Persistence Tools
 */
public class Border extends AbstractBorder implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Border() {
	}

	/** minimal constructor */
	public Border(Long borderId, Users users, Orders orders, Byte borderType) {
		super(borderId, users, orders, borderType);
	}

	/** full constructor */
	public Border(Long borderId, Users users, Orders orders, Date borderTime,
			Byte borderType, String borderReason) {
		super(borderId, users, orders, borderTime, borderType, borderReason);
	}

}
