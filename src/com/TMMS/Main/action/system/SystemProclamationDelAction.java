package com.TMMS.Main.action.system;

import java.util.Map;

import com.TMMS.Main.service.SystemService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SystemProclamationDelAction extends ActionSupport{
	private Long proclamationId;
	private String errorReason;
	
	public String getErrorReason() {
		return errorReason;
	}

	public void setErrorReason(String errorReason) {
		this.errorReason = errorReason;
	}

	public Long getProclamationId() {
		return proclamationId;
	}

	public void setProclamationId(Long proclamationId) {
		this.proclamationId = proclamationId;
	}

	@Override
	public String execute() throws Exception {
		if(UsersService.haveSystemPurview()){
			SystemService service = new SystemService();
			service.systemProclamationDel(proclamationId);
			return SUCCESS;
		}
		errorReason = "È¨ÏÞ²»×ã";
		return ERROR;
	}
	
}
