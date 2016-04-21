package com.TMMS.Main.bean;

import java.util.Date;

/**
 * Proclamation entity. @author MyEclipse Persistence Tools
 */
public class Proclamation extends AbstractProclamation implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Proclamation() {
	}

	/** full constructor */
	public Proclamation(Long PId, Users users, String PText, Date PTime) {
		super(PId, users, PText, PTime, PText);
	}

}
