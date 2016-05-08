package com.TMMS.Test.service;

import java.util.List;

import org.junit.Test;

import com.TMMS.Main.DAO.BooksDAO;
import com.TMMS.Main.bean.Books;

public class BooksService {
	@Test
	public void teacherAddBook(){
		com.TMMS.Main.service.BooksService booksService = new com.TMMS.Main.service.BooksService();
		Double price = (double) 3;
		long username = 141122427;
		booksService.teacherAddBook(username,"≤‚ ‘Õº È", "1", price , "1", "1", "1", "1", "1", "1");
	}
	
	@Test
	public void teacherAddBook2(){
		com.TMMS.Main.service.BooksService booksService = new com.TMMS.Main.service.BooksService();
		
		long username = 141122427;
		booksService.teacherShowCheckState(username);
	}

}
