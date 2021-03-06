package com.TMMS.Main.action.user;

import java.util.Map;

import com.TMMS.Main.bean.Users;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FixUserInformationAction extends ActionSupport{
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
		if(session.get("state")==null||session.get("state").equals("0")){
			return ERROR;
		}
		
		long username = Long.valueOf(String.valueOf(session.get("U_ID")));
		UsersService usersService = new UsersService();
		users = usersService.getUserDAO(username);
		return SUCCESS;
	}
	
}
