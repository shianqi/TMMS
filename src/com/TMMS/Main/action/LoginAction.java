package com.TMMS.Main.action;
import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private String U_Email;
	private String U_Pwd;
	
	public String getU_Email() {
		return U_Email;
	}

	public void setU_Email(String u_Email) {
		U_Email = u_Email;
	}

	public String getU_Pwd() {
		return U_Pwd;
	}

	public void setU_Pwd(String u_Pwd) {
		U_Pwd = u_Pwd;
	}

	/**
	 * @return
	 */
	public String execute() {
		// TODO Auto-generated method stub
		System.out.println(U_Email);
		UsersService usersService = new UsersService();
		if(usersService.login()){
			return SUCCESS;
		}else{
			return ERROR;
		}
	

	}
}