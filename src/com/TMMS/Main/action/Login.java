package com.TMMS.Main.action;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public String execute() {
		// TODO Auto-generated method stub
		System.out.println(username);
		
		return ERROR;
	}
}