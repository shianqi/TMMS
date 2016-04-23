package com.TMMS.Main.action.system;

import java.util.Map;

import oracle.net.aso.p;
import oracle.net.aso.s;

import com.TMMS.Main.bean.Proclamation;
import com.TMMS.Main.service.SystemService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SystemProclamationShowDetailAction extends ActionSupport{
	private Long proclamationId;
	private Proclamation proclamation;

	public Long getProclamationId() {
		return proclamationId;
	}

	public void setProclamationId(Long proclamationId) {
		this.proclamationId = proclamationId;
	}

	public Proclamation getProclamation() {
		return proclamation;
	}

	public void setProclamation(Proclamation proclamation) {
		this.proclamation = proclamation;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveSystemPurview()){
			SystemService service = new SystemService();
			this.proclamation = service.systemProclamationShowDetail(proclamationId);
			return SUCCESS;
		}
		return ERROR;
	}
}
