package com.TMMS.Main.action.system;

import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class System_user_statisticalAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		if(UsersService.haveSystemPurview()){
			UsersService usersService = new UsersService();
			if(usersService.showUserStatistical()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
