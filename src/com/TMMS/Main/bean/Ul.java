package com.TMMS.Main.bean;

import java.util.Date;

/**
 * Ul entity. @author MyEclipse Persistence Tools
 */
public class Ul extends AbstractUl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ul() {
	}

	/** minimal constructor */
	public Ul(Long ulId, Users users, Date ulTime, String ulIp) {
		super(ulId, users, ulTime, ulIp);
	}

	/** full constructor */
	public Ul(Long ulId, Users users, Date ulTime, String ulIp,
			String ulLocation) {
		super(ulId, users, ulTime, ulIp, ulLocation);
	}

}
