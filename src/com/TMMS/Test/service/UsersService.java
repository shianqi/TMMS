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
			System.out.println("µÇÂ½³É¹¦");
			System.out.println("»¶Ó­Äú"+user.getUName());
		}else{
			System.out.println("µÇÂ½Ê§°Ü");
		}
	}
	
	@Test
	public void fixUserInformation(){
		UsersDAO usersDAO = new UsersDAO();
		try {
			long username = 141122427;
			Users user = usersDAO.findById(username);
			user.setUName("³É¹¦");
			user.setUPhone("1566113173");
			user.setUEmail("email");
			usersDAO.save(user);
		} catch (Exception e) {
			
		}
	}
}
