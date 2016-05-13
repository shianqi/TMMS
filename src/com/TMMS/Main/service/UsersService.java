package com.TMMS.Main.service;

import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import me.hupeng.ipLocationService.IpLocationResult;
import me.hupeng.ipLocationService.IpLocationService;

import com.TMMS.Main.DAO.UlDAO;
import com.TMMS.Main.DAO.UsersDAO;
import com.TMMS.Main.bean.Ul;
import com.TMMS.Main.bean.Users;
import com.TMMS.Main.util.MD5;
import com.opensymphony.xwork2.ActionContext;

public class UsersService {
	public static long getUserId(){
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		long username = Long.valueOf(String.valueOf(sessionMap.get("U_ID")));
		return username;
	}
	
	public static boolean haveTeacherPurview(){
		Map<String, Object> sessionMap =ActionContext.getContext().getSession();
		if(sessionMap.get("state")==null||sessionMap.get("state").equals("")){
			return false;
		}
		if(sessionMap.get("U_P_T").equals("true")){
			return true;
		}
		return false;
	}
	
	public static boolean haveCollegePurview(){
		Map<String, Object> sessionMap =ActionContext.getContext().getSession();
		if(sessionMap.get("state")==null||sessionMap.get("state").equals("")){
			return false;
		}
		if(sessionMap.get("U_P_C").equals("true")){
			return true;
		}
		return false;
	}
	
	public static boolean haveBookPurview(){
		Map<String, Object> sessionMap =ActionContext.getContext().getSession();
		if(sessionMap.get("state")==null||sessionMap.get("state").equals("")){
			return false;
		}
		if(sessionMap.get("U_P_B").equals("true")){
			return true;
		}
		return false;
	}
	
	public static boolean haveFinancialPurview(){
		Map<String, Object> sessionMap =ActionContext.getContext().getSession();
		if(sessionMap.get("state")==null||sessionMap.get("state").equals("")){
			return false;
		}
		if(sessionMap.get("U_P_F").equals("true")){
			return true;
		}
		return false;
	}
	
	public static boolean haveSystemPurview(){
		Map<String, Object> sessionMap =ActionContext.getContext().getSession();
		if(sessionMap.get("state")==null||sessionMap.get("state").equals("")){
			return false;
		}
		if(sessionMap.get("U_P_S").equals("true")){
			return true;
		}
		return false;
	}
	
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
	
	public boolean systemfixUserInformation(long username,String uPw,String uName,
			String uEmail,String uPhone,boolean upt,boolean upc,boolean upb,boolean upf,boolean ups){
		UsersDAO usersDAO = new UsersDAO();
		try {
			Users user = usersDAO.findById(username);
			if(!uPw.equals("")){
				user.setUPwd(new MD5().encryptPassword(uPw));
			}
			if(!uName.equals("")){
				user.setUName(uName);
			}
			if(!uEmail.equals("")){
				user.setUEmail(uEmail);
			}
			if(!uPhone.equals("")){
				user.setUPhone(uPhone);
			}
			user.setUPT(upt);
			user.setUPC(upc);
			user.setUPB(upb);
			user.setUPF(upf);
			user.setUPS(ups);
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
		IpLocationResult ipLocationResult = ipLocationService.getIpLocationResult(IP);
		
		Ul ul = new Ul();
		long id= 0;
		ul.setUlId(id);
		ul.setUlIp(IP);
		ul.setUlTime(new Date(System.currentTimeMillis()));
		ul.setUsers(user);
		try {
			ul.setUlLocation(ipLocationResult.getCountry()+" "+ipLocationResult.getProvince()+" "+ipLocationResult.getCity());
			
			UlDAO ulDAO = new UlDAO();
			ulDAO.save(ul);
		} catch (Exception e) {
			System.out.println("获取IP地址出错");
		}
		
		
	}
	
	public java.util.List<Ul> showUserLoginLog(Long username){
		UlDAO ulDAO = new UlDAO();
		Ul ul = new Ul();
		List<Ul> list = ulDAO.findLoginList10(username);
		return list;
	}
	
	public boolean addUser(long Uid,String UPwd,String UName,String UEmail,String UPhone,
			boolean UPT, boolean UPC, boolean UPB, boolean UPF, boolean UPS){
		try {
			Users users = new Users();
			users.setUId(Uid);
			users.setUPwd(UPwd);
			users.setUName(UName);
			users.setUEmail(UEmail);
			users.setUPhone(UPhone);
			users.setUPT(UPT);
			users.setUPC(UPC);
			users.setUPB(UPB);
			users.setUPF(UPF);
			users.setUPS(UPS);
			users.setUState(true);
			
			UsersDAO usersDAO = new UsersDAO();
			usersDAO.save(users);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean delUser(long Uid){
		try {
			UsersDAO usersDAO = new UsersDAO();
			Users users = usersDAO.findById(Uid);
			usersDAO.delete(users);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean admin_FixUserInformation(long Uid,String UPwd,String UName,String UEmail,String UPhone,
			boolean UPT, boolean UPC, boolean UPB, boolean UPF, boolean UPS,boolean state){

		
		UsersDAO usersDAO = new UsersDAO();
		Users users= usersDAO.findById(Uid);
		return true;
	}

	public void findByInformation(String userInformation) {
		// TODO Auto-generated method stub
		UsersDAO usersDAO = new UsersDAO();
		List<Users> list = usersDAO.findByKeyword(userInformation);
		ServletActionContext.getRequest().setAttribute("keywordList", list);
	}
	
	public boolean showUserStatistical(){
		try {
			UsersDAO usersDAO = new UsersDAO();
			List<Users> userList = usersDAO.findAll();
			int loginTime = 0;
			int loginToday = 0;
			
			Date dNow = new Date();   //当前时间
			Date dBefore = new Date();
			Calendar calendar = Calendar.getInstance(); //得到日历
			calendar.setTime(dNow);//把当前时间赋给日历
			calendar.add(Calendar.DAY_OF_MONTH, -1);  //设置为前一天
			dBefore = calendar.getTime();   //得到前一天的时间
			
			UlDAO ulDAO = new UlDAO();
			List<Ul> ulList = ulDAO.findAll();
			List<Long> todayList = new ArrayList<Long>();
			for(int i=0;i<ulList.size();i++){
				if(ulList.get(i).getUlTime().after(dBefore)){
					loginTime++;
					int xx= 0;
					for(int j=0;j<todayList.size();j++){
						if(todayList.get(j)==ulList.get(i).getUsers().getUId()){
							xx=1;
							break;
						}
					}
					if(xx==0){
						todayList.add(ulList.get(i).getUsers().getUId());
					}
				}
			}
			ServletActionContext.getRequest().setAttribute("UserAll", userList.size());
			ServletActionContext.getRequest().setAttribute("UserLogin", loginTime);
			ServletActionContext.getRequest().setAttribute("UserToday", todayList.size());
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
