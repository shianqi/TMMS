package com.TMMS.Main.action.teacher;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class Teacher_book_showOrderInfromationkAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		if(UsersService.haveTeacherPurview()){
			BooksService booksService = new BooksService();
			if(booksService.showOrderInformation()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
