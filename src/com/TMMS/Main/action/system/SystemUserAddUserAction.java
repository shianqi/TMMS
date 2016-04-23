package com.TMMS.Main.action.system;

import java.util.Map;

import com.TMMS.Main.service.UsersService;
import com.TMMS.Main.util.MD5;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SystemUserAddUserAction extends ActionSupport{
	private String uid;
	private String upw;
	private String uname;
	private String uphone;
	private String uemail;
	private boolean upt;
	private boolean upc;
	private boolean upb;
	private boolean upf;
	private boolean ups;
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public boolean isUpt() {
		return upt;
	}

	public void setUpt(boolean upt) {
		this.upt = upt;
	}

	public boolean isUpc() {
		return upc;
	}

	public void setUpc(boolean upc) {
		this.upc = upc;
	}

	public boolean isUpb() {
		return upb;
	}

	public void setUpb(boolean upb) {
		this.upb = upb;
	}

	public boolean isUpf() {
		return upf;
	}

	public void setUpf(boolean upf) {
		this.upf = upf;
	}

	public boolean isUps() {
		return ups;
	}

	public void setUps(boolean ups) {
		this.ups = ups;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Map<String, Object> sessionMap = ActionContext.getContext().getSession();
		//先判断登陆状态
		if(sessionMap.get("state")==null&&sessionMap.get("state").equals("")){
			return ERROR;
		}
		
		//再判断是否有管理员权限
		if(sessionMap.get("U_P_S").equals("true")){
			UsersService usersService = new UsersService();
			Long username = Long.parseLong(uid);
			upw = new MD5().encryptPassword(upw);
			if(usersService.addUser(username, upw, uname, uemail, uphone, upt, upc, upb, upf, ups)){
				return SUCCESS;
			}
		}
		return ERROR;
	}
	
}
