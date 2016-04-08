package com.TMMS.Main.bean;

import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
public class Users extends AbstractUsers implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Long UId, String UPwd, String UEmail, Boolean UPT,
			Boolean UPC, Boolean UPB, Boolean UPF, Boolean UPS, Boolean UState) {
		super(UId, UPwd, UEmail, UPT, UPC, UPB, UPF, UPS, UState);
	}

	/** full constructor */
	public Users(Long UId, String UPwd, String UName, String UEmail,
			String UPhone, Boolean UPT, Boolean UPC, Boolean UPB, Boolean UPF,
			Boolean UPS, Boolean UState, Set uls, Set orderses, Set oos,
			Set proclamations) {
		super(UId, UPwd, UName, UEmail, UPhone, UPT, UPC, UPB, UPF, UPS,
				UState, uls, orderses, oos, proclamations);
	}

}
