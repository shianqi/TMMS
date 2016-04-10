package com.TMMS.Main.Model;

import javax.crypto.SecretKey;

public class LoginModel {
	private Integer status;
	private String errorCode;
	private long u_state;
	private long u_state_teacher;
	private long u_state_college;
	private long u_state_book;
	private long u_state_financial;
	private long u_state_system;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public long getU_state() {
		return u_state;
	}
	public void setU_state(long u_state) {
		this.u_state = u_state;
	}
	public long getU_state_teacher() {
		return u_state_teacher;
	}
	public void setU_state_teacher(long u_state_teacher) {
		this.u_state_teacher = u_state_teacher;
	}
	public long getU_state_college() {
		return u_state_college;
	}
	public void setU_state_college(long u_state_college) {
		this.u_state_college = u_state_college;
	}
	public long getU_state_book() {
		return u_state_book;
	}
	public void setU_state_book(long u_state_book) {
		this.u_state_book = u_state_book;
	}
	public long getU_state_financial() {
		return u_state_financial;
	}
	public void setU_state_financial(long u_state_financial) {
		this.u_state_financial = u_state_financial;
	}
	public long getU_state_system() {
		return u_state_system;
	}
	public void setU_state_system(long u_state_system) {
		this.u_state_system = u_state_system;
	}
}
