package com.TMMS.Main.action.system;

import java.util.Map;

import com.TMMS.Main.service.SystemService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SystemProclamationFixDetailActionDown extends ActionSupport{
	private Long proclamationId;
	private String proclamationTitle;
	private String proclamationText;

	public Long getProclamationId() {
		return proclamationId;
	}

	public void setProclamationId(Long proclamationId) {
		this.proclamationId = proclamationId;
	}

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
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		if(sessionMap.get("state")==null||sessionMap.get("state").equals("")){
			return ERROR;
		}
		if(sessionMap.get("U_P_S").equals("true")){
			SystemService service = new SystemService();
			if(service.systemProclamationFixDetail(proclamationId, proclamationTitle, proclamationText)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
}
