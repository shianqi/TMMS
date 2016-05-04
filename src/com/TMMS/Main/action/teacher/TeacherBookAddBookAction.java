package com.TMMS.Main.action.teacher;

import com.TMMS.Main.service.UsersService;
import com.opensymphony.xwork2.ActionSupport;

public class TeacherBookAddBookAction extends ActionSupport{
	private String BName;
	private String BAuthor;
	private Long BPrice;
	private String BIsbn;
	private String BPress;
	private String BOrder;
	private String BPlan;
	private String BBorders;
	private String BGrand;
	
	public String getBName() {
		return BName;
	}

	public void setBName(String bName) {
		BName = bName;
	}

	public String getBAuthor() {
		return BAuthor;
	}

	public void setBAuthor(String bAuthor) {
		BAuthor = bAuthor;
	}

	public Long getBPrice() {
		return BPrice;
	}

	public void setBPrice(Long bPrice) {
		BPrice = bPrice;
	}

	public String getBIsbn() {
		return BIsbn;
	}

	public void setBIsbn(String bIsbn) {
		BIsbn = bIsbn;
	}

	public String getBPress() {
		return BPress;
	}

	public void setBPress(String bPress) {
		BPress = bPress;
	}

	public String getBOrder() {
		return BOrder;
	}

	public void setBOrder(String bOrder) {
		BOrder = bOrder;
	}

	public String getBPlan() {
		return BPlan;
	}

	public void setBPlan(String bPlan) {
		BPlan = bPlan;
	}

	public String getBBorders() {
		return BBorders;
	}

	public void setBBorders(String bBorders) {
		BBorders = bBorders;
	}

	public String getBGrand() {
		return BGrand;
	}

	public void setBGrand(String bGrand) {
		BGrand = bGrand;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(UsersService.haveTeacherPurview()){
			
		}
		return ERROR;
	}
	
}
