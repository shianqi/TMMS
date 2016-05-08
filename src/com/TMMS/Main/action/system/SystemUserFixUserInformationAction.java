package com.TMMS.Main.action.system;

import org.apache.struts2.ServletActionContext;

import com.TMMS.Main.bean.Users;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class SystemUserFixUserInformationAction extends ActionSupport{
	private Long UId;
	private Users user;
	
	public Long getUId() {
		return UId;
	}

	public void setUId(Long uId) {
		UId = uId;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveSystemPurview()){
			UsersService usersService = new UsersService();
			user = usersService.getUserDAO(UId);
			ServletActionContext.getRequest().setAttribute("bookManagerSeeNewBookDetillBook", user);
			return SUCCESS;
		}
		return ERROR;
	}
	
}
