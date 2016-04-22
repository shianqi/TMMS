package com.TMMS.Main.service;

import java.util.Date;

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
}
