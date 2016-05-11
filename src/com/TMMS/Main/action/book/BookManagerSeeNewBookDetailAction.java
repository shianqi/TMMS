package com.TMMS.Main.action.book;

import com.TMMS.Main.bean.Books;
import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class BookManagerSeeNewBookDetailAction extends ActionSupport{
	private Long bookId;
	private Books book;
	
	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
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
		if(UsersService.haveBookPurview()||UsersService.haveCollegePurview()){
			BooksService bService = new BooksService();
			book = bService.bookManagerSeeNewBookDetail(bookId);
			return SUCCESS;
		}
		return ERROR;
	}
}
