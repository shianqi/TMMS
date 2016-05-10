package com.TMMS.Main.action.teacher;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class Teacher_order_searchBookAction extends ActionSupport{
	private String bookInformation;

	public String getBookInformation() {
		return bookInformation;
	}

	public void setBookInformation(String bookInformation) {
		this.bookInformation = bookInformation;
	}
	
	@Override
	public String execute() throws Exception {
		if(UsersService.haveTeacherPurview()){
			BooksService bService = new BooksService();
			bService.findByInformation(bookInformation);
			return SUCCESS;
		}
		return ERROR;
	}
}
