package com.TMMS.Main.action.system;

import java.util.Map;

import com.TMMS.Main.service.SystemService;
import com.TMMS.Main.service.UsersService;
import com.TMMS.Main.util.MD5;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/*
 * 系统管理员
 */
public class SystemProclamationAddAction extends ActionSupport{
	private String proclamationTitle;
	private String proclamationText;

	public String getProclamationTitle() {
		return proclamationTitle;
	}

	public void setProclamationTitle(String proclamationTitle) {
		this.proclamationTitle = proclamationTitle;
	}

	public String getProclamationText() {
		return proclamationText;
	}

	public void setProclamationText(String proclamationText) {
		this.proclamationText = proclamationText;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveSystemPurview()){
			Map<String, Object> sessionMap = ActionContext.getContext().getSession();
			long username = Long.valueOf(String.valueOf(sessionMap.get("U_ID")));
			SystemService service = new SystemService();
			if(service.systemProclamationAdd(username,proclamationTitle,proclamationText)){
				return SUCCESS;
			}
		}
		
		return ERROR;
	}
	
}
