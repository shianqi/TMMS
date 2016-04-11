package com.TMMS.Main.service;

import java.util.Date;

import me.hupeng.ipLocationService.IpLocationResult;
import me.hupeng.ipLocationService.IpLocationService;

import com.TMMS.Main.DAO.UlDAO;
import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.bean.Ul;
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
	public boolean fixUserInformation(long username,String uName,String uPhone,String uEmail){
		UsersDAO usersDAO = new UsersDAO();
		try {
			Users user = usersDAO.findById(username);
			user.setUName(uName);
			user.setUPhone(uPhone);
			user.setUEmail(uEmail);
			usersDAO.save(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean fixPassword(Long username,String password_old,String password_new1){
		UsersDAO usersDAO = new UsersDAO();
		try {
			Users user = usersDAO.findById(username);
			if(password_old.equals(user.getUPwd())){
				user.setUPwd(password_new1);
				usersDAO.save(user);
				return true;
			}else{
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
	public void addLoginLog(Long username,String IP){
		UsersDAO usersDAO = new UsersDAO();
		Users user = usersDAO.findById(username);
		IpLocationService ipLocationService=new IpLocationService();
		System.out.println(IP);
		IpLocationResult ipLocationResult = ipLocationService.getIpLocationResult(IP);
		
		Ul ul = new Ul();
		long id= 0;
		ul.setUlId(id);
		ul.setUlIp(IP);
		ul.setUlTime(new Date(System.currentTimeMillis()));
		ul.setUsers(user);
		ul.setUlLocation(ipLocationResult.getCountry()+" "+ipLocationResult.getProvince()+" "+ipLocationResult.getCity());
		
		UlDAO ulDAO = new UlDAO();
		ulDAO.save(ul);
	}
}
