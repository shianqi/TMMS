package com.TMMS.Main.service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.TMMS.Main.DAO.BoDAO;
import com.TMMS.Main.DAO.BooksDAO;
import com.TMMS.Main.DAO.BorderDAO;
import com.TMMS.Main.DAO.OrdercycleDAO;
import com.TMMS.Main.DAO.OrdersDAO;
import com.TMMS.Main.DAO.ProclamationDAO;
import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.bean.Bo;
import com.TMMS.Main.bean.BoId;
import com.TMMS.Main.bean.Books;
import com.TMMS.Main.bean.Border;
import com.TMMS.Main.bean.Ordercycle;
import com.TMMS.Main.bean.Orders;
import com.TMMS.Main.bean.Proclamation;
import com.TMMS.Main.bean.Users;
import com.opensymphony.xwork2.ActionContext;

public class BooksService {
	public class OrderBook{
		public Long bookId;
		public Long number;
	}
	private List<OrderBook> orderList = new ArrayList<OrderBook>();
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
				if(!list.contains(borderList.get(i).getBooks())&&borderList.get(i).getUsers().getUId().equals(username)){
					
					list.add(borderList.get(i).getBooks());
				}
			}
			
			ServletActionContext.getRequest().setAttribute("teacherOwnBooks", list);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean bookManagerShowCheckState(Long username){
		try {
			UsersDAO usersDAO = new UsersDAO();
			Users user = usersDAO.findById(username);
			
			BorderDAO borderDAO = new BorderDAO();
			Border border = new Border();
			border.setUsers(user);
			List<Border> borderList = (List<Border>)borderDAO.findByExample(border);
			
			List<Books> list = new ArrayList<Books>();
			
			for(int i=0;i<borderList.size();i++){
				if(!list.contains(borderList.get(i).getBooks())&&borderList.get(i).getBooks().getBState()==1){
					
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
	
	public void findByInformation(String bookInformation) {
		// TODO Auto-generated method stub
		BooksDAO booksDAO = new BooksDAO();
		List<Books> list = booksDAO.findByKeyword(bookInformation);
		ServletActionContext.getRequest().setAttribute("keywordBooksList", list);
	}
	
	public boolean orderAddBook(Long bookId,Long number) {
		// TODO Auto-generated method stub
		try {
			Map<String , Object> session = ActionContext.getContext().getSession();
			orderList = (ArrayList<OrderBook>)session.get("orderList");
			OrderBook orderBook = new OrderBook();
			orderBook.bookId = bookId;
			orderBook.number = number;
			boolean flag = false;
			if(orderList==null){
				orderList = new ArrayList<BooksService.OrderBook>();
			}
			for(int i=0;i<orderList.size();i++){
				if(orderList.get(i).bookId==bookId){
					orderList.get(i).number+=number;
					flag=true;
				}
			}
			if(!flag){
				orderList.add(orderBook);
			}
			session.put("orderList", orderList);
			return true;
		} catch (Exception e) {
			System.out.println("ERROR: BooksService.orderAddBook");
		}
		return false;
	}
	
	public boolean orderSubmit(Long orderCycleId){
		
			Map<String , Object> session = ActionContext.getContext().getSession();
			orderList = (ArrayList<OrderBook>)session.get("orderList");
			long username = Long.valueOf(String.valueOf(session.get("U_ID")));
			
			if(orderList==null||orderList.size()==0){
				return false;
			}
			Orders orders = new Orders();
			OrdersDAO ordersDAO = new OrdersDAO();
			OrdercycleDAO ordercycleDAO = new OrdercycleDAO();
			Ordercycle ordercycle = ordercycleDAO.findById(orderCycleId);
			UsersDAO usersDAO = new UsersDAO();
			Users users = usersDAO.findById(username);
			
			
			orders.setOrdercycle(ordercycle);
			orders.setUsers(users);
			orders.setOTime(new Date(System.currentTimeMillis()));
			orders.setOState(false);
			ordersDAO.save(orders);
			
			System.out.println(orderList.size());
			for(int i=0;i<orderList.size();i++){
				Bo bo = new Bo();
				BooksDAO booksDAO = new BooksDAO();
				Books book = booksDAO.findById(orderList.get(i).bookId);
				
				BoId boId = new BoId();
				boId.setBooks(book);
				boId.setOrders(orders);
				
				bo.setId(boId);
				bo.setBoNumber(orderList.get(i).number);
				BoDAO boDAO = new BoDAO();
				boDAO.save(bo);
			}
			return true;
	}
	
	public boolean showOrderList(){
		try {
			Map<String , Object> session = ActionContext.getContext().getSession();
			orderList = (ArrayList<OrderBook>)session.get("orderList");
			if(orderList==null){
				orderList=new ArrayList<BooksService.OrderBook>();
			}
			List<Books> myBooks = new ArrayList<Books>();
			
			for(int i=0;i<orderList.size();i++){
				BooksDAO booksDAO = new BooksDAO();
				Books book = booksDAO.findById(orderList.get(i).bookId);
				myBooks.add(book);
			}
			ServletActionContext.getRequest().setAttribute("myOrderList", myBooks);
			ServletActionContext.getRequest().setAttribute("myOrderListNumber", orderList);
			
			OrdercycleDAO oDao = new OrdercycleDAO();
			List<Ordercycle> list = (List<Ordercycle>)oDao.findAll();
			ServletActionContext.getRequest().setAttribute("OrderCycleList", list);
			
			return true;
		} catch (Exception e) {
			System.out.println("ERROR: BooksService.orderSubmit");
		}
		return false;
	}
	
	public boolean orderDelBook(Long bookId){
		try {
			Map<String , Object> session = ActionContext.getContext().getSession();
			orderList = (ArrayList<OrderBook>)session.get("orderList");

			for(int i=0;i<orderList.size();i++){
				if(orderList.get(i).bookId==bookId){
					orderList.remove(i);
					break;
				}
			}
			return true;
		} catch (Exception e) {
			System.out.println("ERROR: BooksService.orderDelBook");
		}
		return false;
	}
}
