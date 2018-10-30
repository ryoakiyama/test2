package com.internousdev.dogweb.dto;

public class LoginDTO {


	private String human_id;
	private String human_pass;
	private boolean loginFlg;
	public boolean getLoginFlg() {
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}
	public String getHuman_id() {
		return human_id;
	}
	public void setHuman_id(String human_id) {
		this.human_id = human_id;
	}
	public String getHuman_pass() {
		return human_pass;
	}
	public void setHuman_pass(String human_pass) {
		this.human_pass = human_pass;
	}

}
