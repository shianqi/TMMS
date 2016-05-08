package com.TMMS.Main.action.teacher;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class Teacher_book_delBookInformationAction extends ActionSupport{
	private Long bookId;
	
	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveTeacherPurview()){
			BooksService bService = new BooksService();
			if(bService.teacherDelBook(bookId)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
