package com.TMMS.Test.service;

import org.junit.Test;

import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.bean.Users;
import com.TMMS.Main.util.MD5;

public class UsersService {
	@Test
	public void getPasswordSecret(){
		String password = "121021";
		System.out.println(new MD5().encryptPassword(password));
	}
	
	@Test
	public void login(){
		long username = 141122427;
		String password = "121021";
		UsersDAO usersDAO = new UsersDAO();
		Users user = usersDAO.findById(username);
		if(password.equals(user.getUPwd())){
			System.out.println("��½�ɹ�");
			System.out.println("��ӭ��"+user.getUName());
		}else{
			System.out.println("��½ʧ��");
		}
	}
	
	@Test
	public void fixUserInformation(){
		UsersDAO usersDAO = new UsersDAO();
		try {
			long username = 141122427;
			Users user = usersDAO.findById(username);
			user.setUName("�ɹ�");
			user.setUPhone("1566113173");
			user.setUEmail("email");
			usersDAO.save(user);
		} catch (Exception e) {
			
		}
	}
}
