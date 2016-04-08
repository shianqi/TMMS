package com.TMMS.Main.action;

import java.util.Map;

import com.TMMS.Main.Model.loginModel;
import com.TMMS.Main.service.UsersService;
import com.TMMS.Main.util.MD5;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class loginAction extends ActionSupport{
	private long username;
	private String password;
	private UsersService usersService;
	private loginModel loginModel;

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

	public loginModel getLoginModel() {
		return loginModel;
	}

	public void setLoginModel(loginModel loginModel) {
		this.loginModel = loginModel;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("111");
		loginModel = new loginModel();
		usersService = new UsersService();
		if(password!=null&&usersService.login(username, new MD5().encryptPassword(password))){
			//获取session对象
			Map<String , Object> session = ActionContext.getContext().getSession();
			session.put(""+username, username);
			loginModel.setStatus(1);
			loginModel.setErrorCode("");
		}else{
			loginModel.setStatus(0);
			loginModel.setErrorCode("用户名或密码错误");
		}
		return SUCCESS;
	}
	
}
