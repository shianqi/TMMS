package com.TMMS.Main.action.system;

import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class SystemUserSearchUserAction extends ActionSupport{
	private String userInformation;

	public String getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(String userInformation) {
		this.userInformation = userInformation;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveSystemPurview()){
			UsersService usersService = new UsersService();
			usersService.findByInformation(userInformation);
			return SUCCESS;
		}
		return ERROR;
	}
	
}
