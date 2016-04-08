package com.TMMS.Main.service;

import java.util.Map;

import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.Model.LoginModel;
import com.TMMS.Main.bean.Users;

public class UsersService {
	public boolean login(long username , String password){
		UsersDAO usersDAO = new UsersDAO();
		try {
			Users user = usersDAO.findById(username);
			if(password.equals(user.getUPwd())){
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}
	public Users getUserDAO(long username){
		UsersDAO usersDAO = new UsersDAO();
		Users user = usersDAO.findById(username);
		return user;
	}
	
	
}
