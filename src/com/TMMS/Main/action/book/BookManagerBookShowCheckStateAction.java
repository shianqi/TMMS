package com.TMMS.Main.action.book;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class BookManagerBookShowCheckStateAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveTeacherPurview()){
			BooksService bService = new BooksService();
			if(bService.bookManagerShowCheckState(UsersService.getUserId())){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
