package com.TMMS.Main.action.teacher;

import java.util.Map;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherBookShowCheckStateAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveTeacherPurview()){
			BooksService bService = new BooksService();
			if(bService.teacherShowCheckState(UsersService.getUserId())){
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
}
