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
	public Border(Long borderId, Books books, Users users, Byte borderType) {
		super(borderId, books, users, borderType);
	}

	/** full constructor */
	public Border(Long borderId, Books books, Users users, Date borderTime,
			Byte borderType, String borderReason) {
		super(borderId, books, users, borderTime, borderType, borderReason);
	}

}
