package com.TMMS.Main.action.teacher;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class Teacher_order_addBookAction extends ActionSupport{
	private Long number;
	private Long bookId;
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
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
			BooksService booksService = new BooksService();
			if(booksService.orderAddBook(bookId,number)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
