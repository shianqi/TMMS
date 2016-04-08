package com.TMMS.Main.bean;

/**
 * BoId entity. @author MyEclipse Persistence Tools
 */
public class BoId extends AbstractBoId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BoId() {
	}

	/** full constructor */
	public BoId(Books books, Orders orders) {
		super(books, orders);
	}

}
