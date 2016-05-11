package com.TMMS.Main.bean;

import java.util.Date;
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
	public Orders(Long OId, Ordercycle ordercycle, Users users, Date OTime) {
		super(OId, ordercycle, users, OTime);
	}

	/** full constructor */
	public Orders(Long OId, Ordercycle ordercycle, Users users, String OClass,
			Boolean OState, Date OTime, Set oos, Set bos) {
		super(OId, ordercycle, users, OClass, OState, OTime, oos, bos);
	}

}
