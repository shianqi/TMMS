package com.TMMS.Main.service;

import java.util.Date;
import java.util.List;

import oracle.net.aso.f;

import org.apache.struts2.ServletActionContext;

import com.TMMS.Main.DAO.OrdercycleDAO;
import com.TMMS.Main.bean.Ordercycle;
import com.TMMS.Main.bean.Orders;

public class OrderCycleService {
	public boolean bookManagerAddOrderCycle(String title,Date time1,Date time2){
		try {
			Ordercycle ordercycle = new Ordercycle();
			ordercycle.setOcCh(title);
			ordercycle.setOcSt(time1);
			ordercycle.setOcEt(time2);
			OrdercycleDAO oDao = new OrdercycleDAO();
			oDao.save(ordercycle);
			return true;
		} catch (Exception e) {
			System.out.println("ERROR:OrderCycleService.bookManagerAddOrderCycle");
		}
		return false;
	}
	
	public boolean bookManagerShowOrderCycle(){
		try {
			OrdercycleDAO oDao = new OrdercycleDAO();
			List<Ordercycle> list = (List<Ordercycle>)oDao.findAll();
			ServletActionContext.getRequest().setAttribute("OrderCycleList", list);
			return true;
		} catch (Exception e) {
			System.out.println("ERROR:OrderCycleService.bookManagerShowOrderCycle");
		}
		return false;
	}
	
	public boolean bookManagerDelOrderCycle(Long orderCycleId){
		try {
			OrdercycleDAO oDao = new OrdercycleDAO();
			Ordercycle ordercycle = oDao.findById(orderCycleId);
			oDao.delete(ordercycle);
			return true;
		} catch (Exception e) {
			System.out.println("ERROR:OrderCycleService.bookManagerDelOrderCycle");
		}
		return false;
	}
}
