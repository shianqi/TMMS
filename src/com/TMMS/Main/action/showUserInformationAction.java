package com.TMMS.Main.action;

import java.util.Map;

import com.TMMS.Main.bean.Users;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class showUserInformationAction extends ActionSupport{
	private Users users;
	
	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}


	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String , Object> session = ActionContext.getContext().getSession();
		System.out.println(session.get("state")); 
		if(session.get("state")==null||session.get("state").equals("")){
			return ERROR; 
		}
		long username = Long.valueOf(String.valueOf(session.get("U_ID")));
		UsersService usersService = new UsersService();
		users = usersService.getUserDAO(username);
		return SUCCESS;
	}
}
