package com.TMMS.Main.action.book;

import com.TMMS.Main.service.OrderCycleService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class BookManagerShowOrderCycleAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveBookPurview()){
			OrderCycleService orderCycleService = new OrderCycleService();
			if(orderCycleService.bookManagerShowOrderCycle()){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
