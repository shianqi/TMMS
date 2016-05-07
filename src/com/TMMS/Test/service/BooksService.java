package com.TMMS.Test.service;

import org.junit.Test;

public class BooksService {
	@Test
	public void teacherAddBook(){
		com.TMMS.Main.service.BooksService booksService = new com.TMMS.Main.service.BooksService();
		Double price = (double) 3;
		long username = 141122427;
		booksService.teacherAddBook(username,"≤‚ ‘Õº È", "1", price , "1", "1", "1", "1", "1", "1");
	}
}
