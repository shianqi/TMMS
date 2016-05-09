package com.TMMS.Main.action.book;

import com.TMMS.Main.service.OrderCycleService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class BookManagerDelOrderCycleAction extends ActionSupport{
	private Long orderCycleId;
	
	public Long getOrderCycleId() {
		return orderCycleId;
	}

	public void setOrderCycleId(Long orderCycleId) {
		this.orderCycleId = orderCycleId;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveBookPurview()){
			OrderCycleService orderCycleService = new OrderCycleService();
			if(orderCycleService.bookManagerDelOrderCycle(orderCycleId)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
