package com.TMMS.Main.service;

import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.bean.Users;

public class UsersService {
	public boolean login(long username , String password){
		UsersDAO usersDAO = new UsersDAO();
		Users user = usersDAO.findById(username);
		if(password.equals(user.getUPwd())){
			System.out.println("��½�ɹ�");
			System.out.println("��ӭ��"+user.getUName());
			return true;
		}else{
			System.out.println("��½ʧ��");
			return false;
		}
		
	}
	
	
}
