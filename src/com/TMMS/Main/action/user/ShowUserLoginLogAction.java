package com.TMMS.Main.action.user;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.TMMS.Main.bean.Ul;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowUserLoginLogAction extends ActionSupport{
	List<Ul> list;

	public List<Ul> getList() {
		return list;
	}

	public void setList(List<Ul> list) {
		this.list = list;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> session= ActionContext.getContext().getSession();
		if(session.get("state")==null||session.get("state").equals("0")){
			return ERROR;
		}
		UsersService usersService = new UsersService();
		long username = Long.valueOf(String.valueOf(session.get("U_ID")));
		list = usersService.showUserLoginLog(username);
		ServletActionContext.getRequest().setAttribute("list", list);
		return SUCCESS;
	}
	
}
