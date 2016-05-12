package com.TMMS.Main.action.college;

import com.TMMS.Main.service.BooksService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class College_order_checkStateAction extends ActionSupport{
	private Integer state;
	private Long orderId;
	
	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	@Override
	public String execute() throws Exception {
		if(UsersService.haveCollegePurview()){
			BooksService booksService = new BooksService();
			if(booksService.orderStateChange(orderId, state)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
