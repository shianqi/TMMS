package com.TMMS.Main.action.system;

import com.opensymphony.xwork2.ActionSupport;

public class SystemProclamationAddAction extends ActionSupport{
	private String ProclamationTitle;
	private String ProclamationText;

	public String getProclamationTitle() {
		return ProclamationTitle;
	}

	public void setProclamationTitle(String proclamationTitle) {
		ProclamationTitle = proclamationTitle;
	}

	public String getProclamationText() {
		return ProclamationText;
	}

	public void setProclamationText(String proclamationText) {
		ProclamationText = proclamationText;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		return SUCCESS;
	}
	
}
