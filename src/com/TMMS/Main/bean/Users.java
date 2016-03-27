package com.TMMS.Main.bean;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */
public class Users extends AbstractUsers implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** minimal constructor */
	public Users(Long UId, String UPwd, Boolean UType, String UEmail,
			Boolean UState) {
		super(UId, UPwd, UType, UEmail, UState);
	}

	/** full constructor */
	public Users(Long UId, String UPwd, String UName, Boolean UType,
			String UEmail, String UPhone, Boolean UState) {
		super(UId, UPwd, UName, UType, UEmail, UPhone, UState);
	}

}
