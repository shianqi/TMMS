package com.TMMS.Main.action;

import java.util.Map;

import org.apache.commons.lang.ObjectUtils.Null;

import com.TMMS.Main.bean.Users;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FixUserInformationActionDown extends ActionSupport{
	private String name;
	private String phone;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String , Object> session = ActionContext.getContext().getSession();
		if(session.get("state")==null||session.get("state").equals("")){
			return ERROR; 
		}
		
		long username = Long.valueOf(String.valueOf(session.get("U_ID")));
		UsersService usersService = new UsersService();
		Users users = usersService.getUserDAO(username);
		
		if(name==null||name.equals("")){
			name=users.getUName();
		}
		if(phone==null||phone.equals("")){
			phone=users.getUPhone();
		}
		if(email==null||email.equals("")){
			email=users.getUEmail();
		}
		
		if(usersService.fixUserInformation(username,name,phone,email )){
			return SUCCESS;
		}else{
			return ERROR;
		}
		
	}
}
