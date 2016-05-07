package com.TMMS.Main.service;

import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.TMMS.Main.DAO.BooksDAO;
import com.TMMS.Main.DAO.BorderDAO;
import com.TMMS.Main.DAO.ProclamationDAO;
import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.bean.Books;
import com.TMMS.Main.bean.Border;
import com.TMMS.Main.bean.Proclamation;
import com.TMMS.Main.bean.Users;

public class BooksService {
	/**
	 * teacher用户添加图书
	 * @param username
	 * @param BName
	 * @param BAuthor
	 * @param BPrice
	 * @param BIsbn
	 * @param BPress
	 * @param BOrder
	 * @param BPlan
	 * @param BBorders
	 * @param BGrand
	 * @return 是否成功
	 */
	public boolean teacherAddBook(Long username,String BName,String BAuthor,Double BPrice,
			String BIsbn,String BPress,String BOrder,String BPlan,String BBorders,String BGrand){
		try {
			Books book = new Books();
			long id = 1;
			long reserve = 0;
			book.setBName(BName);
			book.setBAuthor(BAuthor);
			book.setBPrice(BPrice);
			book.setBIsbn(BIsbn);
			book.setBPress(BPress);
			book.setBOrder(BOrder);
			book.setBPlan(BPlan);
			book.setBBorders(BBorders);
			book.setBGrand(BGrand);

			book.setBReserve(reserve);
			book.setBState(false);
			
			BooksDAO booksDAO = new BooksDAO();
			booksDAO.save(book);
			book = booksDAO.findById(book.getBId());
			
			int a= 1;
			Byte borderByte = (byte)a;
			Border border = new Border();
			BorderDAO borderDAO = new BorderDAO();
			Users users;
			UsersDAO usersDAO = new UsersDAO();
			users = usersDAO.findById(username);
			
			border.setBooks(book);
			border.setBorderReason("");
			//BorderType=1 表示添加
			border.setBorderType(borderByte);
			border.setBorderTime(new Date(System.currentTimeMillis()));
			border.setUsers(users);
			
			borderDAO.save(border);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean bookManagerSeeNewBooks(){
		try {
			BooksDAO bDao = new BooksDAO();
			List<Books> list = bDao.findAllNewBooks();
			ServletActionContext.getRequest().setAttribute("bookManagerSeeNewBooksList", list);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Books bookManagerSeeNewBookDetail(Long bookId){
		try {
			BooksDAO bDao = new BooksDAO();
			Books books = bDao.findById(bookId);
			ServletActionContext.getRequest().setAttribute("bookManagerSeeNewBookDetillBook", books);
			return books;
		} catch (Exception e) {
			return null;
		}
	}
}
