package com.TMMS.Main.bean;

import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */
public class Orders extends AbstractOrders implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Long OId, Ordercycle ordercycle, Users users) {
		super(OId, ordercycle, users);
	}

	/** full constructor */
	public Orders(Long OId, Ordercycle ordercycle, Users users, String OClass,
			Boolean OState, Set oos, Set bos) {
		super(OId, ordercycle, users, OClass, OState, oos, bos);
	}

}
