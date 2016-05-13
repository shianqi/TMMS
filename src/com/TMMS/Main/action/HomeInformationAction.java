package com.TMMS.Main.action;

import com.TMMS.Main.bean.Proclamation;
import com.TMMS.Main.service.SystemService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class HomeInformationAction extends ActionSupport{
	private Proclamation proclamation;
	
	public Proclamation getProclamation() {
		return proclamation;
	}

	public void setProclamation(Proclamation proclamation) {
		this.proclamation = proclamation;
	}

	@Override
	public String execute() throws Exception {
		SystemService systemService = new SystemService();
		proclamation = systemService.systemProclamationShowLast();
		return SUCCESS;
	}
	
}
