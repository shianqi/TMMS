package com.TMMS.Main.action.financial;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class FinancialLogAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		if(UsersService.haveFinancialPurview()){
			if(new BooksService().financialLog()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
