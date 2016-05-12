package com.TMMS.Main.action.college;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class College_order_showDetailAction extends ActionSupport{
	private Long orderId;
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Override
	public String execute() throws Exception {
		if(UsersService.haveBookPurview()){
			BooksService booksService = new BooksService();
			if(booksService.showOrderDetaill(orderId)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
