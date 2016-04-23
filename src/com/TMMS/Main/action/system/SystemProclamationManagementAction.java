package com.TMMS.Main.action.system;

import java.util.Map;

import com.TMMS.Main.service.SystemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SystemProclamationManagementAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		Map<String, Object> sessionMap =ActionContext.getContext().getSession();
		if(sessionMap.get("state")==null||sessionMap.get("state").equals("")){
			return ERROR;
		}
		
		if(sessionMap.get("U_P_S").equals("true")){
			SystemService service = new SystemService();
			if(service.systemProclamationShow()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
}
