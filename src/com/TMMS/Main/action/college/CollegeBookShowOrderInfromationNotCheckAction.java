package com.TMMS.Main.action.college;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class CollegeBookShowOrderInfromationNotCheckAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		if(UsersService.haveCollegePurview()){
			BooksService booksService = new BooksService();
			if(booksService.showOrderInformationNotCheck()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
