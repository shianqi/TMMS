package com.TMMS.Main.action.book;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.TMMS.Main.service.OrderCycleService;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class BookManagerNewOrderCycleAction extends ActionSupport{
	private String title;
	private String timeStart;
	private String timeEnd;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveBookPurview()){
			SimpleDateFormat sdf =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
			Date time1 = sdf.parse(timeStart);
			Date time2 = sdf.parse(timeEnd);
			OrderCycleService oService = new OrderCycleService();
			if(oService.bookManagerAddOrderCycle(title,time1,time2)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
