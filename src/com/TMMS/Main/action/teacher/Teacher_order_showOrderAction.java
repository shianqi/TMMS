package com.TMMS.Main.action.teacher;

import com.TMMS.Main.DAO.BooksDAO;
import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class Teacher_order_showOrderAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		if(UsersService.haveTeacherPurview()){
			BooksService bService = new BooksService();
			if(bService.showOrderList()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
