package com.TMMS.Main.service;

import java.awt.print.Book;
import java.util.ArrayList;
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
			book.setBState(0);
			
			BooksDAO booksDAO = new BooksDAO();
			booksDAO.save(book);
			book = booksDAO.findById(book.getBId());
			
			int a= 0;
			Byte borderByte = (byte)a;
			Border border = new Border();
			BorderDAO borderDAO = new BorderDAO();
			Users users;
			UsersDAO usersDAO = new UsersDAO();
			users = usersDAO.findById(username);
			
			border.setBooks(book);
			border.setBorderReason("");
			border.setBorderType(borderByte);
			border.setBorderTime(new Date(System.currentTimeMillis()));
			border.setUsers(users);
			
			borderDAO.save(border);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean bookManagerAddBook(Long username,String BName,String BAuthor,Double BPrice,
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
			book.setBState(1);
			
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
	
	public boolean bookManagerCheckOK(Long username,Long BId,String BName,String BAuthor,Double BPrice,
			String BIsbn,String BPress,String BOrder,String BPlan,String BBorders,String BGrand){
		
			BooksDAO bDao = new BooksDAO();
			BorderDAO borderDAO = new BorderDAO();
			UsersDAO usersDAO = new UsersDAO();
			Books book = bDao.findById(BId);
			book.setBName(BName);
			book.setBAuthor(BAuthor);
			book.setBPrice(BPrice);
			book.setBIsbn(BIsbn);
			book.setBPress(BPress);
			book.setBOrder(BOrder);
			if(BPlan==null){
				BPlan = "false";
			}
			if(BBorders==null){
				BBorders = "false";
			}
			if(BGrand==null){
				BGrand = "false";
			}
			book.setBPlan(BPlan);
			book.setBBorders(BBorders);
			book.setBGrand(BGrand);
			book.setBState(1);
			bDao.save(book);
			
			Border border = new Border();
			border.setBooks(book);
			Users user = usersDAO.findById(username);
			border.setUsers(user);
			border.setBorderTime(new Date(System.currentTimeMillis()));
			int a= 1;
			Byte stateByte = (byte)a;
			border.setBorderType(stateByte);
			borderDAO.save(border);
			
			
			return true;
		
	}
	
	public boolean teacherFixBookInformation(Long username,Long BId,String BName,String BAuthor,Double BPrice,
			String BIsbn,String BPress,String BOrder,String BPlan,String BBorders,String BGrand){
		
			BooksDAO bDao = new BooksDAO();
			Books book = bDao.findById(BId);
			book.setBName(BName);
			book.setBAuthor(BAuthor);
			book.setBPrice(BPrice);
			book.setBIsbn(BIsbn);
			book.setBPress(BPress);
			book.setBOrder(BOrder);
			if(BPlan==null){
				BPlan = "false";
			}
			if(BBorders==null){
				BBorders = "false";
			}
			if(BGrand==null){
				BGrand = "false";
			}
			if(book.getBState()==2){
				book.setBState(0);
			}
			book.setBPlan(BPlan);
			book.setBBorders(BBorders);
			book.setBGrand(BGrand);
			bDao.save(book);
			return true;
		
	}
	
	public boolean bookManagerCheckError(Long username,Long BId,String reason){
		try {
			BorderDAO borderDao = new BorderDAO();
			BooksDAO booksDAO = new BooksDAO();
			UsersDAO uDao = new UsersDAO();
			Border border = new Border();
			Books books = booksDAO.findById(BId);
			books.setBState(2);
			booksDAO.save(books);
			Users user = uDao.findById(username);
			
			border.setBooks(books);
			border.setUsers(user);
			border.setBorderTime(new Date(System.currentTimeMillis()));
			int a= 2;
			Byte stateByte = (byte)a;
			border.setBorderType(stateByte);
			border.setBorderReason(reason);
			borderDao.save(border);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean teacherShowCheckState(Long username){
		try {
			UsersDAO usersDAO = new UsersDAO();
			Users user = usersDAO.findById(username);
			
			BorderDAO borderDAO = new BorderDAO();
			Border border = new Border();
			border.setUsers(user);
			List<Border> borderList = (List<Border>)borderDAO.findByExample(border);
			
			List<Books> list = new ArrayList<Books>();
			
			for(int i=0;i<borderList.size();i++){
				if(!list.contains(borderList.get(i).getBooks())){
					list.add(borderList.get(i).getBooks());
				}
			}
			
			ServletActionContext.getRequest().setAttribute("teacherOwnBooks", list);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean teacherDelBook(Long BookId){
		try {
			BooksDAO booksDAO = new BooksDAO();
			Books book = booksDAO.findById(BookId);
			
			if(book.getBState()!=1){
				booksDAO.delete(book);
				return true;
			}
			return false;
		} catch (Exception e) {
			return false;
		}
	}
}
