package com.TMMS.Main.action.system;

import java.util.Map;

import com.TMMS.Main.service.SystemService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SystemProclamationManagementAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		if(UsersService.haveSystemPurview()){
			SystemService service = new SystemService();
			if(service.systemProclamationShow()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
}
