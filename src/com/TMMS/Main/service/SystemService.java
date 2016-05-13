package com.TMMS.Main.service;

import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.TMMS.Main.DAO.ProclamationDAO;
import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.bean.Proclamation;

public class SystemService {
	public boolean systemProclamationAdd(long username,String title,String Text){
		try {
			Proclamation proclamation = new Proclamation();
			UsersDAO uDao = new UsersDAO();
			long id= 0;
			proclamation.setPId(id);
			proclamation.setUsers(uDao.findById(username));
			proclamation.setPTitle(title);
			proclamation.setPText(Text);
			
			proclamation.setPTime(new Date(System.currentTimeMillis()));
			
			ProclamationDAO proclamationDAO = new ProclamationDAO();
			proclamationDAO.save(proclamation);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("SystemService´íÎó");
			return false;
		}
		return true;
	}
	
	public boolean systemProclamationShow(){
		try {
			ProclamationDAO pDao = new ProclamationDAO();
			List<Proclamation> list = pDao.findAllProclamation();
			ServletActionContext.getRequest().setAttribute("proclamationList", list);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Proclamation systemProclamationShowLast(){
		ProclamationDAO pDao = new ProclamationDAO();
		List<Proclamation> proList = pDao.findAll();
		Proclamation proclamation = proList.get(proList.size()-1);
		return proclamation;
	}
	
	public Proclamation systemProclamationShowDetail(Long proclamationId){
		ProclamationDAO pDao = new ProclamationDAO();
		Proclamation proclamation = pDao.findById(proclamationId);
		return proclamation;
	}
	
	public boolean systemProclamationFixDetail(Long proclamationId,String proclamationTitle,String proclamationText){
		try {
			ProclamationDAO proclamationDAO = new ProclamationDAO();
			Proclamation proclamation = proclamationDAO.findById(proclamationId);
			proclamation.setPTitle(proclamationTitle);
			proclamation.setPText(proclamationText);
			proclamation.setPTime(new Date(System.currentTimeMillis()));
			proclamationDAO.save(proclamation);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean systemProclamationDel(Long proclamationId){
		try {
			ProclamationDAO proclamationDAO = new ProclamationDAO();
			Proclamation proclamation = proclamationDAO.findById(proclamationId);
			proclamationDAO.delete(proclamation);
		} catch (Exception e) {
			System.out.println("Error:SystemService.systemProclamationDel");
			return false;
		}
		return true;
	}
}
