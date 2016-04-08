package com.TMMS.Main.Model;

import javax.crypto.SecretKey;

public class loginModel {
	private Integer status;
	private String errorCode;
	
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
}
