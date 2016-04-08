package com.TMMS.Main.action;

import java.util.Map;

import com.TMMS.Main.bean.Users;
import com.TMMS.Main.service.UsersService;
import com.TMMS.Main.util.MD5;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private long username;
	private String password;
	private UsersService usersService;

	public long getUsername() {
		return username;
	}

	public void setUsername(long username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		usersService = new UsersService();
		Users user = usersService.getUserDAO(username);
		Map<String , Object> session = ActionContext.getContext().getSession();
		if(password!=null&&usersService.login(username, new MD5().encryptPassword(password))){
			//获取session对象
			System.out.println(user.getUPT()+"");
			session.put("U_ID", username);
			session.put("U_State", user.getUState());
			session.put("U_Name", user.getUName());
			session.put("U_P_T", user.getUPT().toString());
			session.put("U_P_C", user.getUPC().toString());
			session.put("U_P_B", user.getUPB().toString()); 
			session.put("U_P_F", user.getUPF().toString());
			session.put("U_P_S", user.getUPS().toString());
			//密码判断状态
			session.put("state","1");
			return SUCCESS;
		}else{
			session.put("state","0");
			return ERROR;
		}
	}
	
}
