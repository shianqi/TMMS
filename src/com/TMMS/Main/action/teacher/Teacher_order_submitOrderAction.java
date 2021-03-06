package com.TMMS.Main.action.teacher;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class Teacher_order_submitOrderAction extends ActionSupport{
	private Long orderId;
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Override
	public String execute() throws Exception {
		if(UsersService.haveTeacherPurview()){
			BooksService booksService = new BooksService();
			if(booksService.orderSubmit(orderId)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
