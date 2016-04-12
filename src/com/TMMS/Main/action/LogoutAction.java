package com.TMMS.Main.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		sessionMap.clear();
		return SUCCESS;
	}
}
