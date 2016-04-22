package com.TMMS.Main.action.user;

import java.util.Map;

import com.TMMS.Main.bean.Users;
import com.TMMS.Main.service.UsersService;
import com.TMMS.Main.util.MD5;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FixUserPasswordAction extends ActionSupport{
	private String password_old;
	private String password_new1;
	public String getPassword_old() {
		return password_old;
	}

	public void setPassword_old(String password_old) {
		this.password_old = password_old;
	}

	public String getPassword_new1() {
		return password_new1;
	}

	public void setPassword_new1(String password_new1) {
		this.password_new1 = password_new1;
	}

	public String getPassword_new2() {
		return password_new2;
	}

	public void setPassword_new2(String password_new2) {
		this.password_new2 = password_new2;
	}

	private String password_new2;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String , Object> session = ActionContext.getContext().getSession();
		if(session.get("state")==null||session.get("state").equals("")){
			return ERROR; 
		}
		
		long username = Long.valueOf(String.valueOf(session.get("U_ID")));
		UsersService usersService = new UsersService();
		if(!password_new1.equals(password_new2)){
			return ERROR;
		}
		if(usersService.fixPassword(username, new MD5().encryptPassword(password_old), new MD5().encryptPassword(password_new1))){
			return SUCCESS;
		}
		return ERROR;
	}
	
}
