package com.TMMS.Main.action.system;

import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class SystemUserDelUserAction extends ActionSupport{
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String execute() throws Exception {
		if(UsersService.haveSystemPurview()){
			UsersService usersService = new UsersService();
			Long username = Long.parseLong(userId);
			
			if(usersService.delUser(username)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
}
